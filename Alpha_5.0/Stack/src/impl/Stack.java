package impl;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Integer> list ;
    private int top;

    Stack(){
        list = new ArrayList<>();
        top = -1;
    }

    //empty
    public boolean isEmpty(){
        return list.size() == 0;
    }

    //push
    public void push(int data){

        list.add(data);
        top = data;
    }
    //pop
    public int pop(){
        if(isEmpty())
            return -1;
        top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    //peek
    public int peek(){
        if(isEmpty())
            return -1;
        return list.get(list.size()-1);
    }

}
