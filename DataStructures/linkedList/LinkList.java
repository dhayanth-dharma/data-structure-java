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
public class LinkList {
    private Link first;

    public LinkList() {
        first=null;
    }
    
    public boolean isEmpty(){
        return first==null;
    }
    
    public void insertFirst(int id,double dd){
        Link newLink=new Link(id,dd);
        newLink.next=first;
        first=newLink;
    }
    
    public Link deleteFirst(){
        Link temp=first;
        first=first.next;
        return temp;
    }
    
    public void displayList(){
        Link current=first;
        while(current!=null){
            current.displyLink();
            current=current.next;
        }
        System.out.println("");
    }
}
