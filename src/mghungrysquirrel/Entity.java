/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mghungrysquirrel;
/**
 *
 * @author Miguel Gutierrez
 */
public abstract class Entity {
    protected char symbol; // symbol representing the entity
    protected int row; // row position of the entity in the maze
    protected int column; // column position of the entity in the maze
    
    public abstract void create(); // abstract method for creating entities
    
    // put the entity at a specific row and column in the maze and return it
    public Entity put(int row, int column){
        return Maze.maze[row][column];
    }

    
    @Override
    public String toString() {
        return this.symbol + "";
    }    
    
}
