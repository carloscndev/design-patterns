# FACTORY METHOD DESING PATTERN

### Intent

- Define an interface for creating an object, but let subclases decide wich class to instantiate. Factory Method lets a class defer instantiation to subclases
- Defing a "virtual" constructor
- The new operator considered harmful

### Abstract

Factory pattern is one of the most used design patterns in Java. This type of desing come under creational pattern as this privides one of the best ways to create an object.

In factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

### Implementation

We are goin to create a Shape interface and concrete classes implementing the Shape interface. A factory class ShapeFactory is defined as a next step.

FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object. It will pass information (CIRCLE / RECTANGLE / SQUARE ) to shapeFactory to get the type of object it needs.

![Ilustration](../images/factory-pattern.jpg)
