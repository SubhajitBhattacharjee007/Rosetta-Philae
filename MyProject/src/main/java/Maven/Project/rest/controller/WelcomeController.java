package Maven.Project.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Maven.Project.beans.City;
import Maven.Project.services.ICityService;

@RestController
public class WelcomeController {
	
    @Autowired
	ICityService cityService;
    
    
    @RequestMapping("/getCities")
    public List<City> getCities() {

        List<City> cities = cityService.findAll();
        
        return cities;
    }

}
