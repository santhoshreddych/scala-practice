package com.scala.practice

object AnagramSimple extends App{
  
  println("are Strings Anagrams? "+isPermutation("Santhosh","thshsan"))
  
  def isPermutation(candidate: String,anagram:String) = {
    println(candidate.toLowerCase.sortWith(_>_) )
    (candidate.toLowerCase != anagram.toLowerCase) &&
        (candidate.toLowerCase.sortWith(_>_) ==
            anagram.toLowerCase.sortWith(_>_))
  }
}