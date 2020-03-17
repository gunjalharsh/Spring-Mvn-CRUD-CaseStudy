package com.cts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ResponseBodyDemo {
	
	@RequestMapping(value="/country11",method=RequestMethod.GET)
	public @ResponseBody CountryBean getcountry()
	{
		//response is view as object--.json
		return new CountryBean("india","Summar");
	}
	@RequestMapping(value="/country12",method=RequestMethod.GET)
	public @ResponseBody List<CountryBean> getCountries()
	{
		List<CountryBean> l1=new ArrayList<CountryBean>();
		l1.add(new CountryBean("Ind","Tropical"));
		l1.add(new CountryBean("USA","Dry Winters"));

		l1.add(new CountryBean("UK","IceCore"));
		return l1;

	}

}
