package com.scala.practice.basic

object Anagram {
  def main(args:Array[String]){
    println(isAnagram("sss", "sss"));
  }
  def isAnagram(a:String,b:String):Boolean={
  val chararray= a.toCharArray();
    val chararray2= b.toCharArray();

  val x=chararray.groupBy { x => x }.mapValues { x => x.length }
  val y=chararray2.groupBy { x => x }.mapValues { x => x.length }
  val s=x.toSeq;
  val p=y.toSeq;
  s.map(println)
    p.map(println)

  val yy=(x.toSeq diff y.toSeq).toMap;
  if (yy.size == 0)
  true
  else
    false
}
}