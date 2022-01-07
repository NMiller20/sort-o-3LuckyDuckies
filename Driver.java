import java.util.ArrayList;

public class Driver{

  public static void main( String [] args )
  {
    Sorts pochmann = new Sorts();
    //===============for VOID methods=============
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    pochmann.selectionSortV(glen);
    //pochmann.insertionSortV(glen);
    //pochmann.bubbleSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    ArrayList coco = pochmann.populate( 10, 1, 1000 );
    System.out.println( "\n\nArrayList coco before sorting:\n" + coco );
    pochmann.selectionSortV(coco);
    //pochmann.insertionSortV(coco);
    //pochmann.bubbleSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );
    // ============================================

    //==========for AL-returning methods==========
      // glen = new ArrayList<Integer>();
      // glen.add(7);
      // glen.add(1);
      // glen.add(5);
      // glen.add(12);
      // glen.add(3);
      // System.out.println( "ArrayList glen before sorting:\n" + glen );
      // ArrayList glenSorted = selectionSort( glen );
      // System.out.println( "sorted version of ArrayList glen:\n"
      // + glenSorted );
      // System.out.println( "ArrayList glen after sorting:\n" + glen );
      //
      // coco = populate( 10, 1, 1000 );
      // System.out.println( "ArrayList coco before sorting:\n" + coco );
      // ArrayList cocoSorted = selectionSort( coco );
      // System.out.println( "sorted version of ArrayList coco:\n"
      // + cocoSorted );
      // System.out.println( "ArrayList coco after sorting:\n" + coco );

  //============================================

  }//end main
}
