package com.company;

import com.company.WorkerClasses.EngineerWorker;
import com.company.WorkerClasses.SalesmanWorker;
import com.company.WorkerClasses.Worker;

public class Main {

    public static void main(String[] args) {

        EngineerWorker worker1 = new EngineerWorker("Slava", Worker.Positions.ENGINEER, 50, 40000, "Volleyball");
        EngineerWorker worker12 = new EngineerWorker("Slava", Worker.Positions.ENGINEER, 50, 40099, "Volleyball");
        SalesmanWorker worker2 = new SalesmanWorker("Ivan", Worker.Positions.SALESMAN, 30, 25000);

        System.out.println(worker1.getSalary());
        System.out.println(worker2.getSalary());

        worker1.fixSomething();
        worker2.sellSomething();

        System.out.println(worker1.getPosition());
        System.out.println(worker2.getPosition());

        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker1.equals(worker12));

        System.out.println(worker1.hashCode());
        System.out.println(worker12.hashCode());


    }
}
