package com.employee;

public class EmployeeDemo {

  public static void main(String[] args) {
  Employee e1=new Employee();
  Employee e2=new Employee();
  e1.name="Kshitija";
  e1.age=25;
  e1.city="Pune";
  e2.name="Riya";
  e2.age=30;
  e2.city="Mumbai";
  
  e1.display();
  e2.display();
   
  }
}
