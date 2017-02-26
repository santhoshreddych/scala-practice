package com.scala.practice

class Node1(var data:Char) {
var item:Char=data
var next1:Node1=null

}

object LinkedListCompare {
 def main(args: Array[String]){
   //declare first linked list
  val node1 =new Node1('a');
  val second = new Node1('b')
  val third = new Node1('c')
  node1.next1=second;
  second.next1=third;
  var head1=node1
  //declare second linked list
  
  val node2 =new Node1('a');
  val second2 = new Node1('b')
  val third2 = new Node1('d')
  node2.next1=second2;
  second2.next1=third2;
  var head2=node2
println(compare(head1,head2))
}
 def compare(head1:Node1,head2:Node1){
   var temp1=head1;
   var temp2=head2;
   if(temp1==null && temp2==null){
     0
   }
   while(temp1!=null && temp2!=null && temp1.data==temp2.data){
     temp1=temp1.next1;
     temp2=temp2.next1;
   }
 if(temp1!=null && temp2!=null){
   
 }
 }
}