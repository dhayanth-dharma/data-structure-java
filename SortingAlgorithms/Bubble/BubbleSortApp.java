/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bubble;

/**
 *
 * @author icbt
 */
public class BubbleSortApp {
    public static void main(String[] args) {
        ArrayBub arr=new ArrayBub(10);
        arr.insert(100);
        arr.insert(120);
        arr.insert(50);
        arr.insert(45);
        arr.insert(80);
        arr.insert(110);
        
        arr.display();
        
        arr.bubbleSort();
        
        arr.display();
    }
}
