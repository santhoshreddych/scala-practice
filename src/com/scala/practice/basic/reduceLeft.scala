package com.scala.practice.basic

object reduceLeft extends App {
  val a = Array(4,7,1,8,9,55,77,100,66,77)
  println(a.reduceLeft(_ min _))
  
}