package BusReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class busDemo {
    public static void main(String[] args) {

        ArrayList<bus> buses = new ArrayList<bus>();
        ArrayList<booking> bookings = new ArrayList<booking>();

        buses.add(new bus(1, true, 2));
        buses.add(new bus(10, false, 52));
        buses.add(new bus(34, true, 52));
        buses.add(new bus(55, true, 48));
        
        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);

        for (bus b:buses){
            b.displayBusInfo();
        }

        while (userOpt == 1) {
        System.out.println("Enter 1 to book and 2 to exit");
        userOpt = scanner.nextInt();
        if(userOpt == 1) {
            booking Booking = new booking();
            if(Booking.isAvailable(bookings,buses)){
                bookings.add(Booking);
                System.out.println("Your booking is confirmed");
            }
            else
            System.out.println("Sorry, Bus is full. Try another bus or date.");
        }
    }



    }
}
