class Room {
    protected int roomNumber;
    protected double baseTariff;

    public Room(int roomNumber, double baseTariff) {
        this.roomNumber = roomNumber;
        this.baseTariff = baseTariff;
    }

    public double calculateTariff() {
        return baseTariff;
    }

    public void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Base Tariff: $" + baseTariff);
    }
}


class StandardRoom extends Room {
    private boolean hasAC;

    public StandardRoom(int roomNumber, double baseTariff, boolean hasAC) {
        super(roomNumber, baseTariff);
        this.hasAC = hasAC;
    }

   
    @Override
    public double calculateTariff() {
        double tariff = baseTariff;
        if (hasAC) {
            tariff += 50; 
        }
        return tariff;
    }

    @Override
    public void displayRoomDetails() {
        super.displayRoomDetails();
        System.out.println("AC: " + (hasAC ? "Yes" : "No"));
        System.out.println("Total Tariff: $" + calculateTariff());
    }
}


class LuxuryRoom extends Room {
    private boolean hasAC;
    private boolean hasBreakfast;
    private boolean hasPremiumServices;

    public LuxuryRoom(int roomNumber, double baseTariff, boolean hasAC, boolean hasBreakfast, boolean hasPremiumServices) {
        super(roomNumber, baseTariff);
        this.hasAC = hasAC;
        this.hasBreakfast = hasBreakfast;
        this.hasPremiumServices = hasPremiumServices;
    }


    @Override
    public double calculateTariff() {
        double tariff = baseTariff;
        if (hasAC) tariff += 75;
        if (hasBreakfast) tariff += 100;
        if (hasPremiumServices) tariff += 200;
        return tariff;
    }

    @Override
    public void displayRoomDetails() {
        super.displayRoomDetails();
        System.out.println("AC: " + (hasAC ? "Yes" : "No"));
        System.out.println("Breakfast Included: " + (hasBreakfast ? "Yes" : "No"));
        System.out.println("Premium Services: " + (hasPremiumServices ? "Yes" : "No"));
        System.out.println("Total Tariff: $" + calculateTariff());
    }
}


public class questhree {
    public static void main(String[] args) {
        
        Room room1 = new StandardRoom(101, 500, true);
        System.out.println("Standard Room Details:");
        room1.displayRoomDetails();

        System.out.println("-----------------------------");

        
        Room room2 = new LuxuryRoom(202, 1000, true, true, true);
        System.out.println("Luxury Room Details:");
        room2.displayRoomDetails();
    }
}
