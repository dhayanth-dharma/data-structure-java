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
public class Link {
    public int iData;
    public double dData;
    public Link next;

    public Link(int id,double dd) {
        iData=id;
        dData=dd;
    }
    
    public void displyLink(){
        System.out.println("{"+ iData+","+dData+"}");
    }
}
