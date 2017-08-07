package gasPump.classes.dataStore;

//########## GasPump 2 DataStore ###############

public class DataStore2_GP2 extends DataStore {

	int regularGas2; // price of the Regular gas for gasPump2
	int premiumGas2; // price of the Premium gas for gasPump2
	int superGas2; // price of the Super gas for gasPump2
	int cash; // prepaid cash
	float price; // price of selected gas
	int L; // number of Liters
	int temp_regularGas2; // temporary price of the Regular gas for gasPump2
	int temp_premiumGas2; // temporary price of the Premium gas for gasPump2
	int temp_superGas2; // temporary price of the Super gas for gasPump2
	int temp_cash; // store temporary prepaid cash
	float total; // stores total cost spend in gas.

	// Getters and Setters

	
	public int getCash() {
		return cash;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setCash(int cash) {
		this.cash = cash;
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
