package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
		List<Car> carsList = new ArrayList<>();
		carsList.add(new Car("Subaru", "Forester", 2020));
		carsList.add(new Car("Porshe", "Carrera 991", 2012));
		carsList.add(new Car("Skoda", "Kodiaq", 2019));
		carsList.add(new Car("Toyota", "Land Cruiser 200", 2018));
		carsList.add(new Car("Tesla", "Model X", 2021));
		carsList = CarServiceImpl.getCarsFromCarsList(carsList, count);
		model.addAttribute("carsAll", carsList);
		return "cars";
	}
	
}