/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotasidantest;

import java.util.Date;


/**
 *
 * @author user
 */
public class Programmer extends Employee {
//@Indocyber(namaclass = "Boot", year = 2017)

    
    public Programmer() {
    
    }
    public Programmer(String name, double salary, Date dateOfBirth){
        super(name,salary,dateOfBirth);
    }
    
    
    @Override
       public double calculateSalaryWithBonus(){
//disini ada logic
        return  1000;
    }

    
    
}
