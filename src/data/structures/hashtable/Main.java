package data.structures.hashtable;

public class Main {

    public static void main(String[] args) {

        HashTable myHashtable = new HashTable();

        myHashtable.set("nails", 100);
        myHashtable.set("tile", 50);
        myHashtable.set("lumber", 80);

        myHashtable.set("bolts", 200);
        myHashtable.set("screws", 140);

        System.out.println(  myHashtable.get("lumber") );
        System.out.println(  myHashtable.get("screws"));

        System.out.println( myHashtable.keys() );

         myHashtable.printTable();






    }


}
