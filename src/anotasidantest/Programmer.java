/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotasidantest;

import java.util.Date;


/**
 *
 */@Indocyber(namaClass = "Boot", year = 2017)

 
public class Programmer extends Employee {

    
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

    @Override
    public String toString() {
        return "Programmer" +getName(); //To change body of generated methods, choose Tools | Templates.
    }
       
       

    
    
}
