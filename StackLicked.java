package com.ematrix;

import javax.swing.text.Position;
import java.util.LinkedList;


public class StackLicked {
    //LIFO

    LinkedList<String> stackData;
    public StackLicked(){
        stackData=new LinkedList<>();
    }
    int count=-1;
    public void push(String newElement){
        count+=1;
        stackData.add(newElement);
    }
    public String popStack(){
        if(count==-1){
            return "Stack empty";
        }
        count-=1;
        return stackData.remove(count);
    }

    public int size(){
        return (count+1);
    }

    public String peek(){
        return stackData.get(count);
    }
    public boolean isEmpty(){
       if(count==-1)
           return true;

       return false;
    }

    public LinkedList<String> getStackData() {
        return (LinkedList)stackData;
    }
}
