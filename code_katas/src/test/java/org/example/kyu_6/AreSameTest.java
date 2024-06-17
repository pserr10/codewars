package org.example.kyu_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreSameTest {

    private AreSame areSame;

    @BeforeEach
    void setUp() {
        areSame = new AreSame();
    }

    @Test
    void comp() {
        int[] a = {2, 2, 3};
        int[] b = {4, 9, 9};
        assertEquals(false, areSame.comp(a,b));
    }
}