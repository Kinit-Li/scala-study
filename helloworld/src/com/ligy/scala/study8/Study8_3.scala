package com.ligy.scala.study8

object Study8_3 {
  def main(args: Array[String]) {
        println( "Returned Value : " + addInt(5,7) );
        println("Study8_1 : " + Study8_1.addInt(3, 6));
        println("Study8_2 : " + Study8_2.printMe());
   }
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
}