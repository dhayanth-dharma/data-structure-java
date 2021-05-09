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
public class RevWord {
    private String input;
    private String output;

    public RevWord(String in) {
        input=in;
    }
    
    public String doRev(){        
        LinkStack theStack=new LinkStack();
        for(int j=0;j<input.length();j++){
            char ch=input.charAt(j);
            theStack.push(ch);
        }
        
        output="";
        while(!theStack.isEmpty()){
            char ch=theStack.pop();
            output=output+ch;
        }
        return output;
    }
}
