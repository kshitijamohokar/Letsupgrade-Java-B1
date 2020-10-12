/* Questions 1:
Take 5 subjects marks each subject 100 marks;
calculate the percentage;
based on the percentage print the grade and the percentage. 
*/


package com.student;
import java.util.Scanner;

public class Grade {

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  double per;
  int phy, che, bio, math, comp, tot;
  System.out.println("Enter marks of physics :");
  phy=sc.nextInt();
  System.out.println("Enter marks of chemistry :");
  che=sc.nextInt();
  System.out.println("Enter marks of biology :");
  bio=sc.nextInt();
  System.out.println("Enter marks of mathematics :");
  math=sc.nextInt();
  System.out.println("Enter marks of computer :");
  comp=sc.nextInt();
  tot=phy+che+bio+math+comp;
  per=tot/5;
  System.out.println("Total marks:" + tot);
  System.out.println("percentage:" + per);
  if(per>=80)
  System.out.println("Grade A");
  else if(per>=70 && per<80)
  System.out.println("Grade B");
  else if(per>=60 && per<70)
  System.out.println("Grade C");
  else if(per>=50 && per<60)
  System.out.println("Grade D");
  else if(per>=40 && per<50)
  System.out.println("Grade E");
  else
  System.out.println("Fail");

  }
}


