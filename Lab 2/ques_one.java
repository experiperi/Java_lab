import java.util.ArrayList;
import java.util.List;

public class ques_one {
    public static void main(String[] args) 
    {
        int tariffPrimitive = 2500;       
        int daysPrimitive = 3;            
        double servicePrimitive = 450.75; 

    
        Integer roomTariff = tariffPrimitive;  
        Integer numDays = daysPrimitive;       
        Double serviceCharges = servicePrimitive;

    
        List<Number> charges = new ArrayList<>();
        charges.add(roomTariff);     
        charges.add(numDays);        
        charges.add(serviceCharges); 

    
        int tariffUnboxed = roomTariff;   
        int daysUnboxed = numDays;        
        double serviceUnboxed = serviceCharges;

    
        double roomTotal = tariffUnboxed * daysUnboxed;
        double totalBill = roomTotal + serviceUnboxed;

    
        double totalBillDirect = roomTariff * numDays + serviceCharges;

    
        System.out.println("----- Hotel Bill -----");
        System.out.printf("Room tariff (per day): %d%n", roomTariff);
        System.out.printf("Number of days: %d%n", numDays);
        System.out.printf("Room charges: %.2f%n", roomTotal);
        System.out.printf("Service charges: %.2f%n", serviceCharges);
        System.out.printf("Total bill: %.2f%n", totalBill);
        System.out.println("----------------------");

    
        System.out.printf("Total (direct with wrappers): %.2f%n", totalBillDirect);
    }
}
