/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package searchalgoritham;

/**
 *
 * @author icbt
 */
public class SearchAlgoritham {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HighArray arr=new HighArray(10);
        
        arr.insert(100);
        arr.insert(200);
        arr.insert(300);
        arr.insert(400);
        arr.insert(500);
        
        int searchKey=150;
        //linear search
        if(arr.find(searchKey)){
            System.out.println("Found "+ searchKey);
        }else{
            System.out.println("Not Found "+ searchKey);
        }
        //binary search
        if(arr.findB(searchKey)){
            System.out.println("Found "+ searchKey);
        }else{
            System.out.println("Not Found "+ searchKey);
        }
    }
    
}
