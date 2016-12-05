import java.util.*;
/**
 * Inventory class to model car shop inventory.
 * 
 * @author Krzysztof Szczurowski
 * @version 1.1
 * @since 04/12/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2135679/View
 */
public class Inventory
{
    private static ArrayList<Vehicle> vehicles;
    
    /**
     * Public getter method to get the value of vehicles;
     * @return returns a colloection of Vehicles as ArrayList;
     */
    public static ArrayList<Vehicle> getVehicles()
    {
        return vehicles;
    }
    
    /**
     * Public setter method to set the value of Vehicles;
     * @param takes value parameter as ArrayList;
     */
    public static void setVehicles(ArrayList<Vehicle> value)
    {
       if(value != null)
       {
           vehicles = value;
       }
    }
    
    public void addVehicle(Vehicle vehicle)
    {
        if(vehicle != null)
        {
            vehicles.add(vehicle);
        }
    }
    
    public void searchByModel(String model)
    {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        
        for(Vehicle v : vehicles)
        {
            if(v.getModel() == model)
            {
                results.add(v);
            }
        }
        
        displaySearchResults(results);
    }
    
    public void searchByYear(int year)
    {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        
        for(Vehicle v : vehicles)
        {
            if(v.getYear() == year)
            {
                results.add(v);
            }
        }
        
        displaySearchResults(results);
        
    }
    
    public void searchByPrice(double minPrice, double maxPrice)
    {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        
        for(Vehicle v : vehicles)
        {
            if(v.getSellingPrice() >= minPrice && v.getSellingPrice() <= maxPrice)
            {
                results.add(v);
            }
        }
        
        displaySearchResults(results);
    }
    
    public void displaySearchResults(ArrayList<Vehicle> results)
    {
        if(results != null)
        {
            for(Vehicle v : vehicles)
            {
                v.printDetails();
            }
        }
    }
    
    public static void removeVehicle(String stockCode)
    {
        if(!stockCode.equals(""))
        {
            Iterator<Vehicle> itr = vehicles.listIterator();
            while(itr.hasNext())
            {
                if(itr.next().getStockCode().equals(stockCode))
                {
                    itr.remove();
                }
            }
        }
    }
    
    public String inventoryCount()
    {
        return Integer.toString(vehicles.size()); 
    }
    
    public String inventoryValue()
    {
        double totalValueOfInventory = 0.0;
        for(Vehicle v : vehicles)
        {
            totalValueOfInventory += v.getSellingPrice();
        }
        
        return Double.toString(totalValueOfInventory);
    }
    
    public void displayInventory()
    {
        for(Vehicle v : vehicles)
        {
            v.printDetails();
        }
    }
}
