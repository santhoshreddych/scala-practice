package com.scala.practice
import scala.collection.immutable.ListMap
object WordCount extends App {
  val inputLine = io.Source.fromFile("/Users/santhoshreddychintala/Documents/Happy/Interview/Scala/wordcount").getLines.toList
  val wordsList= inputLine.flatMap { x => x.split(' ') }
  val finalOutput= wordsList.groupBy { x => x }.mapValues { y=>y.length }
 val outn=ListMap(finalOutput.toSeq.sortWith (_._2 > _._2):_*) 
 outn.map(println)
}