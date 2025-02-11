```scala
class MyClass(val x: Int) {
  def method1(): Int = {
    x + 1 // This line will cause a compiler error if x is not accessible
  }

  def method2(y: Int): Int = {
    x + y
  }
}
```