package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio myRadio = new Radio();
    Radio newRadio = new Radio(30);

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
    void shouldMaxStation30() {
        int expected = 30;
        int actual = newRadio.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMaxStation() {
        newRadio.setMaxStation(15);
        int expected = 15;
        int actual = newRadio.getMaxStation();
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
    void shouldNextStationMaxStation30() {
        newRadio.setStation(25);
        newRadio.nextStation();
        int expected = 26;
        int actual = newRadio.getStation();
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
    void shouldNextStationUpperLimitMaxStation30() {
        newRadio.setStation(29);
        newRadio.nextStation();
        int expected = 0;
        int actual = newRadio.getStation();
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
    void shouldPrevStationMaxStation30() {
        newRadio.setStation(17);
        newRadio.prevStation();
        int expected = 16;
        int actual = newRadio.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationUnderLimit() {
        myRadio.prevStation();
        int expected = 9;
        int actual = myRadio.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationUnderLimitMaxStation30() {
        newRadio.prevStation();
        int expected = 29;
        int actual = newRadio.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeUpperLimit() {
        newRadio.setVolume(115);
        int expected = 100;
        int actual = newRadio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeUnderLimit() {
        newRadio.setVolume(-3);
        int expected = 0;
        int actual = newRadio.getVolume();
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
        myRadio.setVolume(100);
        myRadio.increaseVolume();
        int expected = 100;
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