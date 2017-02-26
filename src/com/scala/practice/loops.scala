package com.scala.practice

object loops extends App {
  
    private var a=0;
    val numList=List(1,2,3,4,5,6);
    val tabulateList = List.tabulate(5){a=>a*3}    
    val compList=List.concat(numList,tabulateList)
    for(i<-compList){println("value of i is " +i)}
  
}