Singleton Design Pattern 
This repository contains examples of different implementations of the Singleton design pattern in Java. The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.

Table of Contents
Eager Loading
Lazy Loading
Lazy Loading with Synchronization
Double-Checked Locking

Eager Loading
In the DBConnection class, an instance of the DBConnection class is created eagerly using a static field. This guarantees that the instance is created as soon as the class is loaded into memory.

Lazy Loading
The DBConnection2 class implements lazy loading, where the instance is created only when getInstance() is called for the first time.

Lazy Loading with Synchronization
The DBConnection3 class also implements lazy loading but includes synchronization to make it thread-safe. However, this approach can cause performance issues due to the synchronized block.

Double-Checked Locking
The DBConnection4 class uses double-checked locking for lazy loading, which improves performance by minimizing synchronization. This approach requires careful synchronization using synchronized blocks.
