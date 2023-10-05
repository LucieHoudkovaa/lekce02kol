package com.engeto.guests;

import java.time.LocalDate;

public class Guest {
    private String firstName;
    private String surname;
    private LocalDate birthdate;

    // konstruktor

    public Guest(String firstName, String surname, LocalDate birthdate) {
        this.firstName = firstName;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    // end konstruktor

    //pristupova metoda

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
//end pristupove metody

