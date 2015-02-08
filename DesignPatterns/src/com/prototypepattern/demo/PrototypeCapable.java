/**
 * 
 */
package com.prototypepattern.demo;

/**
 * @author kenarayan
 * 
 * A prototype is a template of any object before the actual object is constructed. In java also, it holds the 
 * same meaning. Prototype design pattern is used in scenarios where application needs to create a number of instances 
 * of a class, which has almost same state or differs very little.
 * 
 * This interface provides the ability to clone prototypes without knowing their actual types.
 * Also provides a type reference to be used in registry
 *
 */
public interface PrototypeCapable extends Cloneable {
	
	public PrototypeCapable cloneObject() throws CloneNotSupportedException;
	
}