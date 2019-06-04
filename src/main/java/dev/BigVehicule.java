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

	@Override
	public String showVehicule() {
		return super.showVehicule() + "\nVolume de stockage - " + this.volume + " m3";
	}

	@Override
	public String toString() {
		return super.toString() + "\nVolume de stockage - " + this.volume + " m3";
	}

}
