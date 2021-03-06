package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio myRadio = new Radio();

    @Test
    void shouldSetStation() {
        myRadio.setStation(6);
        int expected = 6;
        int actual = myRadio.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationBelowZero() {
        myRadio.setStation(-2);
        int expected = 0;
        int actual = myRadio.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationAboveZero() {
        myRadio.setStation(15);
        int expected = 0;
        int actual = myRadio.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStation() {
        myRadio.setStation(3);
        myRadio.nextStation();
        int expected = 4;
        int actual = myRadio.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationUpperLimit() {
        myRadio.setStation(9);
        myRadio.nextStation();
        int expected = 0;
        int actual = myRadio.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStation() {
        myRadio.setStation(5);
        myRadio.prevStation();
        int expected = 4;
        int actual = myRadio.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationUnderLimit() {
        myRadio.setStation(0);
        myRadio.prevStation();
        int expected = 9;
        int actual = myRadio.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        myRadio.setVolume(4);
        myRadio.increaseVolume();
        int expected = 5;
        int actual = myRadio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeUpperLimit() {
        myRadio.setVolume(10);
        myRadio.increaseVolume();
        int expected = 10;
        int actual = myRadio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        myRadio.setVolume(4);
        myRadio.decreaseVolume();
        int expected = 3;
        int actual = myRadio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeUnderLimit() {
        myRadio.setVolume(0);
        myRadio.decreaseVolume();
        int expected = 0;
        int actual = myRadio.getVolume();
        assertEquals(expected, actual);
    }
}