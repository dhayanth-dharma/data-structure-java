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
public class MemberArrayDemo {
    public static void main(String[] args) {
        Member m1=new Member(1, "abc");
        Member m2=new Member(2, "xyz");
        Member m3=new Member(3,"LMN");
        Member m4 =new Member(4,"ZZZ");
        
        MemberArray memArray=new MemberArray(10);
        memArray.insert(m1);
        memArray.insert(m2);
        memArray.insert(m3);
        memArray.insert(m4);
        
        int searchKey=3;
        
        if(memArray.find(searchKey)){
           System.out.println("Found "+ searchKey);
        }else{
            System.out.println("Not Found "+ searchKey);
        }
        
        if(memArray.findB(searchKey)){
           System.out.println("Found "+ searchKey);
        }else{
            System.out.println("Not Found "+ searchKey);
        }
    }
 
}
