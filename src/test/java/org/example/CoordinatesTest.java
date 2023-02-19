package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    @Test
    void moveUUU() {
        Coordinates getCoordinates = new Coordinates();
        assertEquals("[0, 3]", Arrays.toString(getCoordinates.move("UUU")));
    }

    @Test
    void moveURDL() {
        Coordinates getCoordinates = new Coordinates();
        assertEquals("[0, 0]", Arrays.toString(getCoordinates.move("URDL")));
    }

    @Test
    void moveUUDRLLRD() {
        Coordinates getCoordinates = new Coordinates();
        assertEquals("[0, 0]", Arrays.toString(getCoordinates.move("UUDRLLRD")));
    }

    @Test
    void moveInWords() {
        Coordinates getCoordinates = new Coordinates();
        assertEquals("[0, -1]", Arrays.toString(getCoordinates.move("Up Down Left 2xRight Down")));
    }
}