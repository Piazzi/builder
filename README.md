<div align="center">
  <h1> BUILDER </h1>
</div>

# Code

Simple project representing the builder design pattern. For this project i made an application wich builds a computer
<br></br>

![31097354](https://user-images.githubusercontent.com/40416044/143771045-c9769d86-34b9-4bfc-8133-cb747a115bb2.jpg)

# Resume

A design pattern that let the developer do this:

<code> Computer computer = computerBuilder.setBudget(0).setSolidStateDrive('SSD').setGraphicsCard('GTX 1050TI').build(); </code>







# Definition

The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex object from its representation. It is one of the Gang of Four design patterns.

The Builder design pattern is one of the GoF design patterns that describe how to solve recurring design problems in object-oriented software.

The Builder design pattern solves problems like:

- How can a class (the same construction process) create different representations of a complex object?
- How can a class that includes creating a complex object be simplified?

Creating and assembling the parts of a complex object directly within a class is inflexible. It commits the class to creating a particular representation of the complex object and makes it impossible to change the representation later independently from (without having to change) the class.

The Builder design pattern describes how to solve such problems:

- Encapsulate creating and assembling the parts of a complex object in a separate Builder object.
- A class delegates object creation to a Builder object instead of creating the objects directly.

A class (the same construction process) can delegate to different Builder objects to create different representations of a complex object.

Source: <a href="https://en.wikipedia.org/wiki/Builder_pattern"> Wikipedia </a>
