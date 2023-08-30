/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mghungrysquirrel;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Miguel Gutierrez
 */
public class HungrySquirrelGame {
    private static final String FILENAME = "Maze.txt";
    
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Maze.create(FILENAME);
            Maze.display();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return;
        }
        
        // Create squirrel and add to maze
        Squirrel squirrel = new Squirrel();
        Maze.maze[squirrel.row][squirrel.column] = squirrel;
        
        // Create Nuts and add to maze
        Maze.createNuts();
        
        // Create cashews and add to maze
        PoisonousCashew[] cashews = new PoisonousCashew[5];
     
        for (int i = 0; i < cashews.length; i++) {
            cashews[i] = new PoisonousCashew();
            Maze.maze[cashews[i].row][cashews[i].column] = cashews[i];
        }
        
        String userInput;
        try (Scanner in = new Scanner(System.in)) {
            while (squirrel.getTotalNutsEaten() < 5 && squirrel.getPointsCollected() >= 0) {
                Maze.display();
                while (true) {
                    System.out.print("Enter commands u,d,l,r to move Up, Down, Left, and Right to move the squirrel, or type quit:\n");
                    userInput = in.nextLine().toLowerCase();
                    if (userInput.contains("quit")){
                        System.out.println("\nThank you for playing this game!");
                        return;
                    }
                    if(!userInput.matches("[udlr]")){
                        System.err.println("Invalid input format. Enter commands u,d,l,r to move Up, Down, Left, and Right.\n");
                        continue;
                    }

                     // Move the squirrel in the maze
                    squirrel.move(userInput.charAt(0));
                    Maze.maze[squirrel.row][squirrel.column] = squirrel;
                    
                    // Move the cashews in the maze
                    for (int i = 0; i < cashews.length; i++) {
                        PoisonousCashew cashew = cashews[i];
                        if (cashew != null) {
                            if (cashew.row == squirrel.row && cashew.column == squirrel.column) {
                                cashews[i] = null;
                            } else {
                                cashew.move();
                                Maze.maze[cashew.row][cashew.column] = cashew;
                            }
                        }
                    }
                    break;
                }
            }
        }
        Maze.display();
    }
}