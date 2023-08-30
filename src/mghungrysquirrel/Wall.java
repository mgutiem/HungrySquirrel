/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mghungrysquirrel;
/**
 *
 * @author Miguel Gutierrez
 */
public class Wall extends Entity{
    public Wall(int row, int col) {
        this.row = row;
        this.column = col;
        symbol = '*';
    }

    @Override
    public void create() {
    }    
}
