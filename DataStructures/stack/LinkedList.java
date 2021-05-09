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
public class LinkedList {
    private Link first;
    private Link last;

    public LinkedList() {
        first=null;
        last=null;
    }
    
    public boolean isEmpty(){
        return first==null;
    }
    
    public void insertFirst(char dd){
        Link newLink=new Link(dd);
        
        if(isEmpty()){
            last=newLink;
        }else{
            first.previous=newLink;
        }
        newLink.next=first;
        first=newLink;
    }   
   
    
    public Link deleteFirst(){
        Link temp=first;
        if(first.next==null){
            last=null;
        }else{
            first.next.previous=null;
        }
        first=first.next;
        return temp;
    }
   
     
}
