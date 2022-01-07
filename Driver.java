import java.util.ArrayList;

public class Driver{

  public static void main( String [] args )
  {
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
    //pochmann.insertionSortV(glen);
    //pochmann.bubbleSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    ArrayList coco = pochmann.populate( 10, 1, 1000 );
    System.out.println( "\n\nArrayList coco before sorting:\n" + coco );
    pochmann.selectionSortV(coco);
    //pochmann.insertionSortV(coco);
    //pochmann.bubbleSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );

   
  }//end main
}
