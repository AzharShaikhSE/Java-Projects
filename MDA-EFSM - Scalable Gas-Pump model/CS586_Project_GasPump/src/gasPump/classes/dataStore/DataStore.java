package gasPump.classes.dataStore;

public abstract class DataStore {

	float regularGas1; // price of the Regular gas for gasPump1
	float superGas1; // price of the Super gas for gasPump1
	int regularGas2; // price of the Regular gas for gasPump2
	int premiumGas2; // price of the Premium gas for gasPump2
	int superGas2; // price of the Super gas for gasPump2
	int cash; // prepaid cash
	float price; // price of selected gas
	int L; // number of Litres
	int G; // number of Gallons
	float temp_regularGas1; // temporary price of the Regular gas for gasPump1
	float temp_superGas1; // temporary price of the Super gas for gasPump1
	int temp_regularGas2; // temporary price of the Regular gas for gasPump2
	int temp_premiumGas2; // temporary price of the Premium gas for gasPump2
	int temp_superGas2; // temporary price of the Super gas for gasPump2
	int temp_cash; // store temporary prepaid cash
	float total; // store the total price 
	
	// Getters and Setters
	
	
	public float getTemp_regularGas1() {
		return temp_regularGas1;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public int getTemp_cash() {
		return temp_cash;
	}

	public void setTemp_cash(int temp_cash) {
		this.temp_cash = temp_cash;
	}

	public void setTemp_regularGas1(float temp_regularGas1) {
		this.temp_regularGas1 = temp_regularGas1;
	}

	public float getTemp_superGas1() {
		return temp_superGas1;
	}

	public void setTemp_superGas1(float temp_superGas1) {
		this.temp_superGas1 = temp_superGas1;
	}

	public int getTemp_regularGas2() {
		return temp_regularGas2;
	}

	public void setTemp_regularGas2(int temp_regularGas2) {
		this.temp_regularGas2 = temp_regularGas2;
	}

	public int getTemp_premiumGas2() {
		return temp_premiumGas2;
	}

	public void setTemp_premiumGas2(int temp_premiumGas2) {
		this.temp_premiumGas2 = temp_premiumGas2;
	}

	public int getTemp_superGas2() {
		return temp_superGas2;
	}

	public void setTemp_superGas2(int temp_superGas2) {
		this.temp_superGas2 = temp_superGas2;
	}

	public int getL() {
		return L;
	}

	public void setL(int l) {
		L = l;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public int getCash() {
		return cash;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public float getRegularGas1() {
		return regularGas1;
	}

	public void setRegularGas1(float regularGas1) {
		this.regularGas1 = regularGas1;
	}

	public float getSuperGas1() {
		return superGas1;
	}

	public void setSuperGas1(float superGas1) {
		this.superGas1 = superGas1;
	}

	public int getRegularGas2() {
		return regularGas2;
	}

	public void setRegularGas2(int regularGas2) {
		this.regularGas2 = regularGas2;
	}

	public int getPremiumGas2() {
		return premiumGas2;
	}

	public void setPremiumGas2(int premiumGas2) {
		this.premiumGas2 = premiumGas2;
	}

	public int getSuperGas2() {
		return superGas2;
	}

	public void setSuperGas2(int superGas2) {
		this.superGas2 = superGas2;
	}

}
