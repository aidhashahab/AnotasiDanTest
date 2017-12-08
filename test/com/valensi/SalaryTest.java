/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import anotasidantest.Programmer;
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
public class SalaryTest {

    public SalaryTest() {
    }

    @Test
    public void calculateSalaryWithBonus() {
        Programmer p = new Programmer();
        p.setSalary(10000000);
        double gaji = p.calculateSalaryWithBonus(0.25);
        double expect = 12500000;
        assertEquals(expect, gaji, 0); // memebandingkan harapan dan aktual(gaji)
    }

    // public void hello() {}
}
