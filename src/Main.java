import com.engeto.guests.Booking;
import com.engeto.guests.Guest;
import com.engeto.guests.Room;

import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995,5,5));

        Room room1 = new Room ("1","1", true, true, "1000 Kč/noc");
        Room room2 = new Room ("2","1", true, true, "1000 Kč/noc");
        Room room3 = new Room ("3","3",  false, true, "2400 Kč/noc");

        Booking booking1 = new Booking("Booking 1",room1, guest1,
                "19.-26.7.2021" );
        Booking booking2 = new Booking("Booking 2",room3,guest1, "1.-14.9.2021" );
        booking2.addGuest(guest2);



        List<Booking> bookingList = new ArrayList<>();

        bookingList.add(booking1);
        bookingList.add(booking2);

        for (Booking booking : bookingList);


        System.out.println(bookingList);


        //Připrav rezervace:
        //
        //    pro Adélu na pokoj č. 1 od 19. do 26. 7. 2021.
        //    pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
        //
        //Vypiš seznam všech rezervací.
    }
}