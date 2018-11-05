# Singleton Pattern

Singleton: Permite una sola intencia de una clase en toda la aplicación

### intent

* Ensure a class has only one instance, and providea global point of access to it.
* Encapsulated "just-in-time intialization" or "initialization on first use"

### Abstract

Singleton pattern is one of the simplest design patters. This type of desing pattern comes under creational pattern as this pattern provides one of the best ways to create an object

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly whitout need to instance the object of the class

### Implementation

We are going to create a SingleObject class. SingleObject class have its constructor as private and have a static instance of itself.

SingleObject class provides a static method to get its static instance to outside world. SingletonPatternDemo, our demo class will use SingleObject class to get a SingleObject object.

![Ilustration UML](../images/singleton-pattern.jpg)
