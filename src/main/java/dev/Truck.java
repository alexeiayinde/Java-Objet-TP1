package dev;

public final class Truck extends BigVehicule {

	public Truck(String model, int yearOfPurchase, float price, String plateNumber, char permit, float volume) {
		super(model, yearOfPurchase, price, plateNumber, permit, volume);
	}

	public boolean canTransportVolume(float volume) {
		return this.volume >= volume;
	}
}
