package Maven.Project.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Maven.Project.beans.City;

@Service
public class CityService implements ICityService {
	
	
	
	public List<City> findAll(){
		
		List<City> cities=new ArrayList<>();
		
		cities.add(new City(1L,"Kolkata",67777));
		cities.add(new City(2L,"Mumbai",677));
		cities.add(new City(3L,"Delhi",6777));
		cities.add(new City(4L,"Chennal",67));
		
		return cities;
	}

	
	
}
