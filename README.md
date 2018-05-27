## Structural patterns

### Facade
- Facade design pattern is used when a system is very complex or difficult to understand because of a large number of interdependent classes or because its source code is unavailable.
- This pattern hides the complexities of the larger system and provides a simpler interface to the client.
- It typically involves a single wrapper class that contains a set of members required by the client.

### Composite
- The composite pattern describes a group of objects that is treated the same way as a single instance of the same type of object. 
- The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. 
- Implementing the composite pattern lets clients treat individual objects and compositions uniformly.

### Adapter
- Also known as “Wrapper”.
- Allows the interface of an existing class to be used as another interface.
- It is often used to make existing classes work with others without modifying their source code.

## Behavioral patterns

### Template method
- It defines the program skeleton of an algorithm in an operation, deferring some steps to subclasses so that  the overarching algorithm is always followed.
- It lets one redefine certain steps of an algorithm without changing the algorithm's structure.
- The "template method", generally implemented as a base class (possibly an abstract class), which contains shared code and parts of the overall algorithm which are invariant.

### Observer
- An object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.
- Subject and observers have no explicit knowledge of each other and observers can be added and removed independently at run-time, that makes subject and observers loosely coupled.
- Most modern languages have built in "event" constructs which implement the observer pattern components.

### State
- It defines separate (state) objects that encapsulate state-specific behavior for each state.
- The object should change its behavior when its internal state changes.
- A class delegates state-specific behavior to its current state object instead of implementing state-specific behavior directly.

## Creational patterns

### Singleton
- Ensures that a class has only one instance, and provides a global point of access to it.
- It is useful when exactly one object is needed to coordinate actions across the system.
- The key idea in this pattern is to make the class itself responsible for controlling its instantiation (that it is instantiated only once).

### Factory method
- Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
- It uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created.
- The factory method pattern relies on inheritance, as object creation is delegated to subclasses that implement the factory method to create objects.

## Sources
- O'Reilly - Head First Design Pattern
- https://en.wikipedia.org/wiki/Software_design_pattern
- https://www.tutorialspoint.com/design_pattern/
- https://sourcemaking.com/design_patterns/
