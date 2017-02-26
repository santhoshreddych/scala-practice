package com.scala.practice

object MapPractice extends App {
  val inputMap= Map(1->"santhosh",2->"Rahul",3->"Sahu",4->"Raj",4->"prakash");
  val evenMap = scala.collection.mutable.Map[Int, String]()
  for((k,v)<-inputMap){printf("Key is: "+k+" value is:"+v+"\n");}
inputMap.keys.foreach ( x => 
  if(x%2==0)
   evenMap += (x->inputMap.get(x).toString()))
  
 evenMap foreach(x=>println("value is: "+x._1.toString()+ " other value is: "+ x._2.toString()+"\n"))
}