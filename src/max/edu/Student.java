package max.edu;/*
@USER: Java02
@DATE: 17.04.2021
@NAME: Student
*/

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate bDAy;
    private Integer grade;

    public Student(String name, LocalDate bDAy, Integer grade) {
        this.name = name;
        this.bDAy = bDAy;
        this.grade = grade;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getbDAy() {
        return bDAy;
    }

    public void setbDAy(LocalDate bDAy) {
        this.bDAy = bDAy;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", bDAy=" + bDAy +
                ", grade=" + grade +
                '}';
    }
}
