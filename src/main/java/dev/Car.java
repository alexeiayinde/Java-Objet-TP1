package dev;

public final class Car extends Vehicule {

	private boolean hasRadio;

	public Car(String model, int yearOfPurchase, float price, String plateNumber, char permit) {
		super(model, yearOfPurchase, price, plateNumber, permit);
	}

	public void addRadio() {
		this.hasRadio = true;
	}

	public void removeRadio() {
		this.hasRadio = false;
	}

	@Override
	public String showVehicule() {
		return super.showVehicule() + "\nPrésence autoradio : " + this.hasRadio;
	}

	public boolean isHasRadio() {
		return hasRadio;
	}

	public void setHasRadio(boolean hasRadio) {
		this.hasRadio = hasRadio;
	}
}