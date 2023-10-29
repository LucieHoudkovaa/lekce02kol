package com.engeto.guests;

public class Room {
    private String numberRoom;
    private int numberOfBed;
    private boolean balocony;
    private boolean seaWiew;
    private double pricePerNight;

    //konstruktor

    public Room(String numberRoom, int numberOfBed,
                boolean balocony, boolean seaWiew, double pricePerNight) {
        this.numberRoom = numberRoom;
        this.numberOfBed = numberOfBed;
        this.balocony = balocony;
        this.seaWiew = seaWiew;
        this.pricePerNight = pricePerNight;
    }
    //endkonstruktor

    //pristupova metoda

    public String getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(String numberRoom) {
        this.numberRoom = numberRoom;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public boolean isBalocony() {
        return balocony;
    }

    public void setBalocony(boolean balocony) {
        this.balocony = balocony;
    }

    public boolean isSeaWiew() {
        return seaWiew;
    }

    public void setSeaWiew(boolean seaWiew) {
        this.seaWiew = seaWiew;
    }

    public double getPrice() {
        return pricePerNight;
    }

    public void setPrice(double price) {
        this.pricePerNight = price;
    }
    //end pristupova metoda


    @Override
    public String toString() {
        return "Room{" +
                "numberRoom='" + numberRoom + '\'' +
                '}';
    }
}


