package edu.cnm.deepdive.book;

public class OneDemArray {
  //one dimensional array
  public static void main(String args[]) {
    // sample is created as int
    int sample[];
    //sample variable is linked with an array;
    // it holds a reference to the memory allocated by new
    sample = new int[10];
    int i;
    // put numbers into array
    for (i=0; i<10; i=i+1)
      sample[i] = i;
     // go through array and print what is in array
    for (i=0; i<10; i = i+1)
      System.out.println("This is sample [" + i + "]: " +
                      sample[i]);

  }

}
