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
public class MemberArray {
    private Member[] a;
    private int nElems;

    public MemberArray(int max) {
        a=new Member[max];
        nElems=0;
    }
    
    public void insert(Member m){
        a[nElems]=m;
        nElems++;
    }
    
    public boolean find(int searchKey){ //linear search
        int j;
        for(j=0;j<nElems;j++){
            if(a[j].getmID()==searchKey){
                break;
            }
        }     
        if(j==nElems){
            return false;
        }else{
            return true;
        }
        
    }
    
    public boolean findB(int searchKey){ //binary search
        int lower=0;
        int upper=nElems-1;
        int mid;
        while(true){
            mid=(lower+upper)/2;
            if(a[mid].getmID()==searchKey){
                return true;
            }else if(lower>upper){
                return false;
            }else{
                if(a[mid].getmID()<searchKey){
                    lower=mid+1;
                }else{
                    upper=mid-1;
                }
            }
        }
        
    }
    
}
