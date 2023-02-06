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
            "17, 17",
            "29, 29",
            "30, 0",
            "-1, 0"
    })
    // выбор станции когда количество станций задано пользователем
    public void stationSelectionWhenTheNumberIsSetByTheUser(int set, int expected) {
        Radio radio = new Radio(30);
        radio.setCurrentStation(set);

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }


    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "4, 4",
            "9, 9",
            "10, 0",
            "-1, 0"
    })
    // выбор станции когда количество по умолчанию
    public void stationSelectionWhenQuantityIsStandard(int set, int expected) {
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
    // следующая станция, когда количество по умолчанию
    public void nextStationWhenQuantityIsStandard(int current, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(current);

        Assertions.assertEquals(expected, radio.next());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 2",
            "13, 14",
            "28, 29",
            "29, 0"
    })
    // следующая станция, когда количество станций задает пользователь
    public void nextStationWhenTheNumberIsSetByTheUser(int current, int expected) {
        Radio radio = new Radio(30);
        radio.setCurrentStation(current);

        Assertions.assertEquals(expected, radio.next());
    }


    @ParameterizedTest
    @CsvSource({
            "0, 9",
            "9, 8",
            "6, 5",
            "1, 0"
    })
    // предыдущая станция, когда количество по умолчанию
    public void prevStationWhenQuantityIsStandard(int current, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(current);

        Assertions.assertEquals(expected, radio.prev());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 29",
            "29, 28",
            "16, 15",
            "1, 0"
    })
    // пред. станция, когда количество задает пользователь
    public void prevStationWhenTheNumberIsSetByTheUser(int current, int expected) {
        Radio radio = new Radio(30);
        radio.setCurrentStation(current);

        Assertions.assertEquals(expected, radio.prev());
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "10, 11",
            "99, 100",
            "100, 100"
    })
    public void volumeUp(int vol, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(vol);

        Assertions.assertEquals(expected, radio.volumeUp());
    }
    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 0",
            "11, 10",
            "100, 99"
    })
    public void volumeDown(int vol, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(vol);

        Assertions.assertEquals(expected, radio.volumeDown());
    }
}

