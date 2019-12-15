package beans;

public class Car {
	private Fruits[] fruits;
	private Engine engine;
	private String carname;
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public void setFruits(Fruits[] fruits) {
		this.fruits = fruits;
	}
	public void print()
	{
		System.out.println(carname+" "+engine.getModel()+" "+engine.getYear()+" "+engine.getType());
		for(int i=0;i<fruits.length;i++)
		{
			for(int j=0;j<fruits[i].getNames().length;j++)
			{
				System.out.println(fruits[i].getNames()[j]);
			}
		}
	}
}