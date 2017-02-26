package com.scala.practice

object fibonacci extends App {
  var counter =0;
 def func(f:(Int,Int)=>Int,param1:Int):Int={
   counter+=1;
   if(counter==5) {
   "1".toInt
   }
   else 
     {
     param1 + func(f,f(2,1))
     }
 }
 val incrementfunc = (x:Int,y:Int)=>x+y;

 
 println(func(incrementfunc,5));
}