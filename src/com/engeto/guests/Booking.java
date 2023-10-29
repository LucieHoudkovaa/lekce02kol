package com.engeto.guests;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private String typeOfVacation;
    private LocalDate start;
    private LocalDate end;

    private double price;

    private long length;


    private List<Guest> otherGuests;

    public int getNumberOfGuest() {
        return otherGuests.size() + 1;
    }


    public Booking(Room room, Guest guest, String typeOfVacation, LocalDate start, LocalDate end) {
        this.room = room;
        this.guest = guest;
        this.start = start;
        this.typeOfVacation = typeOfVacation;
        this.end = end;
        this.otherGuests = new ArrayList<>();
        this.length = end.toEpochDay() - start.toEpochDay();
        this.price = length * room.getPrice();
    }

    public long getBookingLength () {
        return this.length;
    }
    public double getPrice() {
        return price;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Booking(Guest guest) {
        this.guest = guest;
    }




    public Booking(Room room) {
        this.room = room;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public LocalDate getStartBooking() {
        return start;
    }

    public void setStartBooking(LocalDate startBooking) {
        this.start = startBooking;
    }

    public LocalDate getEndBooking() {
        return end;
    }

    public void setEndBooking(LocalDate endBooking) {
        this.end = endBooking;
    }

    public void addGuest(Guest guest) {
        otherGuests.add(guest);
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public int pocetHostu () {
        return otherGuests.size()+ 1;
    }



    @Override
    public String toString() {
        String output = "";
        String anoNe = "ne";
        if (room.isSeaWiew()) {
            anoNe = "ano";
        }
        output += start + " az " + end + ": " +
                guest.getFirstName() + " " + guest.getSurname()
                + " (" + guest.getBirthdate() + ") ["+ this.pocetHostu() + ", "
                + anoNe+ "] za " + price + " Kc\n";
        return output;
    }
}




