
import java.util.ArrayList;

public class Sorts{
  

//~~~~~~~~~~~~~~~~~~~ HELPER METHODS BEGIN ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }


  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }


// swapping
public static void swapInsert(ArrayList<Comparable> data, int i){ // here, swap means to swap stated index with the one below it
  Comparable tempStorage = data.get(i);
  data.set(i, data.get(i-1));  // resets what's in i
  data.set(i-1, tempStorage);  // resets whats in i-1
}

//   moving elements within each pass
public static void walkElement(ArrayList<Comparable> data, int index) {
 for (int i = index; i > 0; i--){
   Comparable a = data.get(i);
   Comparable b = data.get(i-1);
   if (b.compareTo(a) == 1){ // We are comparing consecutive elemnts. If the left element is greater than the right element, we need to swap
     swapInsert(data, i);
   } else {
     break; // makes things more efficient - see DISCO
   }
 }
}
//~~~~~~~~~~~~~~~~~~~ HELPER METHODS END ~~~~~~~~~~~~~~~~~~~
  
  public static void insertionSortV(ArrayList<Comparable> data){
  for ( int pass = 1; pass < data.size(); pass++ ){ // pass both the number of elements that are sorted so far,
                                                      // and the index of the element that is about to be walked to the correct place
      walkElement(data, pass);
      System.out.println("pass: " + pass); //diag
      System.out.println(data); //diag
  }
}
  
  
  public static void selectionSortV( ArrayList<Comparable> data )
  {
     // position of the greatest value
    //note: this version places greatest value at "rightmost" end
    //maxPos will point to position of SELECTION (greatest value)

    for(int pass = data.size()-1; pass > 0; pass--) { // refers to the index that will be sorted
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      int maxPos = 0;

        for(int i = pass; i > -1; i--) {
        	if ( data.get(maxPos).compareTo(data.get(i))==-1 ){
        		maxPos = i;
        	}
        }
        System.out.println( "maxPos: " + maxPos );// this for loop resets maxPos to the next value
      	System.out.println( data );//diag
        // now, we need to swap the highest value with whatever's in the highest index
        Comparable tempMax = data.get(maxPos); // store the value at maxPos, to be copied over
        data.set(maxPos, data.get(pass)); // copy over the value from the highest index
        data.set(pass, tempMax);

        System.out.println( "after swap: " +  data );//diag

    }
  }//end selectionSort
  
  
  public static void bubbleSortV( ArrayList<Comparable> data )
    { for (int p = 0; p < data.size() - 1; p++) {
        for (int i = 0; i < data.size() - 1; i++) {
            Comparable a = data.get(i); //gets value at index i
            Comparable b = data.get(i + 1);
            if (a.compareTo(b) > 0) {
                data.set(i, b);
                data.set(i + 1, a);
            } // end if
        } // end second loop
    } // end first loop
    }
  
  
  public static void main( String [] args )
  {

    //===============for VOID methods=============
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );
    // ============================================

    //==========for AL-returning methods==========
      glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );

  //============================================

  }//end main
}
