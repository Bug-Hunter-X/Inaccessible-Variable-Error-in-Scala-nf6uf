```scala
class MyClass(val x: Int) {
  def method1(): Int = {
    this.x + 1 // Accessing x correctly
  }

  def method2(y: Int): Int = {
    x + y // Correct usage
  }
}
```