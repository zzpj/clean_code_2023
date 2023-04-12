package pl.zzpj.examples;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IfElseBlocksRemoverTest {

    IfElseBlocksRemover sut;

    @BeforeEach
    public void setUp() {
        sut = new IfElseBlocksRemover();
    }

    @ParameterizedTest
    @MethodSource("testData")
    void getValueExpression(Object value, String expectedResult) {
        String actualResult = sut.getValueType(value);
        assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.arguments("String", "\"String\""),
                Arguments.arguments('R', "\'R\'"),
                Arguments.arguments(200L, "200L"),
                Arguments.arguments(Double.NaN, "java.lang.Double.NaN"),
                Arguments.arguments(Float.NaN, "java.lang.Float.NaN"),
                Arguments.arguments(1.0d / 0.0, "java.lang.Double.POSITIVE_INFINITY"),
                Arguments.arguments(-1.0d / 0.0, "java.lang.Double.NEGATIVE_INFINITY"),
                Arguments.arguments(1.0f / 0.0f, "java.lang.Float.POSITIVE_INFINITY"),
                Arguments.arguments(-1.0f / 0.0f, "java.lang.Float.NEGATIVE_INFINITY"),
                Arguments.arguments(123.3d, "123.3"),
                Arguments.arguments(123.3f, "123.3")
        );
    }
}
