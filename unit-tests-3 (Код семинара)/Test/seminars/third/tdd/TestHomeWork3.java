package seminars.third.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestHomeWork3 {

    @ParameterizedTest
    @ValueSource(ints = {4, 0, -6})
    void evenNumberTrue(int num) {
        assertTrue(MainHW.evenOddNumber(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, -19})
    void oddNumberTrue(int num) {
        assertFalse(MainHW.evenOddNumber(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {20, 101})
    void incorrectNumber(int num) {
        assertFalse(MainHW.numberInRange(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {35, 99})
    void correctNumber(int num) {
        assertTrue(MainHW.numberInRange(num));
    }
}
