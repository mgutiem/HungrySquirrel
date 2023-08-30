/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mghungrysquirrel;
/**
 *
 * @author Miguel Gutierrez
 */

public class Peanut extends Nut{
    
    public Peanut(){
        // Set the nutritional points, symbol, name, and action for the object
        nutritionPoints = 10;
        symbol = 'P'; 
        name = "Peanut";
        action = "gained";

        // Call the method to randomly assign a position to the Peanut object
        create();
    }

}
