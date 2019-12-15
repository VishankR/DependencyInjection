package beans;

public class Engine {
	private String model;
	private int year;
	private String type;
	public Engine()
	{
	}
	public Engine(String model, int year, String type)
	{
		System.out.println("Parameterized Engine Constructor");
		this.model=model;
		this.year=year;
		this.type=type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public String getType() {
		return type;
	}
}
