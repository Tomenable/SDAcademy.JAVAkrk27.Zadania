package pl.sdacademy.java.krk27.exercises.ex28;

import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EveryNthElementTest {
    EveryNthElement<String> test;
    String[] shouldBe;

    @BeforeEach
    void setUp() {
        test = new EveryNthElement<>();
        test.addAll(List.of("a","b","c","d","e","f","g"));
        shouldBe = new String[]{"c","g"};
    }

    @org.junit.jupiter.api.Test
    void getEveryNthElement() {
        //when
        List<String> result = test.getEveryNthElement(2, 3);

        //then
        assertArrayEquals(shouldBe,result.toArray());
    }

    @org.junit.jupiter.api.Test
    void getEveryNthElementStream() {

        //when
        List<String> result = test.getEveryNthElementStream(2, 3);

        //then
        assertArrayEquals(shouldBe,result.toArray());
    }
}