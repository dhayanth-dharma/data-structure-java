/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queueapp;

/**
 *
 * @author icbt
 */
public class QueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue theQueue=new Queue(5);
        
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        
        theQueue.remove();
        theQueue.remove();
        theQueue.remove();
        
        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);
        
        while(!theQueue.isEmpty()){
            int n=theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
        
    }
    
}
