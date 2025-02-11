# Inaccessible Variable Error in Scala

This repository demonstrates a common error in Scala programming: attempting to access a member variable that is either private, not defined, or otherwise not accessible from within a method.

## The Bug
The `bug.scala` file contains a class `MyClass` with a constructor parameter `x`. In the method `method1`, `x` is directly accessed and used in a computation. However, depending on the access modifier of `x`, this could lead to a compilation error. If x is marked as `private`, it wouldn't be directly accessible in `method1`.  In the `method2` this is not a problem because y is provided as a parameter. 

## The Solution
The `bugSolution.scala` file corrects this by demonstrating several ways to address the issue:
- Make the variable `x` public or accessible to the methods where it is used.
- Use appropriate accessor methods (`getX` for example) to access the private variable.