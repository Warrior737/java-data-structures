package data.structures.trees;

public class Main {

    public static void main(String[] args) {

        /*          Binary Search Node Insert

                            <-47->
                      <-21->       <-76->
                  <-18->  <-27->  <-52->  <-82->
                           *new
         */
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);

        System.out.println(myBST.root.left.right.value);

        System.out.println("Non Recursive :" + myBST.contains(27));
        System.out.println("Non Recursive :" + myBST.contains(17));

        // Recursive Example

        System.out.println("Recursive Contains 27: " + myBST.rContains(27));
        System.out.println("Recursive Contains 17:" + myBST.rContains(17));


        // Min Value
        System.out.println(myBST.minValue(myBST.root));
        System.out.println(myBST.minValue( myBST.root.right));


        // Recursive Insert

        BinarySearchTree myBSearchT = new BinarySearchTree();
        myBSearchT.rInsert(2);
        myBSearchT.rInsert(1);
        myBSearchT.rInsert(3);

        /*
        Lines Above Create this Tree:
                        2
                       / \
                      1   3
         */

        System.out.println("Root" + myBSearchT.root);
        System.out.println("Root -> Left: " + myBSearchT.root.left.value);
        System.out.println("Root -> Right: " + myBSearchT.root.right.value);

        myBSearchT.deleteNode(2);

                /*
        Lines Above Create this Tree:
                        2
                       / \
                      1   null
         */

        System.out.println("Delete Node ");
        System.out.println("Root" + myBSearchT.root);
        System.out.println("Root -> Left: " + myBSearchT.root.left.value);
        System.out.println("Root -> Right: " + myBSearchT.root.right);


        /*
        Breadth First Search Method
         */

        System.out.println("Print Breadth First Search Traversal");
        System.out.println(myBST.breadthFirstTraversal());

        /*
        Depth First Search Pre-Order
         */
        System.out.println(" Depth First Search Pre-Order ");
        System.out.println( myBST.DepthFirstSearchPreOrder());


        /*
         Depth First Search Post Order
         */
        System.out.println("  Depth First Search Post Order ");
        System.out.println(myBST.depthFirstSearchPostOrder());

        /*
         Depth First Search In Order
         */
        System.out.println("  Depth First Search In Order ");
        System.out.println(myBST.depthSearchInOrder());

    }
}
