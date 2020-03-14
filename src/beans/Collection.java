package beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

@SuppressWarnings("rawtypes")
public class Collection {
	private List vegetables;
	private Set cricketers;
	private Map countries;
	private Vector vec;
	private Properties pro;
	
	public List getVegetables() {
		return vegetables;
	}
	public void setVegetables(List vegetables) {
		this.vegetables = vegetables;
	}
	public Set getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public Map getCountries() {
		return countries;
	}
	public void setCountries(Map countries) {
		this.countries = countries;
	}
	public Vector getVec() {
		return vec;
	}
	public void setVec(Vector vec) {
		this.vec = vec;
	}
	public Properties getPro() {
		return pro;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}		
}
