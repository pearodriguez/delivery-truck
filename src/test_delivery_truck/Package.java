/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_delivery_truck;

/**
 *
 * @author peterrodriguez
 */
public class Package <T> implements Mail {
    public Item[] items; 
    
    public Package ()
    {
        
    }
    public Package (Item [] i)
    {
        this.items = i; 
    }
    
    @Override
    public String getAddress()
    {
        return this.address; 
    }
    
    public Item[] getItem ()
    {
        return this.items; 
    }
    
    public void printPackage()
    {
        
        System.out.println("\nPackage contains: ");
        for(Item x: items)
            System.out.println(x);
        System.out.println("Address: " + this.address);
    }
    
    @Override
    public String toString()
    {
        return "\nPackage: " + "\n" + items[0] + "\nAddress: " + this.address  ; 
    }
}
  