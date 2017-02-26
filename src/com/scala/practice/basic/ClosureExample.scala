package com.scala.practice.basic

object ClosureExample extends App{
  var hello = "Hello"
    def sayHello(name: String) { println(s"$hello, $name") }

    // execute sayHello from the exec method foo
    val foo = new com.scala.practice.basic.Foo
    foo.exec(sayHello, "Al")

    // change the local variable 'hello', then execute sayHello from
    // the exec method of foo, and see what happens
    hello = "Hola"
    foo.exec(sayHello, "Lorenzo")
}

    class Foo {
        // a method that takes a function and a string, and passes the string into
        // the function, and then executes the function
        def exec(f:(String) => Unit, name: String) {
          println("hello");
            f(name)
        }
    }
