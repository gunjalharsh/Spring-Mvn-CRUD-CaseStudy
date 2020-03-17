package com.cts;

public class CountryBean {
String countryname;
String climate;
public CountryBean(String countryname, String climate) {
	
	this.countryname = countryname;
	this.climate = climate;
}
public String getCountryname() {
	return countryname;
}
public void setCountryname(String countryname) {
	this.countryname = countryname;
}
public String getClimate() {
	return climate;
}
public void setClimate(String climate) {
	this.climate = climate;
}

}
