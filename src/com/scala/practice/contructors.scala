package com.scala.practice

object contructors extends App {
  
}

class person{
var age:Int=0;
var name:String="";
println("Entering the primary constructors");
def this(age:Int, name:String){
  this();
println("Entering the auxilary constructors")
this.age=age;
this.name=name;

}
  
}
object execute extends App{
  val person1 = new person;
  println("value of person1 is: "+person1.age);
  val person2 = new person(10,"Santhosh");
    println("value of person2 is: "+person2.name);

}

