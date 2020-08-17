
public class Dell extends Autovariable implements Laptop {
	int keys;

	public Dell(String model, String color, int price, int keys) {
		super(model, color, price);
		this.keys = keys;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	/*@Override
	public String getResolution() {
		// TODO Auto-generated method stub
		return getResolution();
	}*/

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int getKeys() {
		// TODO Auto-generated method stub
		return keys;
	}
	
}
