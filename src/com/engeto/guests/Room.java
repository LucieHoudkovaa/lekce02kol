package com.engeto.guests;

public class Room {
    private String numberRoom;
    private String numberOfBed;
    private boolean balocony;
    private boolean seaWiew;
    private String price;

    //konstruktor

    public Room(String numberRoom, String numberOfBed,
                boolean balocony, boolean seaWiew, String price) {
        this.numberRoom = numberRoom;
        this.numberOfBed = numberOfBed;
        this.balocony = balocony;
        this.seaWiew = seaWiew;
        this.price = price;
    }
    //endkonstruktor

    //pristupova metoda

    public String getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(String numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(String numberOfBed) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    //end pristupova metoda


    @Override
    public String toString() {
        return "Room{" +
                "numberRoom='" + numberRoom + '\'' +
                '}';
    }
}


