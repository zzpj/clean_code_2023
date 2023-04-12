package pl.zzpj.examples;

public final class IfElseBlocksRemover {

    public String getValueType(Object value) {

        final String newExpression;

        if (value instanceof String string) {
            newExpression = '"' + string + '"';
        } else if (value instanceof Character) {
            newExpression = '\'' + value.toString() + '\'';
        } else if (value instanceof Long) {
            newExpression = value.toString() + 'L';
        } else if (value instanceof Double doubleValue) {
            newExpression = getExpressionForDouble(doubleValue);
        } else if (value instanceof Float floatValue) {
            newExpression = getExpressionForFloat(floatValue);
        } else {
            newExpression = String.valueOf(value);
        }

        return newExpression;
    }

    private static String getExpressionForFloat(Float floatValue) {
        final String newExpression;
        if (Float.isNaN(floatValue)) {
            newExpression = "java.lang.Float.NaN";
        } else if (Float.isInfinite(floatValue)) {
            if (floatValue > 0.0) {
                newExpression = "java.lang.Float.POSITIVE_INFINITY";
            } else {
                newExpression = "java.lang.Float.NEGATIVE_INFINITY";
            }
        } else {
            newExpression = Float.toString(floatValue);
        }
        return newExpression;
    }

    private static String getExpressionForDouble(Double doubleValue) {
        final String newExpression;
        if (Double.isNaN(doubleValue)) {
            newExpression = "java.lang.Double.NaN";
        } else if (Double.isInfinite(doubleValue)) {
            if (doubleValue > 0.0) {
                newExpression = "java.lang.Double.POSITIVE_INFINITY";
            } else {
                newExpression = "java.lang.Double.NEGATIVE_INFINITY";
            }
        } else {
            newExpression = Double.toString(doubleValue);
        }
        return newExpression;
    }
}