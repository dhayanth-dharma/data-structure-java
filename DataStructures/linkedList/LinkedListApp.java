/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlistapp;

/**
 *
 * @author icbt
 */
public class LinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkList theList=new LinkList();
        theList.insertFirst(1, 100);
        theList.insertFirst(2, 200);
        theList.insertFirst(3, 300);
        theList.insertFirst(4, 400);
        
        theList.displayList();
        
        theList.deleteFirst();
        theList.deleteFirst();
         
        theList.displayList();
    }
    
}
