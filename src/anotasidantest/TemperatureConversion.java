/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotasidantest;

/**
 *
 * @author user
 */
public class TemperatureConversion {

    public double fToC(double f) {
        double c = 5.0 / 9 * (f - 32);
        return c;
    }

    public double cToF(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }
}
