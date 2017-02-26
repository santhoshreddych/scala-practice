package com.scala.practice

object primeornot extends App {
  
  val y= (x:Int)=>{
    var counter=0;
    for(i<- 2 to x-1){
      if(x % i == 0) 
        counter+=1
    }
    if(counter >0) x+" is not prime"
    else x+" is prime"
  }
  
 
  println((2 to 10).map(y));
  
}