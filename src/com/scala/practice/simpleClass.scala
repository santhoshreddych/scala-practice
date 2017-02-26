package com.scala.practice

class simpleClass(brand:String) {
  
  val color:String = if (brand == "TI") {
    "blue" 
  }else if (brand == "HP") {
    "black"
  }
  else {"red"}
  
  val anon = (x:Int) => x+1; 
  
}