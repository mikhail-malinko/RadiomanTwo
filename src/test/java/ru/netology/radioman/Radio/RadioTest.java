package ru.netology.radioman.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "4, 4",
            "8, 8",
            "9, 9",
            "10, 0",
            "-1, 0"
    })
    public void stationByNumber(int set, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(set);

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }
    @ParameterizedTest
    @CsvSource({
            "3, 4",
            "8, 9",
            "9, 0",
            "0, 1",
    })
    public void nextStation(int current, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(current);

//        int expected = 4;
//        int actual = radio.next();

        Assertions.assertEquals(expected, radio.next());
    }
    @ParameterizedTest
    @CsvSource({
            "0, 9",
            "9, 8",
            "6, 5",
            "1, 0"
    })

    public void prevStation(int current, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(current);

        Assertions.assertEquals(expected, radio.prev());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "3, 4",
            "9, 10",
            "10, 10"
    })
    public void volumeUp(int vol, int expected) {
        Radio radio = new Radio();
        radio.setVolume(vol);
        radio.volumeUp();

        Assertions.assertEquals(expected, radio.getVolume());
    }
    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 0",
            "2, 1",
            "10, 9"
    })
    public void volumeDown(int vol, int expected) {
        Radio radio = new Radio();
        radio.setVolume(vol);
        radio.volumeDown();

        Assertions.assertEquals(expected, radio.getVolume());
    }
}

