/*Questions 3:
Create an int array of size 5, take all the values from the user, add all the values and print the sum.
*/


package com.example;
import java.util.Scanner;

public class SumOfArray {

  public static void main(String[] args) {
  
  Scanner sc =new Scanner(System.in);
  int[] array= new int[5];
  int sum=0;
  System.out.println("Enter the elements of array one by one:");
  for(int i=0;i<5;i++) {
    array[i]=sc.nextInt();
    sum=sum+array[i];
  }
  System.out.println("Sum of element is:" +sum);
   
  }
}


