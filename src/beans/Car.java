package beans;

import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("rawtypes")
public class Car {
	private Fruits[] fruits;  //Secondary array
	private Engine engine;    //Secondary DataType
	private String carname;   //Primary DataType
	private Collection co;    //Collections
	private Collection cfsc;  //Specific collection and properties	
	public Collection getCfsc() {
		return cfsc;
	}
	public void setCfsc(Collection cfsc) {
		this.cfsc = cfsc;
	}
	public void setCo(Collection co) {
		this.co = co;
	}
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
		Iterator itr1 = co.getVegetables().iterator();
		Iterator itr2 = co.getCricketers().iterator();
		System.out.println("Vegetables : ");
	    while(itr1.hasNext())
	    {
	    	System.out.println(itr1.next());
	    }
	    System.out.println("Cricketers : ");
	    while(itr2.hasNext())
	    {
	    	System.out.println(itr2.next());
	    }
	    System.out.println("Countries : ");
	    Set sett=co.getCountries().entrySet();
	    Iterator itr3 = sett.iterator();
	    while(itr3.hasNext())
	    {
	    	System.out.println(itr3.next());
	    }
	    System.out.println("Vector "+cfsc.getVec().get(0).toString());
	    System.out.println("Properties "+cfsc.getPro().getProperty("user"));
	}
}