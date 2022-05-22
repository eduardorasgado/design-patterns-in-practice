package designPrinciples.EncapsulateWhatVaries.ClassLevel.PaymentExample;

public class TaxCalculator {
	
	public double getTaxRate(String country, String state, String product, String taxType) {
		if(taxType == "US") {
			return getUSTax(state);
		} else if(taxType == "EU") {
			return getEUTax(country);
		} else {
			return getChineseTax(product);
		}
	}
	
	public double getUSTax(String state) {
		if(state == "AZ") {
			return 3.2;
		} else if(state == "OH") {
			return 1.4;
		} else if (state == "DC") {
			return 4.4;
		} else {
			return 7.5;
		}
	}
	
	public double getEUTax(String country) {
		if(country == "Norway") {
			return 8.2;
		} else if(country == "Belgium") {
			return 8.9;
		} else if(country == "Germany") {
			return 7.9;
		} else if(country == "Netherlands") {
			return 8.3;
		} else if(country == "Italy") {
			return 8.7;
		} else {
			return 5.5;
		}
	}
	
	public double getChineseTax(String product) {
		if(product == "Fridge") {
			return 3.2;
		} else if(product == "Computer") {
			return 2.2;
		} else if(product == "IPhone") {
			return 1.2;
		} else {
			return 4.2;
		}
	}
}
