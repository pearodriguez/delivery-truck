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
public class Letter <T> implements Mail {
    public String contents; 
    
    public Letter (String c)
    {
        this.contents = c; 
    }
    
    @Override
    public String getAddress() 
    {
        return this.address; 
    }
    
    @Override
    public String toString()
    {
        return "\nLetter" + "\nContents: " + contents + "\nAddress: " + this.address; 
    }

}
