/**
 * <h1>Design Pattern - Abstract Factory Pattern</h1>
 *
 * <p>
 * Abstract Factory patterns work around a super-factory which creates other factories. This factory
 * is also called as factory of factories. This type of design pattern comes under creational
 * pattern as this pattern provides one of the best ways to create an object.
 * </p>
 *
 * <p>
 * In Abstract Factory pattern an interface is responsible for creating a factory of related objects
 * without explicitly specifying their classes. Each generated factory can give the objects as per
 * the Factory pattern.
 * </p>
 *
 * <h2>Implementation</h2>
 *
 * <p>
 * We are going to create a Shape and Color interfaces and concrete classes implementing these
 * interfaces. We create an abstract factory class AbstractFactory as next step. Factory classes
 * ShapeFactory and ColorFactory are defined where each factory extends AbstractFactory. A factory
 * creator/generator class FactoryProducer is created.
 * </p>
 *
 * <p>
 * AbstractFactoryPatternDemo, our demo class uses FactoryProducer to get a AbstractFactory object.
 * It will pass information (CIRCLE / RECTANGLE / SQUARE for Shape) to AbstractFactory to get the
 * type of object it needs. It also passes information (RED / GREEN / BLUE for Color) to
 * AbstractFactory to get the type of object it needs.
 * </p>
 *
 * <img src="./abstractfactory_pattern_uml_diagram.jpg" alt="Abstract Factory Pattern UML Diagram"
 * width="100%">
 */
package pattern.abstractfactory;