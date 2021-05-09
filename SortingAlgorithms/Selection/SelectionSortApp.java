/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Selection;

/**
 *
 * @author icbt
 */
public class SelectionSortApp {
     public static void main(String[] args) {
        ArraySel arr=new ArraySel(10);
        arr.insert(100);
        arr.insert(120);
        arr.insert(50);
        arr.insert(45);
        arr.insert(80);
        arr.insert(110);
        
        arr.display();
        
        arr.selectionSort();
        
        arr.display();
    }
}
