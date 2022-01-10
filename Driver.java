import java.util.ArrayList;

public class Driver{

  public static void ascending(ArrayList<Comparable> a, int length){
    for(int i = 0; i<length; i++){
      a.add(i*2);
    }
  }

  public static void descending(ArrayList<Comparable> a, int length){
    for(int i = length - 1; i>-1; i--){
      a.add(i*2);
    }
  }

  public static void testSort(int length, String bestOrWorst){
    Sorts pochmann = new Sorts();

    ArrayList glen = new ArrayList<Comparable>();
    ArrayList bob = new ArrayList<Comparable>();
    ArrayList mike = new ArrayList<Comparable>();
    if (bestOrWorst == "best"){
      ascending(glen, length);
      ascending(bob, length);
      ascending(mike, length);
    } else{
      descending(glen, length);
      descending(bob, length);
      descending(mike, length);
    }
    if (length <= 50){
      System.out.println(glen); }
    int[] bscounters = pochmann.bubbleSortV(glen);
    System.out.println("Bubble Sort COMPARE COUNTER: " + bscounters[0] + "\nSWAP COUNTER: " + bscounters[1] + "\nPASS COUNTER: "+bscounters[2]);
    System.out.println( "ArrayList after sorting:\n" + glen );


    int[] sscounters = pochmann.selectionSortV(bob);
    System.out.println("Selection Sort COMPARE COUNTER: " + sscounters[0] + "\nSWAP COUNTER: " + sscounters[1] + "\nPASS COUNTER: "+sscounters[2]);
    System.out.println( "ArrayList after sorting:\n" + bob );

    int[] iscounters = pochmann.insertionSortV(mike);
    System.out.println("Insertion Sort COMPARE COUNTER: " + iscounters[0] + "\nSWAP COUNTER: " + iscounters[1] + "\nPASS COUNTER: "+iscounters[2]);
    System.out.println( "ArrayList mike after sorting:\n" + mike );

  }
  
  public static void testSortBig(int length, String bestOrWorst){
    Sorts pochmann = new Sorts();

    ArrayList glen = new ArrayList<Comparable>();
    ArrayList bob = new ArrayList<Comparable>();
    ArrayList mike = new ArrayList<Comparable>();
    if (bestOrWorst == "best"){
      ascending(glen, length);
      ascending(bob, length);
      ascending(mike, length);
    } else{
      descending(glen, length);
      descending(bob, length);
      descending(mike, length);
    }

    int[] bscounters = pochmann.bubbleSortV(glen);
    System.out.println("Bubble Sort COMPARE COUNTER: " + bscounters[0] + "\nSWAP COUNTER: " + bscounters[1] + "\nPASS COUNTER: "+bscounters[2]);


    int[] sscounters = pochmann.selectionSortV(bob);
    System.out.println("Selection Sort COMPARE COUNTER: " + sscounters[0] + "\nSWAP COUNTER: " + sscounters[1] + "\nPASS COUNTER: "+sscounters[2]);

    int[] iscounters = pochmann.insertionSortV(mike);
    System.out.println("Insertion Sort COMPARE COUNTER: " + iscounters[0] + "\nSWAP COUNTER: " + iscounters[1] + "\nPASS COUNTER: "+iscounters[2]);

  }

