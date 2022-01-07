

/*
* DISCO:


* QCC:
What is the best/worse case scenario for insertionSort?

Do helper functions cause code to run slower by increasing the number of invocations a method involves?
If so, are we right to implement helper functions as a way of improving our code?

How rigorously are we proving that case A is the best/worst case for a given algorithm?
In other words, are we expected to count the number of passes, swaps, and comparisons for a n! ways in the
ArrayList can originally be ordered for multiple differen values of n, and process this data? or would it suffice to
simply do this once, with a relatively small n, as a way of demonstrating (not proving) what we can prove in words
about the best or worst cases?

Just to confirm, how these functions should appear in the driver would be, Sort.<method>(data) ?

Should these sort functions be static?

******************************/

import java.util.ArrayList;


public class Sorts{



//~~~~~~~~~~~~~~~~~~~ HELPER METHODS BEGIN ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }


  //randomly rearrange elements of an ArrayList
  public void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }


// swapping
public void swap(ArrayList<Comparable> data, int i, int j){ // i and j are indexes
  Comparable tempStorage = data.get(i);
  data.set(i, data.get(j));  // resets what's in i
  data.set(j, tempStorage);  // resets whats in i-1
}

//   moving elements within each pass
public int[] walkElement(ArrayList<Comparable> data, int index) {
  int compareCounter = 0;
  int swapCounter = 0;
 for (int i = index; i > 0; i--){
   Comparable a = data.get(i);
   Comparable b = data.get(i-1);
   compareCounter+=1;
   if (b.compareTo(a) == 1){ // We are comparing consecutive elemnts. If the left element is greater than the right element, we need to swap
     swap(data, i, i-1);
     swapCounter += 1;
   } else { // makes things more efficient by avoiding extra swaps
     int[] counters = {compareCounter, swapCounter};
     return counters;
   }
 }
 int[] counters = {compareCounter, swapCounter};
 return counters;
}
//~~~~~~~~~~~~~~~~~~~ HELPER METHODS END ~~~~~~~~~~~~~~~~~~~

  public int[] insertionSortV(ArrayList<Comparable> data){
    int passCounter = 0;
    int compareCounter = 0;
    int swapCounter = 0;
    for ( int partition = 1; partition < data.size(); partition++ ){ // pass both the number of elements that are sorted so far,
                                                      // and the index of the element that is about to be walked to the correct place
      int[] returned = walkElement(data, partition);
      compareCounter+= returned[0];
      swapCounter += returned[1];
      passCounter+=1;
      System.out.println("index of partition (pass number): " + partition); //diag
      System.out.println(data); //diag
    }
   int[] counters = {compareCounter, swapCounter, passCounter};
   return counters;
}




  public int[] selectionSortV( ArrayList<Comparable> data )
  {
     // position of the greatest value
    //note: this version places greatest value at "rightmost" end
    //maxPos will point to position of SELECTION (greatest value)
    int passCounter = 0;
    int compareCounter = 0;
    int swapCounter = 0;
    for(int pass = data.size()-1; pass > 0; pass--) { // refers to the index that will be sorted
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      int maxPos = 0;

        for(int i = pass; i > -1; i--) {
        	if ( data.get(maxPos).compareTo(data.get(i))==-1 ){
        		maxPos = i;
            swapCounter += 1;
        	}
          compareCounter += 1;
        }
        System.out.println( "maxPos: " + maxPos );// this for loop resets maxPos to the next value
      	System.out.println( data );//diag
        // now, we need to swap the highest value with whatever's in the highest index

        swap(data, pass, maxPos);

        System.out.println( "after swap: " +  data );//diag
        passCounter += 1;
    }
    int[] counters = {compareCounter, swapCounter, passCounter};
    return counters;
  }//end selectionSort


  public int[] bubbleSortV( ArrayList<Comparable> data )
    {
    int passCounter = 0;
    int compareCounter = 0;
    int swapCounter = 0;


      for (int p = 0; p < data.size() - 1; p++) { // iterates through each pass
        //for each pass, reset counter to 0.
        //if counter still 0 at end of loop, break because the arraylist is sorted already bc no swaps required
        boolean sorted = true; //for now, we'll assume that the thing is sorted.
                               //Once we actually compare elements, if there is an element out of order, we need to actually sorted
                               // if not, we can just end the function
        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i).compareTo( data.get(i+1) ) > 0) {
                swap(data, i, i+1);
                sorted = false;
                swapCounter+=1;
            } // end if
            compareCounter+=1;
        } // end second loop
        if(sorted==true){
          passCounter+=1;
          int[] counters = {compareCounter, swapCounter, passCounter};
          return counters;
        }
        passCounter+=1;
      } // end first loop
      int[] counters = {compareCounter, swapCounter, passCounter};
      return counters;
    }



}
