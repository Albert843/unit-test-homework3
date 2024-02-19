package hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;
import static org.assertj.core.api.Assertions.*;

public class MainHWTest {
    MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @Test
    void isEvenNumber() {
        assertThat(mainHW.isEvenOddNumber(10)).isTrue();
    }

    @Test
    void isOddNumber() {
        assertThat(mainHW.isEvenOddNumber(1)).isFalse();
    }

    @Test
    void numberInInterval() {
        assertThat(mainHW.numberInInterval(25)).isTrue();
        assertThat(mainHW.numberInInterval(100)).isTrue();
    }

    @Test
    void numberNotInInterval() {
        assertThat(mainHW.numberInInterval(20)).isFalse();
        assertThat(mainHW.numberInInterval(150)).isFalse();
    }

}
