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
public class ArrayBub {
    private int[] a;
    private int nElems;

    public ArrayBub(int max) {
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
    
    private void swap(int one, int two){
        int temp=a[one];
        a[one]=a[two];
        a[two]=temp;
    }
    
    public void bubbleSort(){
        int out,in;
        for(out=nElems-1;out>1;out--){
            for(in=0;in<out;in++){
                if(a[in]>a[in+1]){
                    swap(in,in+1);
                }
            }
        }
        
    }
}
