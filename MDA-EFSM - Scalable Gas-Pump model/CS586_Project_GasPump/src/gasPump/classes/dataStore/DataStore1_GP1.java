package gasPump.classes.dataStore;

//########## GasPump 1 DataStore ###############

public class DataStore1_GP1 extends DataStore {

	float regularGas1; // price of the Regular gas for gasPump1
	float superGas1; // price of the Super gas for gasPump1
	float price; // price of selected gas
	float temp_regularGas1; // temporary price of the Regular gas for gasPump1
	float temp_superGas1; // temporary price of the Super gas for gasPump1
	float temp_price; // temporary price of selected gas
	int G; // number of Gallons
	float Total; // stores total cost spend in gas.

	// Getters and Setters

	
	
	public float getPrice() {
		return price;
	}

	public float getTotal() {
		return Total;
	}

	public void setTotal(float total) {
		Total = total;
	}

	public float getTemp_regularGas1() {
		return temp_regularGas1;
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

	public float getTemp_price() {
		return temp_price;
	}

	public void setTemp_price(float temp_price) {
		this.temp_price = temp_price;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public void setPrice(float price) {
		this.price = price;
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
}
