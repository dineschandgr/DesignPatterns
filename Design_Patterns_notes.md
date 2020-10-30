#Behavioral Design Patterns

1. Memento Pattern

- for undo mechanism
- Allows restoring an object to a previous state

2. State Pattern

- Allows an object to behave differently depending on the state

3. Iterator Pattern

- Allows iterating over an object without having to expose the object's internal structure (which may change in future)

4. Strategy Pattern

- Allows passing different algorithms to an object
- Allows defining a template for an operation. 
- Specific steps will be inplemented in subclasses

5. Template Method Pattern

- Template method design pattern is to define an algorithm as a skeleton of operations and leave the details to be implemented by the child classes

6. Command Pattern

- Allows decouple a send from a receiver
- Sender talks to receiver through a command
- Commands can be undone and persisted

7. Observer Pattern

- Allows an object to notify other object when its state changes

8. Mediator Pattern

- Allows an object to encapsulate the communication between other objects

9. Chain of Responsibility pattern

- Allows building a chain of objects to process a request

10. Visitor Pattern

- Allows adding new operations on an object structure without modifying it


#Structural Design Patterns

1. Composite Pattern

- Represents object hierarchies where individual objects and compositions of objects are treated the same way

2. Adapter Pattern

- Allows converting the interface of a class into another interface that clients expect

3. Decorator Pattern

- Adds additional bevaviour to an object dynamically

4. Facade Pattern

- Provides a simplified, higher-level interface to a subsystem. Clients can talk to the facade rather than individual classes in the subsystem.

5. Flyweight Pattern

- Allows sharing common state between multiple objects

6. Bridge Pattern

- Allows representing hierarchies that grow in two different dimensions independently

7. Proxy Pattern

- Allows providing a substitute for another object. The proxy object delegates all the work to the target object and contains some additional behavior.


#Creational Design Pattern

1. Factory Pattern

- A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.

2. Abstract Factory Pattern

- Abstract Factory Pattern says that just define an interface or abstract class for creating families of related objects but without specifying their concrete sub-classes.

- That means Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.

3. Singleton Pattern

- Singleton Pattern says that just define a class that has only one instance and provides a global point of access to it.

4. Prototype Pattern

- Prototype Pattern says that cloning of an existing object instead of creating new one and can also be customized as per the requirement.

5. Builder Pattern

- Builder Pattern says that construct a complex object from simple objects using step-by-step approach

6. Object Pool Pattern

- Object Pool Pattern says that to reuse the object that are expensive to create.
- Basically, an Object pool is a container which contains a specified amount of objects.
- When an object is taken from the pool, it is not available in the pool until it is put back.
- Objects in the pool have a lifecycle: creation, validation and destroy.