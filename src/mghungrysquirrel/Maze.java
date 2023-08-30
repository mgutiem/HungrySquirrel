/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mghungrysquirrel;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Miguel Gutierrez
 */

public class Maze {
    public static final int MAX_MAZE_ROW = 20;
    public static final int MAX_MAZE_COLUMN = 50;
    public static Entity[][] maze = new Entity[MAX_MAZE_ROW][MAX_MAZE_COLUMN];

    /**
     * Reads a file containing the maze structure and creates an Entity array with the corresponding elements.
     *
     * @param fileName the name of the file containing the maze structure
     * @throws FileNotFoundException if the file does not exist or cannot be opened
     */
    public static void create(String fileName) throws FileNotFoundException {
        try (Scanner in = new Scanner(new FileReader(fileName))) {
            for (int row = 0; in.hasNextLine() && row < MAX_MAZE_ROW; row++) {
                String line = in.nextLine();
                for (int column = 0; column < MAX_MAZE_COLUMN; column++) {
                    maze[row][column] = line.charAt(column) == '*' ? new Wall(row, column) : null;
                }
            }
        }
    }

    /**
     * Displays the current state of the maze.
     */
    public static void display() {
        for (int row = 0; row < MAX_MAZE_ROW; row++) {
            for (int column = 0; column < MAX_MAZE_COLUMN; column++) {
                if (maze[row][column] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(maze[row][column]);
                }
            }
            System.out.println();
        }
    }

    /**
     * Checks if the specified position in the maze is available (i.e., there is no entity occupying that position).
     *
     * @param row the row index of the position to check
     * @param col the column index of the position to check
     * @return true if the position is available, false otherwise
     */
    public static boolean available(int row, int col) {
        return maze[row][col] == null;
    }
    
    public static void createNuts() {
        // Create the nuts and place them in the maze
        Nut[] nuts = new Nut[Nut.TOTAL_NUTS];
        Random random = new Random();
        for(int i = 0 ; i < nuts.length ; i++){
            Nut nut = random.nextInt(2) == 0 ? new Almond() : new Peanut();
            nuts[i] = nut;
            Maze.maze[nut.row][nut.column] = nut;
        }
    }
}

