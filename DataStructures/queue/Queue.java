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
public class Queue {
    private int max;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        max=s;
        queArray=new int[max];
        front=0;
        rear=-1;
        nItems=0;
    }
    
    public void insert(int j){
        if(rear==max-1){
            rear=-1;
        }
        queArray[++rear]=j;
        nItems++;
    }
    
    public int remove(){
        int temp=queArray[front++];
        if(front==max){
            front=0;
        }
        nItems--;
        return temp;
    }
    
    public int peekFront(){
        return queArray[front];
    }
    
    public boolean isEmpty(){
        return nItems==0;
    }
    
    public boolean isFull(){
        return nItems==max;
    }
    
    public int size(){
        return nItems;
    }
}
