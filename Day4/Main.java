package com.example;

public class Main {

  public static void main(String[] args) {
  Avenger[] array=new Avenger[5];
  
  //creating objects & get details
  for(int i=0;i<5;i++) {
  array[i]=new Avenger();
  array[i].getDetails();
  } 
  
  
  //print details
  for(int i=0;i<5;i++) {
   array[i].displayDetails();
  }  
   
  }
}

