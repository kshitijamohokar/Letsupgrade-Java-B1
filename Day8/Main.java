/* Question 3.
In main method create an array of object of for three three of them get the details and print for all the objects. 
*/

package com.example;

public class Main {

  public static void main(String[] args) {
  
   
   Doctor[] d=new Doctor[3] ;
   System.out.println("For Doctors   ");
   for(int i=0;i<3;i++)
   {
     d[i]=new Doctor();
     d[i].getdetails();
     d[i].getproperties();
   }
   for(int i=0;i<3;i++){
     d[i].displaydetails();
     d[i].displayproperties();
     
   }
    Engineer[] e=new Engineer[3];
    System.out.println("For engineers ");
    for(int i=0;i<3;i++){
      e[i]=new Engineer();
     e[i].getdetails();
     e[i].getproperties();
     
    }
    for(int i=0;i<3;i++){
    e[i].displaydetails();
    e[i].displayproperties();
    
    }
    Pilot[] p=new Pilot[3];
    System.out.println("For pilots ");
    for(int i=0;i<3;i++)
    {
      p[i]=new Pilot();
      p[i].getdetails();
      p[i].getproperties();
      
    }
    for(int i=0;i<3;i++){
      p[i].displaydetails();
      p[i].displayproperties();
    }
}
}
   
 

