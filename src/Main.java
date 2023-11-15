import com.engeto.guests.Booking;
import com.engeto.guests.BookingManager;
import com.engeto.guests.Guest;
import com.engeto.guests.Room;

import java.time.LocalDate;
import java.util.List;

public class Main {
    static BookingManager manager = new BookingManager();
    public static void main(String[] args) {


        fillBookings();
        printBookings();

        printFirst8RecreationBookings();
        printGuestStatistic();
    }

    public static void printBookings() {
        System.out.println(manager.toString());
    }

    public static void printFirst8RecreationBookings() {
        StringBuilder output = new StringBuilder("Prvnich 8 rekreacnich rezervaci:\n");
        int max = 8;
        int current = 0;
        List<Booking> bookingList = manager.getBookings();
        for (Booking booking : bookingList) {
            if (booking.getTypeOfVacation().equals("recreational") && current < max) {
                current++;
                output.append(booking);
            }
        }
        System.out.println(output);
    }

    public static void printGuestStatistic() {
        int pocet = 0;
        List<Booking> bookingList = manager.getBookings();
        for (Booking booking : bookingList) {
            if (booking.pocetHostu() == 1) {
                pocet++;

            }
        }
        String output = "Celkovy pocet rezervaci s 1 hostem: " + pocet;
        System.out.println(output);

        pocet = bookingList.stream().filter(booking -> booking.pocetHostu() == 2).toList().size();
        output = "Celkovy pocet rezervaci s 2 hosty: " + pocet;
        System.out.println(output);

        pocet = bookingList.stream().filter(booking -> booking.pocetHostu() > 2).toList().size();
        output = "Celkovy pocet rezervaci s vic jak 2 hosty: " + pocet;
        System.out.println(output);

    }

    public static void fillBookings() {
        Guest guest1 = new Guest("Karel","Dvořák", LocalDate.of(1990,5,15));
        Guest guest2 = new Guest("Karel", "Dvořák", LocalDate.of(1979,1,3));
        Guest guest3 = new Guest("Karolína", "Tmavá", LocalDate.of(1991, 1, 25));

        Room room1 = new Room ("1",1, true, true, 1000);
        Room room2 = new Room ("2",1, true, true, 1000);
        Room room3 = new Room ("3",3,  false, true, 2400);

        Booking booking1 = new Booking( room3, guest1,"working",
                LocalDate.of(2023, 6, 1),LocalDate.of(2023,6,7));
        Booking booking2 = new Booking(room2,guest2,"recreational",
                LocalDate.of(2023, 7,18),LocalDate.of(2023,7,21));


        manager.addBooking(booking1);
        manager.addBooking(booking2);


        //manager.addBooking(new Booking(room2, guest3, "recreational",
          //      LocalDate.of(2023,8,1), LocalDate.of(2023,8,2)));
        LocalDate firstFrom = LocalDate.of(2023,8,1);
        LocalDate firstTo = LocalDate.of(2023,8,2);
        for (int i =0; i<10; i++) {
            Booking booking = new Booking(room2, guest3,"recreational",firstFrom,firstTo);

            manager.addBooking(booking);
            firstFrom = firstFrom.plusDays(2);
            firstTo = firstTo.plusDays(2);


        }
        manager.addBooking(new Booking(room3, guest3,"working", LocalDate.of(2023, 8, 1),LocalDate.of(2023, 8, 31) ));


        }










    }
