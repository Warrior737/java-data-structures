package data.structures.hashtable;

import java.util.ArrayList;
import java.util.HashMap;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;

    class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }


    public void printTable() {
        for (int i = 0; i < dataMap.length ; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while( temp != null ) {
                System.out.println("  { " + temp.key + " = " + temp.value + " } " );
                temp = temp.next;
            }
        }
    }

    // Big O ->  O(1)
    private int hash(String key) {
        int hash = 0;
        char[] keychars = key.toCharArray();

        for (int i = 0; i < keychars.length ; i++) {
            int asciiValue = keychars[i];
            hash = ( hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    //Big O -> O(1)
    public void set (String key, int value){

        int index = hash(key);
        Node newNode = new Node(key, value);

        if (dataMap[index] == null){
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Big O ->  O(1)
    public int get(String key) {
        int index = hash(key);

        Node temp = dataMap[index];

        while(temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys (){
        ArrayList<String> allKeys = new ArrayList<>();

        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null){
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }



    // Big O ->  O(N^2)
    public static boolean itemInCommon(int[]  array1, int[] array2) {

        for (int i : array1){
            for (int j : array2){
                if( i == j ) return true;
            }
        }
        return false;
    }

    //Big O -> O(N2) -> Drop constants -> O(N)
    public static boolean itemInCommonHashTable(int[]  array1, int[] array2) {
        HashMap<Integer,Boolean> myHashMap = new HashMap<>();

        for(int i : array1) {
            myHashMap.put(i, true);
        }
        for (int j : array2) {
            if (myHashMap.get(j) != null) return true;
        }
        return false;
    }
}
