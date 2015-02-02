/**
 * <h1>Design Pattern - Factory Pattern</h1>
 * <p>
 * Factory pattern is one of most used design pattern in Java. This type of design pattern comes
 * under creational pattern as this pattern provides one of the best ways to create an object.
 * </p>
 *
 * <p>
 * In Factory pattern, we create object without exposing the creation logic to the client and refer
 * to newly created object using a common interface.
 * </p>
 *
 * <h2>Implementation</h2>
 * <p>
 * We're going to create a Shape interface and concrete classes implementing the Shape interface. A
 * factory class ShapeFactory is defined as a next step. FactoryPatternDemo, our demo class will use
 * ShapeFactory to get a Shape object. It will pass information (CIRCLE / RECTANGLE / SQUARE) to
 * ShapeFactory to get the type of object it needs.
 * </p>
 * <img src="./factory_pattern_uml_diagram.jpg" alt="Factory Pattern UML Diagram" width="100%">
 */
package pattern.factory;