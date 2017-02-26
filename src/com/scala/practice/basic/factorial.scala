package com.scala.practice.basic

object factorial extends App{
  val x =5
  var y=1;
  for (i<- 1 to x) {
    y=i*y
  }
  println("factorial of x is: "+y)
}