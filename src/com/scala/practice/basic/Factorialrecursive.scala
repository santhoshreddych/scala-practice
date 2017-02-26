package com.scala.practice.basic

object Factorialrecursive extends App{
  def fact(x:Int):Int={
    if(x==0) 
      1
    else
    {
    x*fact(x-1);
  }
  }
  println(fact(6));
}