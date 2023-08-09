package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNumberOfStations() {
        Radio radio = new Radio(12);

        Assertions.assertEquals(12, radio.getCurrentNumberOfStations());
    }

    @Test
    public void checkDefaultNumberOfStations() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getCurrentNumberOfStations());
    }

    @Test
    public void sholdSetCustomLimitStation() {
        Radio radio = new Radio(0, 9, 0, 100, 9);

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLowerLimitCustomStation() {
        Radio radio = new Radio(0, 20, 0, 100, 21);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLowerLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowLowerLimitCustomStation() {
        Radio radio = new Radio(0, 20, 0, 100, 21);

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowLowerLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveLowerLimitCustomStation() {
        Radio radio = new Radio(0, 20, 0, 100, 21);

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveLowerLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUpperLimitCustomStation() {
        Radio radio = new Radio(0, 20, 0, 100, 21);

        radio.setCurrentStation(20);

        int expected = 20;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUpperLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TryToSetAboveUpperLimitCustomStation() {
        Radio radio = new Radio(0, 20, 0, 100, 21);

        radio.setCurrentStation(21);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TryToSetAboveUpperLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TryToSetBelowUpperLimitCustomStation() {
        Radio radio = new Radio(0, 20, 0, 100, 21);

        radio.setCurrentStation(19);

        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TryToSetBelowUpperLimitStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncorrectStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-4);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCustomStation() {
        Radio radio = new Radio(0, 15, 0, 100, 16);

        radio.setCurrentStation(11);
        radio.next();

        int expected = 12;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCustomStationFromZero() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationFromZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCustomStationFromOne() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentStation(1);
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationFromOne() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCustomStationFromMax() {
        Radio radio = new Radio(0, 40, 0, 100, 41);

        radio.setCurrentStation(40);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationFromMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCustomStationFromTen() {
        Radio radio = new Radio(0, 11, 0, 100, 12);

        radio.setCurrentStation(10);
        radio.next();

        int expected = 11;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationFromEight() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCustomStation() {
        Radio radio = new Radio(0, 15, 0, 100, 16);

        radio.setCurrentStation(14);
        radio.prev();

        int expected = 13;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCustomStationFromMin() {
        Radio radio = new Radio(0, 49, 0, 100, 50);

        radio.setCurrentStation(0);
        radio.prev();

        int expected = 49;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationFromMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationFromOne() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCustomStationFromOne() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationFromMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCustomStationFromMax() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentStation(100);
        radio.prev();

        int expected = 99;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    //  Volume

    @Test
    public void shouldSetMinCustomVolume() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TryToSetMaxCustomVolume() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TryToSetBelowMaxLimitCustomVolume() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TryToSetAboveMinLimitCustomVolume() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TryToSetAboveMaxLimitCustomVolume() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TryToSetBelowMinLimitCustomVolume() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCustomVolume() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentVolume(59);
        radio.increaseVolume();

        int expected = 60;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseToMaxCustomVolume() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TryToIncreaseMaxCustomVolume() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCustomVolume() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentVolume(51);
        radio.decreaseVolume();

        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseFromMaxCustomVolume() {
        Radio radio = new Radio(0, 100, 0, 100, 101);

        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TryToDecreaseMinCustomVolume() {
        Radio radio = new Radio(0, 101, 0, 100, 101);

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
