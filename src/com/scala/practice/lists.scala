package com.scala.practice

object lists extends App {
  val intList=List(1,5,7,9);
  val secondList=List(6,7,10);
  val thirdList=List(11,15,20);
  val partitioned=intList.partition { x => x<5 }
  println("##################");
  println("List is: "+intList);
  println("complete List is: "+intList::secondList::thirdList);
  println("complete List is: "+(intList:::secondList:::thirdList));
  println("partitioned is:"+partitioned) 
  
  partitioned._1.foreach { x => println(x) }
  partitioned._2.foreach { x => print(x) }



  
}