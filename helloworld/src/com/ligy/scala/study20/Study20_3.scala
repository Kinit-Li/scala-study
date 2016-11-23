package com.ligy.scala.study20

import scala.io.Source

object Study20_3 {
  def main(args: Array[String]) {
      println("文件内容为:" )

      Source.fromFile("test.txt" ).foreach{ 
         print;
      }
   }
}