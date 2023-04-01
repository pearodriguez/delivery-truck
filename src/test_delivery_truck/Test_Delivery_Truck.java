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
public class Test_Delivery_Truck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mail l1 = new Letter ("Billing"); 
        Mail l2 = new Letter ("Invitation"); 
        Mail l3 = new Letter ("Acceptance letter"); 
        Mail l4 = new Letter ("Credit balance"); 
        Mail l5 = new Letter ("Billing");
                

        Package <Item> p1 = new Package(new Item[3]); 
        Item toy = new Item ("GI Joe", "Action figure"); 
        Item book = new Item ("Dr. Seuss", "children's book"); 
        Item puzzle = new Item ("Puzzle", "dino puzzle"); 
        p1.items[0] = toy;  
        p1.items[1] = book; 
        p1.items[2] = puzzle; 
        Package <Item> p2 = new Package(new Item[2]); 
        Item markers = new Item ("Markers", "Assortment of Colors"); 
        Item notebooks = new Item ("Notebooks", "College Ruled"); 
        p2.items[0] = markers; 
        p2.items[1] = notebooks; 
        Package <Item> p3 = new Package(new Item[1]); 
        Item printer = new Item ("Printer", "Laser printer"); 
        p3.items[0] = printer; 
        Package <Item> p4 = new Package(new Item[1]); 
        Item laptop = new Item ("Laptop", "16gb Ram, 512gb Storage"); 
        p4.items[0] = laptop;
        Package <Item> p5 = new Package(new Item[1]); 
        Item camera = new Item ("Camera", "4k camera"); 
        p5.items[0] = camera;
        
        DeliveryTruck <Mail> mailTruck = new DeliveryTruck(); 

        mailTruck.load(l1); 
        mailTruck.load(l2); 
        mailTruck.load(l3); 
        mailTruck.load(l4); 
        mailTruck.load(l5); 
        mailTruck.load(p1); 
        mailTruck.load(p2); 
        mailTruck.load(p3); 
        mailTruck.load(p4); 
        mailTruck.load(p5); 
        mailTruck.printLoad(); 
        

    }
    
}
