/*Questions 2:
Create an int array with 5 values and print only odd values.
*/

package com.example;

public class OddArray {

  public static void main(String[] args) {
  
  int[] num= new int[5];
  num[0]=2;
  num[1]=5;
  num[2]=6;
  num[3]=9;
  num[4]=11;
  
  System.out.println("Odd Numbers is:");
  for(int i=0;i<5;i++) {
    if(num[i]%2!=0) {
      System.out.println(num[i]);
    }
  } 
   
  }
}
