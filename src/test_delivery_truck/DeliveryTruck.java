/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_delivery_truck;

import java.util.Arrays;

/**
 *
 * @author peterrodriguez
 */
public class DeliveryTruck <T> implements Mail {
    public Mail[] mail = new Mail[10]; 
    public int count = 0; 
    
    @Override
    public String getAddress()
    {
        return "address: "; 
    }
    void load (Mail mail)
    {

        this.mail[count] = mail; 
        this.count++;
    }
    
    public void printLoad()
    {
        int l = 0; 
        int p = 0; 
        //System.out.println("\nTruck contains: ");
        for(Mail x: mail)
        {
            System.out.println(x);
            if(x instanceof Letter)
                l++;
            else 
                p++;     
        }
        System.out.println("\nTruck contains: " + l + " letters and " + p + " packages");
    }
    
    @Override
    public String toString()
    {

        return "Delivery Truck" ; 
    }
}
