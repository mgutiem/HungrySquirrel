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
public abstract class Nut extends Entity{
    public static final int TOTAL_NUTS = 5;
    public int nutritionPoints;
    public String name;
    public String action;

    public String getName() {
        return name;
    }    
    
    @Override
    public void create(){
        // Keep looping until a valid position is found        
        do {
             // Randomly assign a row and column for the Nut object
            row = new Random().nextInt(Maze.MAX_MAZE_ROW);
            column = new Random().nextInt(Maze.MAX_MAZE_COLUMN);
        } while (!Maze.available(row, column)); // Check if the assigned position is available in the maze
    }

}
