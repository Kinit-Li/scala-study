package com.ligy.scala.study20

import java.io._

object Study20_1 {
  def main(args: Array[String]) {
      val writer = new PrintWriter(new File("test.txt" ))

      writer.write("菜鸟教程")
      writer.close()
   }
}