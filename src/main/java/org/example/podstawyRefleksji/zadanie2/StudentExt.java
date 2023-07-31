package org.example.podstawyRefleksji.zadanie2;

public class StudentExt {

    private String name;
    private String surname;
    private int index;
    private String typeOfStudies;

    public StudentExt() {
    }

    public StudentExt(String name, String surname, int index, String typeOfStudies) {
        this.name = name;
        this.surname = surname;
        this.index = index;
        this.typeOfStudies = typeOfStudies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTypeOfStudies() {
        return typeOfStudies;
    }

    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }
}
