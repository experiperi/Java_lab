class Room 
{
    protected int roomNumber;
    protected String roomType;
    protected double basePrice;


    Room(int roomNumber, String roomType) 
    {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.basePrice = 0.0;
    }


    Room(int roomNumber, String roomType, double basePrice) 
    {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.basePrice = basePrice;
    }


    void displayRoomDetails() 
    {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Base Price: " + basePrice);
    }
}

class DeluxeRoom extends Room 
{
    private boolean freeWiFi;
    private boolean complimentaryBreakfast;


    DeluxeRoom(int roomNumber, String roomType,
               boolean freeWiFi, boolean complimentaryBreakfast) 
    {
        super(roomNumber, roomType);
        this.freeWiFi = freeWiFi;
        this.complimentaryBreakfast = complimentaryBreakfast;
    }


    DeluxeRoom(int roomNumber, String roomType, double basePrice,
               boolean freeWiFi, boolean complimentaryBreakfast) 
    {
        super(roomNumber, roomType, basePrice);
        this.freeWiFi = freeWiFi;
        this.complimentaryBreakfast = complimentaryBreakfast;
    }


    void displayDeluxeRoomDetails() 
    {
        displayRoomDetails();
        System.out.println("Free Wi-Fi: " + (freeWiFi ? "Yes" : "No"));
        System.out.println("Complimentary Breakfast: " +
                           (complimentaryBreakfast ? "Yes" : "No"));
    }
}

public class questwo {
    public static void main(String[] args) 
    {

    
        Room r1 = new Room(101, "Standard");
        Room r2 = new Room(102, "Suite", 3500);

    
        DeluxeRoom d1 = new DeluxeRoom(201, "Deluxe", true, true);
        DeluxeRoom d2 = new DeluxeRoom(202, "Luxury Deluxe", 5000, true, true);

        System.out.println("----- Room 1 Details -----");
        r1.displayRoomDetails();

        System.out.println("\n----- Room 2 Details -----");
        r2.displayRoomDetails();

        System.out.println("\n----- Deluxe Room 1 Details -----");
        d1.displayDeluxeRoomDetails();

        System.out.println("\n----- Deluxe Room 2 Details -----");
        d2.displayDeluxeRoomDetails();
    }
}