package currency_convertor;

public class ConverterClass extends USDClass {
	String destCurrency;
	public ConverterClass(float usd, String destinationCurrency) {
		super(usd);
		// TODO Auto-generated constructor stub
		destCurrency = destinationCurrency;
	}
	public float convertCurrency() {
		float convUsd = 0;
		switch(destCurrency) {
			case " EUR" :
				convUsd = (float) (usdQty * 0.81);
				break;
			case " INR" :
				convUsd = (float) (usdQty * 64.31);
				break;
			case " MYR" :
				convUsd = (float) (usdQty * 3.95);
				break;
			case " SGD" :
				convUsd = (float) (usdQty * 1.32);
				break;
			case " GBP" :
				convUsd = (float) (usdQty * 0.72);
				break;
			case " CAD" :
				convUsd = (float) (usdQty * 1.26);
				break;
			default :
				System.out.println("Invalid conversion");
		}
		return convUsd;
	}
	public void display() {
		float convUsd = convertCurrency();
		System.out.println("The "+destCurrency+" amount equivalent to " +usdQty+" USD is : "+convUsd);
	}
}
