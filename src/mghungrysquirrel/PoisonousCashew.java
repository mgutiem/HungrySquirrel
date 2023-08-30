/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mghungrysquirrel;

import java.util.Random;
/**
 *
 * @author Miguel Gutierrez
 */

public class PoisonousCashew extends Nut{
    
    public Random rand;

    public PoisonousCashew(){
        // Set the nutritional points, symbol, name, and action for the cashew object
        nutritionPoints = -15;
        symbol = 'C';            
        name = "Poisonous cashew";
        action = "lost";
        rand = new Random();        
        create();
    }
    
    public void move() {
        int newRow = row + rand.nextInt(3) - 1; // -1, 0, or 1
        int newCol = column + rand.nextInt(3) - 1; // -1, 0, or 1
        // Check if the new position is within the maze boundaries and not occupied by a wall
        if (newRow >= 0 && newRow < Maze.maze.length && newCol >= 0 && newCol < Maze.maze[0].length
                && Maze.available(newRow, newCol)) {
            Maze.maze[row][column] = null;
            row = newRow;
            column = newCol;
            Maze.maze[row][column] = this;
        }
    }

}