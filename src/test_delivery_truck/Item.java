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
class Item {
    
    private String name; 
    private String descript; 
    
    public Item ()
    {
        
    }
    
    public Item (String n, String d)
    {
        name = n; 
        descript = d; 
    }
    
    public String setName(String n)
    {
        name = n; 
        return name; 
    }
    
    public String getName ()
    {
        return name; 
    }
   
    public String setDescript(String d)
    {
        descript = d; 
        return descript; 
    }
    
    public String getDescript ()
    {
        return descript; 
    }
    
    @Override
    public String toString()
    {
        return "Name: " + name + "\nDescription: " + descript; 
    }
}
