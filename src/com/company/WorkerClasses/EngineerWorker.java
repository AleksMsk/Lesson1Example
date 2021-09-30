package com.company.WorkerClasses;

import com.company.ExtraUtils.Promotion;

import java.util.Objects;

public class EngineerWorker extends Worker implements Promotion {

    private int finishedFixes;

    public EngineerWorker(String name, Positions position, int age, int salary) {
        super(name, position, age, salary);
        finishedFixes = 0;
    }

    public EngineerWorker(String name, Positions position, int age, int salary, String interest) {
        super(name, position, age, salary, interest);
        finishedFixes = 0;
    }

    public void fixSomething(){
        System.out.println("Fixed something");
    }

    @Override
    public double giveBonus() {
        return getSalary() * 2;
    }

    @Override
    public void giveNextPosition() {

    }

    @Override
    public void giveLowerPosition() {

    }

    @Override
    public boolean equals(Object o) {
        EngineerWorker secondEngineer = (EngineerWorker) o;
        int salary = secondEngineer.getSalary();
        return this.getSalary() > salary;
    }

    @Override
    public int hashCode() {
        int ageToFix = this.getAge();
        int salaryToFix = this.getSalary();
        String result = String.valueOf(salaryToFix).substring(0, 3) + String.valueOf(ageToFix).substring(0, 2);
        return Integer.parseInt(result);
    }

}
