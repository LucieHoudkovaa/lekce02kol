package com.engeto.guests;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookingList = new ArrayList<>();

    public boolean addBooking(Booking booking) {
        return bookingList.add(booking);
    }

    public Booking getBooking (int index) {
        return bookingList.get(index);
    }

    public List<Booking> getBookings () {
        return bookingList;
    }
    public void clearBookings () {
        bookingList.clear();
    }
    public int getNumberOfWorkingBooking(){
        int number = 0;
        for (Booking booking:bookingList){
            if (booking.getTypeOfVacation().equals("working")) {
                number++;
            }
        }
        return number;
    }
    public double getAverageGuests(){
        int guestCount = 0;
        int bookingCount = 0;
        for (Booking booking:bookingList){
            guestCount = guestCount + booking.getNumberOfGuest();
            bookingCount++;
        }
        return guestCount/bookingCount;
    }

    @Override
    public String toString() {
        String output = "";




        for(int i = 0; i < bookingList.size(); i++) {
            Booking booking =  bookingList.get(i);
            output += booking.toString();
        }
        return output;
    }
}
