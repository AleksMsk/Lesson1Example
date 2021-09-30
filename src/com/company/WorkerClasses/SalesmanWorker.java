package com.company.WorkerClasses;

import com.company.ExtraUtils.Bonuses;
import com.company.ExtraUtils.Promotion;

public class SalesmanWorker extends Worker implements Promotion, Bonuses {

    private int finishedSales;

    public SalesmanWorker(String name, Positions position, int age, int salary) {
        super(name, position, age, salary);
        finishedSales = 0;
    }

    public SalesmanWorker(String name, Positions position, int age, int salary, String interest) {
        super(name, position, age, salary, interest);
        finishedSales = 0;
    }

    public void sellSomething(){
        System.out.println("Sold something");
    }

    @Override
    public double giveBonus(){
        return getSalary() * 4;
    }

    @Override
    public void giveBonusForGoodJob() {

    }

    @Override
    public void giveBonusForGoodLoyalty() {

    }

    @Override
    public void giveNextPosition() {

    }

    @Override
    public void giveLowerPosition() {

    }
}
