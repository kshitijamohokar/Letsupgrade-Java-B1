/* Question 2.
Create three child classes one for doctor, one for an engineer, and one for pilots and include three different operations in respective objects. 
*/

package com.example;
import java.util.Scanner;
public class Doctor extends Employee {
  Scanner sc=new Scanner(System.in);
  String hospitalname;
  String speciality;
   
  public void getproperties(){
  System.out.println("Enter hospital name ");
  hospitalname=sc.nextLine();
  System.out.println("Enter speciality");
  speciality=sc.next();
  }
  public void displayproperties(){
  System.out.println(hospitalname+" "+speciality);
  }
}


