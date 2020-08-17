
public class Vivo extends Autovariable implements Mobile {
	int camera;

	public Vivo(String model, String color, int price, int camera) {
		super(model, color, price);
		this.camera = camera;
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

	/*	@Override
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
	public int getCamera() {
		// TODO Auto-generated method stub
		return camera;
	}
	
	
}
