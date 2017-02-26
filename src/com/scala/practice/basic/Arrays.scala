package com.scala.practice.basic

import java.io._

object Demo {
   def main(args: Array[String]) {
      var array1 = new Array[Integer](3);
      var array2 = Array.range(8,9,0);
      array1(0) =1;
      array1(1) =2;
      array1
      for(x<-0 to array2.length-1){
        println(array2(x));
      }
   }
}