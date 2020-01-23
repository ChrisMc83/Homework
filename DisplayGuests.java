package GuestList;

import static GuestList.Main.guests;

public class DisplayGuests  {

   static void DisplayGuests() {

        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.println("--");
            } else {
                System.out.println(guests[i]);

            }
        }
    }
}