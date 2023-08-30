/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mghungrysquirrel;
/**
 *
 * @author Miguel Gutierrez
 */

public class Almond extends Nut {
    
    public Almond() {
        // Set the nutritional points, symbol, name, and action for the Almond object
        nutritionPoints = 5;
        symbol = 'A'; 
        name = "Almond";    
        action = "gained";
        
        // Call the method to randomly assign a position to the Almond object
        create();
    }
    
}
