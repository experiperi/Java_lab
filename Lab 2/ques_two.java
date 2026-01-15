import java.util.ArrayList;
import java.util.List;

enum RoomType 
{
    STANDARD(2000),
    DELUXE(3500),
    SUITE(6000);

    private final int baseTariff;

    RoomType(int baseTariff) 
    {
        this.baseTariff = baseTariff;
    }

    public int getBaseTariff() 
    {
        return baseTariff;
    }

    public double calculateCost(int days) 
    {
        return baseTariff * (double) days;
    }
}

public class ques_two 
{
    public static void main(String[] args) 
    {

        RoomType selectedRoom = RoomType.DELUXE;

        int daysPrimitive = 4;             
        double serviceChargesPrimitive = 750.50; 

        Integer daysWrapper = daysPrimitive;         
        Double serviceChargesWrapper = serviceChargesPrimitive; 
        Integer baseTariffWrapper = selectedRoom.getBaseTariff(); 

        List<Number> details = new ArrayList<>();
        details.add(baseTariffWrapper);
        details.add(daysWrapper);
        details.add(serviceChargesWrapper);

        int baseTariffUnboxed = baseTariffWrapper; 
        int daysUnboxed = daysWrapper;             
        double serviceUnboxed = serviceChargesWrapper;

        double roomCost = baseTariffUnboxed * daysUnboxed;
        double totalBill = roomCost + serviceUnboxed;

        double totalFromEnum = selectedRoom.calculateCost(daysWrapper) + serviceChargesWrapper;

        System.out.println("=== Hotel Room Tariff Summary ===");
        System.out.printf("Selected room type: %s%n", selectedRoom);
        System.out.printf("Base tariff per day: %d%n", baseTariffWrapper);
        System.out.printf("Number of days stayed: %d%n", daysWrapper);
        System.out.printf("Room charges (base * days): %.2f%n", roomCost);
        System.out.printf("Service charges: %.2f%n", serviceChargesWrapper);
        System.out.printf("Total bill (calculated with unboxed values): %.2f%n", totalBill);
        System.out.printf("Total bill (calculated via enum method): %.2f%n", totalFromEnum);
        System.out.println("=================================");
    }
}