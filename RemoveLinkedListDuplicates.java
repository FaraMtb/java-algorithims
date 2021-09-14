package com.ematrix;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class RemoveLinkedListDuplicates {

    public void removeDuplicates(List S){
        if(S.isEmpty()){return;}

        for(int i=0;i<S.size();i++){
            int data =(int)S.get(i);

            for(int j=i+1;j<S.size();j++){

                  if(data==(int)S.get(j)){
                     S.remove(j);
                  }
            }
        }
    }

    static class node
    {
        int val;
        node next;

        public node(int val)
        {
            this.val = val;
        }
    }

    /* Function to remove duplicates from a
       unsorted linked list */
    static void removeDuplicate(node head)
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        node current = head;
        node prev = null;
        while (current != null)
        {
            int curval = current.val;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }

    }

    public void deleteDups2(node head) {
        node current = head;
        while (current != null) {
             /* Remove all future nodes that have the same value */
            node runner = current;
             while (runner.next != null) {
                 if (runner.next.val == current.val) {
                     runner.next = runner.next.next;
                 } else {
                     runner = runner.next;
                      }
                  }
             current=current.next;
             }
         }

    public static void main(String[] args){
        LinkedList list =new LinkedList();
        list.push(10);
        list.push(12);
        list.push(10);
        list.push(12);
        list.push(8);
        list.push(1);
        list.push(34);
        RemoveLinkedListDuplicates removeLinkedListDuplicates=new RemoveLinkedListDuplicates();
        removeLinkedListDuplicates.removeDuplicates(list);
        for(Object item:list){
            System.out.print(item+"\n");}

        /* The constructed linked list is:
         10->12->11->11->12->11->10*/
        node start = new node(10);
        start.next = new node(12);
        start.next.next = new node(11);
        start.next.next.next = new node(11);
        start.next.next.next.next = new node(12);
        start.next.next.next.next.next = new node(11);
        start.next.next.next.next.next.next = new node(10);

        System.out.println("Linked list before removing duplicates :");

    }
}
