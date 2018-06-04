/**
 * 
 */
package com.shadab.designpatterns.creational.builder;

/**
 * @author mshadab
 *
 */
public class Car {
	private final String carName;// mendatory
	private final String carModel;// mendatory
	private final String carColor; // optional
	private final String carPrice; // optional
	private final String carHP; // optional
	public String getCarName() {
		return carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public String getCarColor() {
		return carColor;
	}

	public String getCarPrice() {
		return carPrice;
	}

	public String getCarHP() {
		return carHP;
	}


	
	public Car(CarBuilder carBuilder) {
		// TODO Auto-generated constructor stub
		this.carName = carBuilder.carName;
		this.carModel = carBuilder.carModel;
		this.carColor = carBuilder.carColor;
		this.carPrice = carBuilder.carPrice;
		this.carHP = carBuilder.carHP;
	}
	
	public static class CarBuilder{
		
		private final String carName;// mendatory
		private final String carModel;// mendatory
		private String carColor; // optional
		
		
		public CarBuilder color(String carColor) {
			this.carColor = carColor;
			return this;
		}

		public CarBuilder price(String carPrice) {
			this.carPrice = carPrice;
			return this;
		}

		public CarBuilder hp(String carHP) {
			this.carHP = carHP;
			return this;
		}

		private   String carPrice; // optional
		private   String carHP; // optional
		
		public CarBuilder(String carName, String carModel) {
			// TODO Auto-generated constructor stub
			this.carName=carName;
			this.carModel = carModel;

		}
		
		public Car build() {
			return new Car(this);
			
			
		}
		
	}

}
