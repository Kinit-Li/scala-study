package com.ligy.scala.study4{
class Super{
    protected def f() {println("f")}
    }
	class Sub extends Super{
	    f()
	}
	class Other{
//		(new Super).f() //错误
	}
}