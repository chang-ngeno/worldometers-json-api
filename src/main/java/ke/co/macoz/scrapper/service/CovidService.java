package ke.co.macoz.scrapper.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ke.co.macoz.scrapper.entities.CovidCasesByCountry;
import ke.co.macoz.scrapper.repository.CovidRepository;
import ke.co.macoz.scrapper.service.impl.ICovidService;

@Service
public class CovidService implements ICovidService {

	@Autowired
	CovidRepository covidRepository;

	@Override
	public List<CovidCasesByCountry> findAll() {

		List<CovidCasesByCountry> covidResults = new ArrayList<CovidCasesByCountry>();
		List<List<String>> allCases = covidRepository.findAll();
		int index = 0;

		for (List<String> caseByCountry : allCases) {
			if (caseByCountry.get(0).isEmpty() || caseByCountry.get(0).trim().equalsIgnoreCase("#")
					|| caseByCountry.get(0).trim().equals("")) {
				index = 0;
			} else {
				index = Integer.parseInt(caseByCountry.get(0));
			}
			covidResults.add(new CovidCasesByCountry(index, caseByCountry.get(1), caseByCountry.get(2),
					caseByCountry.get(3), caseByCountry.get(4), caseByCountry.get(5), caseByCountry.get(6),
					caseByCountry.get(7), caseByCountry.get(8), caseByCountry.get(9), caseByCountry.get(10),
					caseByCountry.get(11), caseByCountry.get(12), caseByCountry.get(13), caseByCountry.get(14)));
		}

		return covidResults;
	}

}
