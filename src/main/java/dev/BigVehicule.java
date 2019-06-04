package dev;

public class BigVehicule extends Vehicule {

	protected float volume;

	public BigVehicule(String model, int yearOfPurchase, float price, String plateNumber, char permit, float volume) {
		super(model, yearOfPurchase, price, plateNumber, permit);
		this.volume = volume;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

}
