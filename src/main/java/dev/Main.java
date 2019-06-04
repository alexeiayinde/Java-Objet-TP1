package dev;

public class Main {

	public static void main(String[] args) {

		System.out.println("*********** Test voiture TWINGO ***********");

		Car car1 = new Car("Twingo", 2019, 10000f, "1234 AZ 49", 'B');
		car1.addRadio();
		System.out.println(car1.showVehicule());
		System.out.println("Coût quotidien de la location du véhicule : " + car1.rentCost() + "€");

		System.out.println("\n*********** Test Camion ***********");

		Truck truck1 = new Truck("J9", 2014, 20000f, "987 BCD 75", 'B', 25);
		System.out.println(truck1.showVehicule());
		System.out.println("Le camion peut transporter le volume indiqué : " + truck1.canTransportVolume(7));
		System.out.println("Coût quotidien de la location du véhicule : " + truck1.rentCost() + "€");

		System.out.println("\n*********** Test Autocar ***********");

		Autocar autocar1 = new Autocar("FRI", 2005, 90000f, "4567WX01", 'D', 3, 53);
		System.out.println(autocar1.showVehicule());
		System.out.println("L'autocar peut transporter 40 passagers ayant chacun 0,1 m3 de bagages : "
				+ autocar1.canTransportPassengers(40, 0.3f));
	}

}
