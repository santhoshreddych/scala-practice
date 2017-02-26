package com.scala.practice.linkedlist

class Node(var data:Int) {
var item:Int=data
var next1:Node=null

}
 object linkedlist {
def main(args: Array[String]){
  val node1 =new Node(1);
  val second = new Node(2)
  val third = new Node(3)
  node1.next1=second;
  second.next1=third;
  var head=node1
while (head!=null){
  println(head.data);
  head=head.next1
}  
}
}