package com.ligy.scala.study18

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Study18_1 {
  def main(args: Array[String]) {
      try {
         val f = new FileReader("input.txt")
      } catch {
         case ex: FileNotFoundException =>{
            println("Missing file exception")
         }
         case ex: IOException => {
            println("IO Exception")
         }
      }
   }
}