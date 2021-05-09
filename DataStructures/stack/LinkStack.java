/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

/**
 *
 * @author icbt
 */
public class LinkStack {
     private LinkedList theList;

    public LinkStack() {
        theList=new LinkedList();
    }
    
    public void push(char d){
        theList.insertFirst(d);
    }
    
    public char pop(){
        return theList.deleteFirst().dData;
    }
    
    public boolean isEmpty(){
        return theList.isEmpty();
    }
}
