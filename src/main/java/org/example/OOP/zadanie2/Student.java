package org.example.OOP.zadanie2;

public class Student extends Person {
    protected String studyType;
    protected int studyYear;
    protected double studyCost;

    public Student(String studyType, double studyCost, int studyYear) {
        this.studyType = studyType;
        this.studyCost = studyCost;
        this.studyYear = studyYear;
    }

    public String getStudyType() {
        return studyType;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public double getStudyCost() {
        return studyCost;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public void setStudyCost(double studyCost) {
        this.studyCost = studyCost;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", studyType='" + studyType + '\'' +
                ", studyYear=" + studyYear +
                ", studyCost=" + studyCost +
                '}';
    }
}
