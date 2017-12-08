package anotasidantest;

import java.util.Date;

public class Employee {
    private String name;
    private double salary;
    private Date dateOfBirth;

    public Employee(String name, double salary, Date dateOfBirth) {
        this.name = name;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
    public double calculateSalaryWithBonus(){
        //disini ada logic
        return this.salary+1000;
    }
     public double calculateSalaryWithBonus(double d) {
     return (this.salary*d) + this.salary;  
     }
   
// 
}
