package com.devon;


class Encapsulate {

    private String EmployeeName;
    private int EmployeeRoll;
    private int EmployeeAge;


    public int getAge() { return EmployeeAge; }


    public String getName() { return EmployeeName; }


    public int getRoll() { return EmployeeRoll; }


    public void setAge(int newAge) { EmployeeAge = newAge; }


    public void setName(String newName)
    {
        EmployeeName = newName;
    }


    public void setRoll(int newRoll) { EmployeeRoll = newRoll; }
}

public class encapsulation {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();


        obj.setName("Mritunjay");
        obj.setAge(22);
        obj.setRoll(747);

        System.out.println("Employee name: " + obj.getName());
        System.out.println("Employee age: " + obj.getAge());
        System.out.println("Employee roll: " + obj.getRoll());


    }
}