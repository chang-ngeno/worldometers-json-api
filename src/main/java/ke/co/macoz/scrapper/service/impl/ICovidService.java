package ke.co.macoz.scrapper.service.impl;

import java.util.List;

import ke.co.macoz.scrapper.entities.CovidCasesByCountry;

public interface ICovidService {
	
	public List<CovidCasesByCountry> findAll();
}
