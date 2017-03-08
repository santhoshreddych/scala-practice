/*
 * Author: Santhosh Reddy Chintala
 * get the highest salary for each employee
 * 
 */

package com.master.practice.higherorderfunctions

class Person(var name:String,var salary:Int) {
  this.name=name;
  this.salary=salary
  
}

object Foldfunctions extends App{
  val person1=new Person("Harsha",300);
  val person2=new Person("Harsha",100);
  val person3=new Person("Harsha",200);
  val person4=new Person("Sri",100);
  val person5=new Person("Sri",200);
  val person6=new Person("Santhosh",500);
  val personList=List(person1,person2,person3,person4,person5,person6)
  
//val s= person1.salary
  def calMaxSalary(person1:Person,aggPerson:Person)={
    if(person1.salary>aggPerson.salary)
     person1
    else
    aggPerson
  }
 val maxSalaryPerson= personList.groupBy(person=>person.name).mapValues(_.reduceLeft(calMaxSalary)).values;
 
 maxSalaryPerson.map(f=>println("Name is:"+ f.name+ " Salary is: "+f.salary))
 //println("maximum salary name is: "+ maxSalaryPerson.name +" and his salary: "+ maxSalaryPerson.salary);
   
}
