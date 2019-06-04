package dev;

public final class Autocar extends BigVehicule {

	private int nbPassengersMax;

	public Autocar(String model, int yearOfPurchase, float price, String plateNumber, char permit, float volume,
			int nbPassengersMax) {
		super(model, yearOfPurchase, price, plateNumber, permit, volume);
		this.nbPassengersMax = nbPassengersMax;
	}

	public int getNbPassengers() {
		return nbPassengersMax;
	}

	public void setNbPassengers(int nbPassengers) {
		this.nbPassengersMax = nbPassengers;
	}

	public boolean canTransportPassengers(int nbPassengers, float bagageVolume) {
		if (this.volume / (nbPassengers * bagageVolume) >= 1)
			return true;
		else
			return false;
	}

	@Override
	public String showVehicule() {
		return super.showVehicule() + "\nVolume de stockage - " + this.volume + " m3\nNombre de passagers max - "
				+ this.nbPassengersMax;
	}

	@Override
	public String toString() {
		return super.toString() + "\nVolume de stockage - " + this.volume + " m3\nNombre de passagers max - "
				+ this.nbPassengersMax;
	}
}