  public static void main( String [] args )
  {
    System.out.println("-------------BEST CASES:--------------------");

    System.out.println("\nSize 5 ArrayList:\n\n");
    testSort(5, "best");
    System.out.println("\nSize 10 ArrayList:\n\n");
    testSort(10, "best");
    System.out.println("\nSize 50 ArrayList:\n\n");
    testSortBig(50, "best");
    System.out.println("\nSize 100 ArrayList:\n\n");
    testSortBig(100, "best");
    System.out.println("\nSize 200 ArrayList:\n\n");
    testSortBig(200, "best");
    System.out.println("\nSize 1000 ArrayList:\n\n");
    testSortBig(1000,"best");
    System.out.println("\nSize 10000 ArrayList:\n\n");
    testSort(10000,"best");
    System.out.println("-------------WORST CASES:--------------------");
    System.out.println("\nSize 5 ArrayList:\n\n");
    testSort(5, "worst");
    System.out.println("\nSize 10 ArrayList:\n\n");
    testSort(10, "worst");
    System.out.println("\nSize 50 ArrayList:\n\n");
    testSortBig(50, "worst");
    System.out.println("\nSize 100 ArrayList:\n\n");
    testSortBig(100, "worst");
    System.out.println("\nSize 200 ArrayList:\n\n");
    testSortBig(200, "worst");
    System.out.println("\nSize 1000 ArrayList:\n\n");
    testSortBig(1000,"worst");
    System.out.println("\nSize 10000 ArrayList:\n\n");
    testSortBig(10000,"worst");
    
    //------------------------EVERYTHING BELOW IS NOT RUN AND IS COMMENTED OUT-----------------------------------
/*
    Sorts pochmann = new Sorts();

    ArrayList glen = new ArrayList<Integer>();

    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);

    System.out.println( "ArrayList glen before sorting:\n" + glen );
    int[] sscounters = pochmann.selectionSortV(glen);
    System.out.println("Selection Sort COMPARE COUNTER: " + sscounters[0] + "\nSelection sort SWAP COUNTER: " + sscounters[1] + "\nSelection sort PASS COUNTER: "+sscounters[2]);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    int[] iscounters = pochmann.insertionSortV(glen);
    System.out.println("Insertion Sort COMPARE COUNTER: " + iscounters[0] + "\nInsertion sort SWAP COUNTER: " + iscounters[1] + "\nInsertion sort PASS COUNTER: "+iscounters[2]);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    int[] bscounters = pochmann.bubbleSortV(glen);
    System.out.println("Bubble Sort COMPARE COUNTER: " + bscounters[0] + "\nBubble sort SWAP COUNTER: " + bscounters[1] + "\nBubble sort PASS COUNTER: "+bscounters[2]);
    System.out.println( "ArrayList glen after sorting:\n" + glen );
*/

/*
    // BEST CASE TEST CASE
    ArrayList bob = new ArrayList<Integer>();
    bob.add(1);
    bob.add(3);
    bob.add(7);
    bob.add(9);
    bob.add(11);
    int[] bscounters = pochmann.bubbleSortV(bob);
    System.out.println("Bubble Sort COMPARE COUNTER: " + bscounters[0] + "\nBubble sort SWAP COUNTER: " + bscounters[1] + "\nBubble sort PASS COUNTER: "+bscounters[2]);
    System.out.println( "ArrayList glen after sorting:\n" + bob );

    // WORST CASE TEST CASE
    ArrayList mike = new ArrayList<Integer>();
    mike.add(11);
    mike.add(9);
    mike.add(7);
    mike.add(3);
    mike.add(1);
    bscounters = pochmann.bubbleSortV(mike);
    System.out.println("Bubble Sort COMPARE COUNTER: " + bscounters[0] + "\nBubble sort SWAP COUNTER: " + bscounters[1] + "\nBubble sort PASS COUNTER: "+bscounters[2]);
    System.out.println( "ArrayList mike after sorting:\n" + mike );
*/

/*
    //BEST CASE TEST CASE
    ArrayList bob = new ArrayList<Integer>();
    bob.add(1);
    bob.add(3);
    bob.add(7);
    bob.add(9);
    bob.add(11);

    int[] sscounters = pochmann.selectionSortV(bob);
    System.out.println("Selection Sort COMPARE COUNTER: " + sscounters[0] + "\nSelection sort SWAP COUNTER: " + sscounters[1] + "\nSelection sort PASS COUNTER: "+sscounters[2]);
    System.out.println( "ArrayList bob after sorting:\n" + bob );

    //WORST CASE TEST CASE
    ArrayList mike = new ArrayList<Integer>();
    mike.add(11);
    mike.add(9);
    mike.add(7);
    mike.add(3);
    mike.add(1);

    sscounters = pochmann.selectionSortV(mike);
    System.out.println("Selection Sort COMPARE COUNTER: " + sscounters[0] + "\nSelection sort SWAP COUNTER: " + sscounters[1] + "\nSelection sort PASS COUNTER: "+sscounters[2]);
    System.out.println( "ArrayList mike after sorting:\n" + mike );
*/
    //BEST CASE TEST CASE
    /*
    ArrayList bob = new ArrayList<Integer>();
    bob.add(1);
    bob.add(3);
    bob.add(7);
    bob.add(9);
    bob.add(11);

    int[] iscounters = pochmann.insertionSortV(bob);
    System.out.println("Insertion Sort COMPARE COUNTER: " + iscounters[0] + "\nInsertion sort SWAP COUNTER: " + iscounters[1] + "\nInsertion sort PASS COUNTER: "+iscounters[2]);
    System.out.println( "ArrayList bob after sorting:\n" + bob );

    //WORST CASE TEST CASE
    ArrayList mike = new ArrayList<Integer>();
    mike.add(11);
    mike.add(9);
    mike.add(7);
    mike.add(3);
    mike.add(1);

    iscounters = pochmann.insertionSortV(mike);
    System.out.println("Insertion Sort COMPARE COUNTER: " + iscounters[0] + "\nInsertion sort SWAP COUNTER: " + iscounters[1] + "\nInsertion sort PASS COUNTER: "+iscounters[2]);
    System.out.println( "ArrayList mike after sorting:\n" + mike );

*/
/*
    ArrayList coco = pochmann.populate( 10, 1, 1000 );
    System.out.println( "\n\nArrayList coco before sorting:\n" + coco );
    pochmann.selectionSortV(coco);
    //pochmann.insertionSortV(coco);
    //pochmann.bubbleSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );
*/

  }//end main
}
