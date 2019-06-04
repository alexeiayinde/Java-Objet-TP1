package dev;

public final class Truck extends BigVehicule {

	public Truck(String model, int yearOfPurchase, float price, String plateNumber, char permit, float volume) {
		super(model, yearOfPurchase, price, plateNumber, permit, volume);
	}

	public boolean canTransportVolume(float volume) {
		if (this.volume >= volume)
			return true;
		else
			return false;
	}

	@Override
	public String showVehicule() {
		return super.showVehicule() + "\nVolume de stockage - " + this.volume + " m3";
	}
}
