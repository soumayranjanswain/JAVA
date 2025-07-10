import java.util.*;

class Room {
    int roomNumber;
    boolean isBooked;
    String customerName;

    Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
        this.customerName = "";
    }
}

public class HotelManagementSystem2 {
    static Scanner scanner = new Scanner(System.in);
    static Room[] rooms = new Room[10];

    public static void main(String[] args) {
        initializeRooms();
        int choice;

        do {
            System.out.println("\n==== Hotel Management System ====");
            System.out.println("1. Book a Room");
            System.out.println("2. View Room Status");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next(); 
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookRoom();
                    break;
                case 2:
                    viewRoomStatus();
                    break;
                case 3:
                    checkout();
                    break;
                case 4:
                    System.out.println("Thank you for using Hotel Management System!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    static void initializeRooms() {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i + 1);
        }
    }

    static void bookRoom() {
        System.out.print("Enter room number to book (1-10): ");

        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a room number: ");
            scanner.next();
        }
        int roomNo = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (roomNo < 1 || roomNo > 10) {
            System.out.println("Invalid room number!");
            return;
        }

        Room room = rooms[roomNo - 1];
        if (room.isBooked) {
            System.out.println("Room already booked.");
        } else {
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();
            room.customerName = name;
            room.isBooked = true;
            System.out.println("Room booked successfully!");
        }
    }

    static void viewRoomStatus() {
        System.out.println("\nRoom Status:");
        for (Room room : rooms) {
            System.out.println("Room " + room.roomNumber + ": " +
                    (room.isBooked ? "Booked by " + room.customerName : "Available"));
        }
    }

    static void checkout() {
        System.out.print("Enter room number to checkout (1-10): ");

        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a room number: ");
            scanner.next();
        }
        int roomNo = scanner.nextInt();
        scanner.nextLine(); // optional

        if (roomNo < 1 || roomNo > 10) {
            System.out.println("Invalid room number!");
            return;
        }

        Room room = rooms[roomNo - 1];
        if (!room.isBooked) {
            System.out.println("Room is not currently booked.");
        } else {
            room.isBooked = false;
            room.customerName = "";
            System.out.println("Checkout successful.");
        }
    }
}