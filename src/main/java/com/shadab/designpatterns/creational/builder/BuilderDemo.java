/**
 * 
 */
package com.shadab.designpatterns.creational.builder;

/**
 * @author mshadab
 *
 */
@SuppressWarnings(value = { "all" })
public class BuilderDemo {
	
	public static void main(String[] args) {
		Car car = new Car.CarBuilder("Maruti","200").build();
		Car car2 = new Car.CarBuilder("Maruti","200").hp("2000").build();
		System.out.println("test");
		 
 	}

}
