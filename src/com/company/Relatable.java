package com.company;

/**
 * Relatable interface
 * Starting Out with Java by Gaddis
 * Modified by Laura K. Gross, laura.gross@bridgew.edu
 */

/*
 * How is an interface like an abstract class?
 * It is a class that contains only abstract methods.
 * It cannot be instantiated.
 * It specifies behavior for a class.
 * BUT,
 * Syntax is "public interface Name" vs. "public abstract class Name".
 * It omits the access modifier public in the method header.
 * (All methods in an interface are implicitly public.)
 * Classes do not inherit from an interface.
 * Rather, classes implement an interface.
 * Relatable is implemented by the FinalExam class.
 * What is the hierarchy in this project? Look at FinalExam class.
 */
public interface Relatable {
    // Method headers for methods that must be overridden by the classes
    // that implement the Relatable interface.
    boolean equals(GradedActivity other);
    boolean isGreater(GradedActivity other);
    boolean isLess(GradedActivity other);
}
/* Note: An interface can optionally contain field declarations,
 * but all fields in an interface are treated as final and static.
 * Because they automatically become final,
 * you must provide an initialization value.
 *
 * Syntax for an interface is like this:

 * public interface InterfaceName{
    int FIELD1 = 1; // Optional in an interface
    [type] FIELDVAL = [value]; // Optional in an interface
    [Method header;]
    [Method header;]
    [Method header;]
    ...
    }

 * Fact: A class can implement multiple interfaces. The header has the form:
   public class MyClass implements Interface1, Interface2, Interface3

 * When a class implements multiple interfaces,
 * it must provide the methods specified by all of them!

 * Contrast: Note a class can INHERIT from **only one** superclass directly.
 * But it can IMPLEMENT **multiple** interfaces.

 * When a class implements an interface, an inheritance relationship
 * known as interface inheritance is established.
*/