package com.scala.practice

object maxlength extends App{
 
val cats = List("Tiger", "Lion", "Puma", "Leopard",
                  "Jaguar", "Cheetah", "Bobcat")
val groupedByLength = cats.groupBy(_.length)
val maxlength=groupedByLength.keySet.max;
println(maxlength);
println("elements are:" + groupedByLength.get(maxlength))
}