/*
 * Author: 
 * Given an integer array find the distance find the index that ranges between minimum and maximum value of Array and that has the maximum distance from all the array elements. 
 * 
 * 
 */




package com.scala.practice.basic


object CycleProblem {
  def main(args: Array[String]){
    val input:Array[Int]=Array(-1000,1000,-30,70,80,20,100,110,-120,-180,120)
    val minVal=input.reduceLeft(_ min _)
    val maxVal=input.reduceLeft(_ max _)
    var maxDistance=0
    var index=minVal-1;
    for(i<-minVal to maxVal){
      var distance =0
      for(j<-0 to input.length-1){
        distance=distance+Math.abs(i-input(j))
      }
      if(distance > maxDistance) 
        {
        maxDistance=distance
        index=i
        }
    }
    println("Park the bicycle in this location:"+ index+ " the distance(maximum when compared to to other indices) from all other parked location is: "+maxDistance + "");

  }
}