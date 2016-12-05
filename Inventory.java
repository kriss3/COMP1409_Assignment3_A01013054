import java.util.*;
/**
 * Inventory class to model car shop inventory. Objects of this class are to manage 
 * vehicles currently in the inventory.
 * 
 * @author Krzysztof Szczurowski
 * @version 1.1
 * @since 04/12/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2135679/View
 */
public class Inventory
{
    private static ArrayList<Vehicle> vehicles;
    
    public Inventory()
    {
        vehicles = new ArrayList<Vehicle>();
    }
    
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
   
    /**
     * Public method to add vehicle to inventory;
     * @param takes parameter vehicle as Vehicle;
     */
    public void addVehicle(Vehicle vehicle)
    {
        if(vehicle != null)
        {
            vehicles.add(vehicle);
        }
    }
    
    /**
     * Public method to seach inventory by vehicle's model;
     * @param takes parameter model as String;
     */
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
    
    /**
     * Public method to seach inventory by vehicle's year;
     * @param take parameter year as Integer;
     */
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
    
    /**
     * Public method to search inventory by min and max Price;
     * @param takes minPrice parameter as double;
     * @param takes maxPrice parameter as double;
     */
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
    
    /**
     * Public method to display Inventory search results;
     * @param takes results parameter as ArrayList of Vehicles;
     */
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
    
    /**
     * Public method to remove Vehicle from Inventory identified by Vehicle's StockCode;
     * @param takes stockCode parameter as String;
     */
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
    
    /**
     * Public method to count number of Vehicles in Inventory;
     * @return returns count of Vehicles in Inventory as String;
     */
    public String inventoryCount()
    {
        return Integer.toString(vehicles.size()); 
    }
    
    /**
     * Public method to get a total of car Inventory;
     * @return returns dolar value of all Vehicles int he inventory;
     */
    public String inventoryValue()
    {
        double totalValueOfInventory = 0.0;
        for(Vehicle v : vehicles)
        {
            totalValueOfInventory += v.getSellingPrice();
        }
        
        return Double.toString(totalValueOfInventory);
    }
    
    /**
     * Public method to display Vehicle's details in Inventory;
     */
    public void displayInventory()
    {
        for(Vehicle v : vehicles)
        {
            v.printDetails();
        }
    }
}
