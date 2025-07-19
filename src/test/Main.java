package test;

public class Main {

    public static void main(String[] args){

        Linked link = new Linked(2);

        link.append(3);

        link.printList();

        link.removeLast();
        System.out.println(" After Delete Operation ");
        link.printList();

    }
}
