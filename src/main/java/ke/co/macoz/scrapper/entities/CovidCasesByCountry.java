package ke.co.macoz.scrapper.entities;

public class CovidCasesByCountry {
    private int counter;
    private String country;
    private String totalCases;
    private String newCases;
    private String totalDeaths;
    private String newDeaths;
    private String totalRecovered;
    private String activeCases;
    private String seriousCritical;
    private String totCases1MPop;
    private String deaths1MPop;
    private String totalTests;
    private String tests1MPop;
    private String population;
    private String continent;


 public int getCounter() {
 	return this.counter;
 }
 public void setCounter(int counter) {
 	this.counter = counter;
 }


    public String getCountry() {
    	return this.country;
    }
    public void setCountry(String country) {
    	this.country = country;
    }


    public String getTotalCases() {
    	return this.totalCases;
    }
    public void setTotalCases(String totalCases) {
    	this.totalCases = totalCases;
    }


    public String getNewCases() {
    	return this.newCases;
    }
    public void setNewCases(String newCases) {
    	this.newCases = newCases;
    }


    public String getTotalDeaths() {
    	return this.totalDeaths;
    }
    public void setTotalDeaths(String totalDeaths) {
    	this.totalDeaths = totalDeaths;
    }


    public String getNewDeaths() {
    	return this.newDeaths;
    }
    public void setNewDeaths(String newDeaths) {
    	this.newDeaths = newDeaths;
    }


    public String getTotalRecovered() {
    	return this.totalRecovered;
    }
    public void setTotalRecovered(String totalRecovered) {
    	this.totalRecovered = totalRecovered;
    }


    public String getActiveCases() {
    	return this.activeCases;
    }
    public void setActiveCases(String activeCases) {
    	this.activeCases = activeCases;
    }


    public String getSeriousCritical() {
    	return this.seriousCritical;
    }
    public void setSeriousCritical(String seriousCritical) {
    	this.seriousCritical = seriousCritical;
    }


    public String getTotCases1MPop() {
    	return this.totCases1MPop;
    }
    public void setTotCases1MPop(String totCases1MPop) {
    	this.totCases1MPop = totCases1MPop;
    }


    public String getDeaths1MPop() {
    	return this.deaths1MPop;
    }
    public void setDeaths1MPop(String deaths1MPop) {
    	this.deaths1MPop = deaths1MPop;
    }


    public String getTotalTests() {
    	return this.totalTests;
    }
    public void setTotalTests(String totalTests) {
    	this.totalTests = totalTests;
    }


    public String getTests1MPop() {
    	return this.tests1MPop;
    }
    public void setTests1MPop(String tests1MPop) {
    	this.tests1MPop = tests1MPop;
    }


    public String getPopulation() {
    	return this.population;
    }
    public void setPopulation(String population) {
    	this.population = population;
    }


    public String getContinent() {
    	return this.continent;
    }
    public void setContinent(String continent) {
    	this.continent = continent;
    }

    public CovidCasesByCountry() {
    }

    public CovidCasesByCountry(int counter, String country, String totalCases, String newCases, String totalDeaths, String newDeaths, String totalRecovered, String activeCases, String seriousCritical, String totCases1MPop, String deaths1MPop, String totalTests, String tests1MPop, String population, String continent) {
        this.counter = counter;
        this.country = country;
        this.totalCases = totalCases;
        this.newCases = newCases;
        this.totalDeaths = totalDeaths;
        this.newDeaths = newDeaths;
        this.totalRecovered = totalRecovered;
        this.activeCases = activeCases;
        this.seriousCritical = seriousCritical;
        this.totCases1MPop = totCases1MPop;
        this.deaths1MPop = deaths1MPop;
        this.totalTests = totalTests;
        this.tests1MPop = tests1MPop;
        this.population = population;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "{" +
            " counter='" + getCounter() + "'" +
            ", country='" + getCountry() + "'" +
            ", totalCases='" + getTotalCases() + "'" +
            ", newCases='" + getNewCases() + "'" +
            ", totalDeaths='" + getTotalDeaths() + "'" +
            ", newDeaths='" + getNewDeaths() + "'" +
            ", totalRecovered='" + getTotalRecovered() + "'" +
            ", activeCases='" + getActiveCases() + "'" +
            ", seriousCritical='" + getSeriousCritical() + "'" +
            ", totCases1MPop='" + getTotCases1MPop() + "'" +
            ", deaths1MPop='" + getDeaths1MPop() + "'" +
            ", totalTests='" + getTotalTests() + "'" +
            ", tests1MPop='" + getTests1MPop() + "'" +
            ", population='" + getPopulation() + "'" +
            ", continent='" + getContinent() + "'" +
            "}";
    }

}