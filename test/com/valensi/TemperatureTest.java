/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import anotasidantest.TemperatureConversion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TemperatureTest {

    public TemperatureTest() {
    }

    @Test
    public void cToF() {
        TemperatureConversion tt = new TemperatureConversion();
        double hasil = tt.cToF(72);
        double expect = 161.6;
        assertEquals(expect, hasil, 0);
    }

    @Test
    public void fToC() {
        TemperatureConversion tt = new TemperatureConversion();
        double hasil = tt.fToC(72);
        double expect = 22.2222;
        assertEquals(expect, hasil, 0.005);

    }
}
