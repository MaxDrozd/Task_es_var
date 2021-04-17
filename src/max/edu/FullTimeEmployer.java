package max.edu;/*
@USER: Java02
@DATE: 17.04.2021
@NAME: FullTimeEmployer
*/

public class FullTimeEmployer implements IAccounting{
    private String name;
    private Integer xp;
    private Integer rate;
    private String speciality;

    public FullTimeEmployer() {
    }

    public FullTimeEmployer(String name, Integer xp, Integer rate, String speciality) {
        this.name = name;
        this.xp = xp;
        this.rate = rate;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "FullTimeEmployer{" +
                "name='" + name + '\'' +
                ", xp=" + xp +
                ", rate=" + rate +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    @Override
    public int getSalary() {
        return 176*this.getRate();
    }
}
