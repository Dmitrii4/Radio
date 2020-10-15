package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void getNumberstationAndsetNumberstation() {
        Radio Radio = new Radio();
        Radio.setMinstation(0);
        Radio.setMaxstation(9);
        Radio.setNumberstation(3);
        assertEquals(3, Radio.getNumberstation());

    }

    @Test
    void getMinstationAndsetMinstation() {
        Radio Radio = new Radio();
        Radio.setMinstation(0);
        assertEquals(0, Radio.getMinstation());
    }

    @Test
    void getMaxstationsetMaxstation() {
        Radio radioman = new Radio();
        radioman.setMaxstation(9);
        assertEquals(9, radioman.getMaxstation());
    }

    @Test
    void getSoundAndsetSound() {
        Radio Radio = new Radio();
        Radio.setMinsound(0);
        Radio.setMaxsound(10);

        Radio.setSound(5);
        assertEquals(5, Radio.getSound());
    }

    @Test
    void getMinsoundAndsetMinsound() {
        Radio Radio = new Radio();
        Radio.setMinsound(0);
        assertEquals(0, Radio.getMinsound());
    }

    @Test
    void getMaxsound() {
        Radio radioman = new Radio();
        radioman.setMaxsound(10);
        assertEquals(10, radioman.getMaxsound());
    }

    @Test
    void setNumberstation() {
        Radio Radio = new Radio();
        Radio.setMaxstation(9);
        Radio.setMinstation(0);
        Radio.setNumberstation(10);
        assertEquals(0, Radio.getMinstation());

        Radio.setMaxstation(9);
        Radio.setMinstation(0);
        Radio.setNumberstation(-1);
        assertEquals(9, Radio.getMaxstation());

        Radio.setMinstation(0);
        Radio.setNumberstation(-1);
        assertEquals(0, Radio.getMinstation());


    }

    @Test
    void setSound() {
        Radio Radio = new Radio();
        Radio.setMaxsound(10);
        Radio.setSound(11);
        assertEquals(10, Radio.getMaxsound());

        Radio.setMinsound(0);
        Radio.setSound(-1);
        assertEquals(0, Radio.getSound());
    }
}