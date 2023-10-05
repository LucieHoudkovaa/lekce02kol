package com.engeto.guests;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private String Booking;
    private Room room;
    private Guest guest;
    private String dateBooking;

    private List<Guest> otherGuests;

    public Booking(String booking, Room room, Guest guest, String dateBooking) {
        Booking = booking;
        this.room = room;
        this.guest = guest;
        this.dateBooking = dateBooking;
        this.otherGuests = new ArrayList<>();
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



    public String getBooking() {
        return Booking;
    }

    public void setBooking(String booking) {
        Booking = booking;
    }

    public Booking(Room room) {
        this.room = room;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
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

    @Override
    public String toString() {
        return "Booking{" +
                "Booking='" + Booking + '\'' +
                ", room=" + room +
                ", guest=" + guest +
                ", dateBooking='" + dateBooking + '\'' +
                ", otherGuests=" + otherGuests +
                '}';
    }
}


