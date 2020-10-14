/* Questions 1:
create a class avenger with
properties (name,age,power,weapon,planet) and with
functions-getDetails() and displayDetails().
create 5 objects as an array in the main method and call.
*/


package com.example;
import java.util.Scanner;

public class Avenger {
String name, power, weapon, planet;
int age;
Scanner sc =new Scanner(System.in);

public void getDetails() {
  System.out.println("Enter name:");
  name=sc.nextLine();
  System.out.println("Enter age:");
  age=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter power:");
  power=sc.nextLine();
  System.out.println("Enter weapon:");
  weapon=sc.nextLine();
  System.out.println("Enter planet:");
  planet=sc.nextLine();
}

public void displayDetails() {
  System.out.println("Your name is:" +name);
  System.out.println("Your age is:" +age);
  System.out.println("Your power is:" +power);
  System.out.println("Your weapon is:" +weapon);
  System.out.println("Your planet is:" +planet);
}

}
