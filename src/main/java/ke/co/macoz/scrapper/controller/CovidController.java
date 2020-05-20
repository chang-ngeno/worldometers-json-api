package ke.co.macoz.scrapper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ke.co.macoz.scrapper.entities.CovidCasesByCountry;
import ke.co.macoz.scrapper.service.CovidService;

@RestController
@RequestMapping(path = "/api/v1")
public class CovidController {

	@Autowired
	CovidService covidService;

	@GetMapping("/")
	public String welcome() {
		return "Welcome to my simple covid data app; The data fetched is from worldometers.info/coronavirus";
	}

	@GetMapping(path = "/all")
	public List<CovidCasesByCountry> getAllResults() {
		return covidService.findAll();
	}

}
