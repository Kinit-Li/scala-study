package com.ligy.scala.study3

import java.util.Date
import java.text.SimpleDateFormat

object Study3 {
    def main(args: Array[String]) {
        var myVar : String = "Foo"
        println(myVar)
        myVar = "Too"
        println(myVar)
        
        val myVal = "aa"
        println(myVal)
        
        var variableName : Date = new Date()
        
        var sdf : SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        
        println(sdf.format(variableName))
        
        val xmax, ymax = 100
        
        println(xmax + ":" + ymax)
        
        val (myVar1: Int, myVar2: String) = Pair(40, "Foo")
        val (myVar3, myVar4) = Pair(40, "Foo")
        
        println(myVar1 + ":" + myVar2)
        println(myVar3 + ":" + myVar4)
    }
}