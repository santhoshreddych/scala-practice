package com.scala.practice.basic

object sumCubes extends App {
  def product(f:Int => Int) (a:Int,b:Int):Int =
    if (a>b) 1
    else f(a) * product(f)(a+1,b)
    
  printf("final output is: "+ product(x=>x*x*x)(2,5)+"\n") //sum cubes
  printf("final output is: "+ product(x=>x*x)(2,5)+"\n") //sum squares
  printf("final output is: "+ product(x=>x)(2,5)+"\n") //sum cubes

  def fact(n:Int)=product(x=>x)(1,n);
  printf("factorial is: "+fact(6));
  
}