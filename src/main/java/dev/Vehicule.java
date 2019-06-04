package dev;

public class Vehicule {

	protected String model;
	protected int yearOfPurchase;
	protected float price;
	protected String plateNumber;
	protected char permit;

	public Vehicule(String model, int yearOfPurchase, float price, String plateNumber, char permit) {
		this.model = model;
		this.yearOfPurchase = yearOfPurchase;
		this.price = price;
		this.plateNumber = plateNumber;
		this.permit = permit;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfPurchase() {
		return yearOfPurchase;
	}

	public void setYearOfPurchase(int yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public char getPermit() {
		return permit;
	}

	public void setPermit(char permit) {
		this.permit = permit;
	}

	public int age() {
		return 2019 - this.yearOfPurchase;
	}

	public String showVehicule() {
		return "Mod�le - " + this.model + "\nAnn�e d'achat - " + this.yearOfPurchase + "\nPrix - " + this.price
				+ "\nNum�ro d'immatriculation - " + this.plateNumber + "\nPermis n�cessaire - " + this.permit;
	}

	@Override
	public String toString() {
		return "Mod�le - " + this.model + "\nAnn�e d'achat - " + this.yearOfPurchase + "\nPrix - " + this.price
				+ "\nNum�ro d'immatriculation - " + this.plateNumber + "\nPermis n�cessaire - " + this.permit;
	}

	public float rentCost() {
		if (this.age() < 1)
			return price / 200;
		else
			return price / 250;
	}

}
