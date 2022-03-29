package seedu.duke;

import java.util.ArrayList;
import java.util.Scanner;

import seedu.duke.command.Command;

public class TARBS {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
//        Storage storage = new Storage("packages.txt", "reservations.txt");
//        Packages packages = storage.createPackages();
//        Reservations reservations = storage.createReservatons();

        //placeholder packages
        Packages packages = new Packages();
        TravelPackage start = new TravelPackage("packagename", 0, "29/3/2022","29/4/2022","hotelname", 99.99,"countryname",20);
        packages.addPackage(start);

        boolean endProgram = false;
        System.out.println("Welcome to Travel Agency Booking Reservation System!");
        Scanner sc = new Scanner(System.in);
        while (!endProgram) {
            System.out.println("Please enter command: ");
            try {
                Command command = Parser.parse(sc.nextLine());
//              command.execute(packages, reservations);
                command.execute(packages);
                endProgram = command.getIsExit();
            } catch (Exception ex) {
                System.out.println("Wrong format. All available" +
                        " commands can be seen with the 'help' command");
            }
        }
//        storage.convertListToFile(packages, reservations);
    }

}