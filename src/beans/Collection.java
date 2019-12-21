package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("rawtypes")
public class Collection {
	private List vegetables;
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
/*	public Vector getVec() {
		return vec;
	}
	public void setVec(Vector vec) {
		this.vec = vec;
	}
	public Properties getPr() {
		return pr;
	}
	public void setPr(Properties pr) {
		this.pr = pr;
	}*/
	private Set cricketers;
	private Map countries;
	/*private Vector vec;
	private Properties pr;*/
	
	
		
}
