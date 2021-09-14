package com.ematrix;

import java.util.*;

public class GroupAnagrams {


    void sort(String[] array) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for (String s:array){
               String sKey=sortChars(s);
               if(map.containsKey(sKey)){
                   map.get(sKey).add(s);
               }
               else{
                   ArrayList<String> keyList=new ArrayList();
                   keyList.add(s);
                   map.put(sKey,keyList);
               }
        }
        int arayIndex=0;
        for(ArrayList item: map.values()){

            for(int i=0;i< item.size();i++){
                array[arayIndex]=(String) item.get(i);
                System.out.println(item.get(i));
                arayIndex++;
            }
        }
    }


         String sortChars(String s) {
         char[] content= s.toCharArray();
         Arrays.sort(content);
         return new String(content);
         }

    public static void main(String[] args)
    {

        GroupAnagrams groupAnagrams=new GroupAnagrams();
        // Driver program
        String arr[] = { "cat", "dog", "tac", "god", "act" };
        groupAnagrams.sort(arr);
    }
}

///* Group words by anagram */
//         for (String s : array) {
//                 String newWord= sortChars(s);
//                 if (map.containsKey(newWord)) {
//
//                 map.get(newWord).add(s);
//                 }
//                 else {
//
//                 // This is the first time we are
//                 // adding a word for a specific
//                 // hashcode
//                 ArrayList<String> words = new ArrayList<>();
//        words.add(s);
//        map.put(newWord, words);
//        }
//        }
//
//
//
//        int index = 0;
//        for (String key:  map.keySet()) {
//        ArrayList<String> list=  map.get(key);
//        for (String t : list) {
//        array[index] = t;
//        System.out.print(t+" , ");
//        index++;
//        }
//        }
//        }