/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mghungrysquirrel;
import java.util.Scanner;

/**
 *
 * @author Miguel Gutierrez
 */
public class Squirrel extends Entity implements Movable {
    public int pointsCollected;
    public int totalNutsEaten;
    public int row;
    public int column;

    /**
     * Squirrel constructor.
     */    
    public Squirrel() {
        this.pointsCollected = 0;
        this.totalNutsEaten = 0;
        create();
    }
    /**
     * Create method.
     */    
    @Override
    public final void create() {
        Scanner in = new Scanner(System.in);
        
        // Initialize the user input flag to false
        boolean userInput = false;

        while (!userInput) {
            System.out.println("Enter the Squirrel position (row , column):");
            String[] position = in.nextLine().split(",");
            if (position.length != 2) {
                System.err.println("Invalid format! Enter two numbers separated by a comma.");
                continue;
            }
            // Try to parse the row and column values from the user's input
            try {
                row = Integer.parseInt(position[0].trim()) - 1;
                column = Integer.parseInt(position[1].trim()) - 1;
            } catch (NumberFormatException e) {
                System.err.println("Invalid format! Enter two numbers separated by a comma.");
                continue;
            }
            if (!Maze.available(row,column)) {
                System.err.println("Position not available. Try again!");
                continue;
            }

            userInput = true;
            System.out.println("User input accepted.");           
        }
        symbol = '@';
    }

    /**
     * Moves the squirrel to the next position in the specified direction and updates its points and total nuts eaten
     * accordingly.
     * @param direction the direction in which to move the squirrel
     */ 
    @Override
    public void move(char direction) {
        
        Maze.maze[row][column] = null; // remove the current position of the squirrel from the maze
        
        // calculate the position of the squirrel in the next step
        int[] nextPos = switch (direction) {
            case 'u' -> new int[]{row - 1, column};
            case 'd' -> new int[]{row + 1, column};
            case 'r' -> new int[]{row, column + 1};
            default -> new int[]{row, column - 1};
        };
        
        // put the squirrel in the next position in the maze and get the entity at that position
        Entity entity = put(nextPos[0], nextPos[1]);

        if (entity instanceof Wall) {
           // if the squirrel hits a wall
            System.err.println("Squirrel hit a wall!");
            Maze.maze[nextPos[0]][nextPos[1]] = new Wall(nextPos[0], nextPos[1]);
        } else if (entity instanceof Nut nut) {
            // if the squirrel finds a nut, eat it and update points and total nuts eaten accordingly
            pointsCollected += nut.nutritionPoints;
            if (entity instanceof Almond || entity instanceof Peanut){
                totalNutsEaten++;           
            }
            if (entity instanceof PoisonousCashew){
                if (pointsCollected < 0){
                    // if the squirrel eats a poisonous cashew and has negative points, the game ends
                    System.err.println("Squirrel ate a Poisonous cashew and lost 15 points. GAME OVER!");
                    Maze.display();
                    System.exit(0); 
                }                                                
            }            
            System.out.println("Squirrel ate one " 
                    + nut.name 
                    + " and " +  nut.action + " " +
                    + Math.abs(nut.nutritionPoints)
                    + " points. Total points: " 
                    + pointsCollected);             
            row = nextPos[0];
            column = nextPos[1];
        } else if (entity == null) {
            row = nextPos[0];
            column = nextPos[1];
        }
        
        if(totalNutsEaten == Nut.TOTAL_NUTS){
            System.out.println("\nSquirrel successfully collected all the nuts. Total points: " + 
                    pointsCollected +
                    "\nThank you for playing this game!\n");
        }                
    }

    public int getPointsCollected() {
        return pointsCollected;
    }

    public int getTotalNutsEaten() {
        return totalNutsEaten;
    }

}

