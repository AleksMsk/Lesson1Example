package com.company.WorkerClasses;

public abstract class Worker {

    public enum Positions{
        ENGINEER,
        SALESMAN;

        Positions(){
            System.out.println("Позиция");
        }

        public void sayHello(){}
    }

    //public protected default private

    private String name;
    private Positions position;
    private int age;
    private int salary;
    private String interest;

    public Worker(String name, Positions position, int age, int salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
        interest = "None";
    }

    public Worker(String name, Positions position, int age, int salary, String interest) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
        this.interest = interest;
    }

    public abstract double giveBonus();


    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
