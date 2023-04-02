package pl.zzpj.examples;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
        String actualResult = sut.getValueExpression(value);
        assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.arguments("String", "\"String\""),
                Arguments.arguments('R', "\'R\'"),
                Arguments.arguments(200L, "200L")
                //TODO
        );
    }
}