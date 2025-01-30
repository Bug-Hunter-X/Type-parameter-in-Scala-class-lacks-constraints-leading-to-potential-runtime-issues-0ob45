```scala
class MyClass[T <: AnyRef](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    val myString = new MyClass("Hello")
    myInt.printValue()
    myString.printValue()
  }
}
```