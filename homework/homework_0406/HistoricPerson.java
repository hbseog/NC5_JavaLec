package homework_0406;

public class HistoricPerson {
    String name;
    String achievement;
    String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public HistoricPerson(String name, String achievement, String country) {
        this.name = name;
        this.achievement = achievement;
        this.country = country;
    }

    @Override
    public String toString() {
        return  "이름='" + name + '\'' +
                ", 업적='" + achievement + '\'' +
                ", 나라='" + country + '\'';
    }

    public boolean getPersonInfo(String achievement){
        return this.achievement.equals(achievement);
    }
    public boolean getSameCountryPerson(String country){
        return this.country.equals(country);
    }
}
