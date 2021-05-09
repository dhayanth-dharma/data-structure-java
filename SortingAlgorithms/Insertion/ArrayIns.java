/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Insertion;

/**
 *
 * @author icbt
 */
public class ArrayIns {
     private int[] a;
     private int nElems;

    public ArrayIns(int max) {
        a=new int[max];
        nElems=0;
    }
    
     public void insert(int value){
        a[nElems]=value;
        nElems++;
    }
    
    public void display(){
        for(int j=0;j<nElems;j++){
            System.out.print(a[j]+" ");
        }
        System.out.println("");
    }
    
    public void insertionSort(){
        int in, out;
        for(out=1;out<nElems;out++){
            int temp=a[out];
            in=out;
            while(in>0 && a[in-1]>=temp){
                a[in]=a[in-1];
                --in;
            }
           a[in]=temp;
        } 
    }
    
    
}
