package beans;

public class Car {
	private Engine engine;
	private String carname;
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public void print()
	{
		System.out.println(carname+" "+engine.getModel()+" "+engine.getYear()+" "+engine.getType());
	}
}