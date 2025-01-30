# Scala Type Parameter Constraint Issue

This example demonstrates a potential issue in Scala when type parameters are not constrained in a class definition.  The `MyClass` class uses a type parameter `T` without specifying any constraints. This means `T` can be any type, which can lead to unexpected behavior, especially within the `printValue()` method.

The `println()` method works well for basic types like `Int` and `String`.  However, for other more complex types, it may not produce a helpful output. This illustrates a situation where a type constraint would have prevented the issue and ensured type safety.

The solution addresses this by adding a constraint to the type parameter, allowing only types with a sensible toString method.