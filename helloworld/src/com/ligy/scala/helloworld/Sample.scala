package com.ligy.scala.helloworld

/**
 * Scala 是一门多范式（multi-paradigm）的编程语言，设计初衷是要集成面向对象编程和函数式编程的各种特性。
 * Scala 运行在Java虚拟机上，并兼容现有的Java程序。
 * Scala 源代码被编译成Java字节码，所以它可以运行于JVM之上，并可以调用现有的Java类库。
 * 
 * Scala 是 Scalable Language 的简写，是一门多范式的编程语言
联邦理工学院洛桑（EPFL）的Martin Odersky于2001年基于Funnel的工作开始设计Scala。
Funnel是把函数式编程思想和Petri网相结合的一种编程语言。
Odersky先前的工作是Generic Java和javac（Sun Java编译器）。Java平台的Scala于2003年底/2004年初发布。.NET平台的Scala发布于2004年6月。该语言第二个版本，v2.0，发布于2006年3月。
截至2009年9月，最新版本是版本2.7.6 。Scala 2.8预计的特性包括重写的Scala类库（Scala collections library）、方法的命名参数和默认参数、包对象（package object），以及Continuation。
2009年4月，Twitter宣布他们已经把大部分后端程序从Ruby迁移到Scala，其余部分也打算要迁移。此外， Wattzon已经公开宣称，其整个平台都已经是基于Scala基础设施编写的。
 */
object Sample {
    def main(args: Array[String]): Unit = {
        println("Hello, world!")
    }
}