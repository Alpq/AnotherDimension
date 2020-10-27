public class Tester{

  public static void main(String args[]){
    System.out.println();
    System.out.println("Tests for sum(), largest(), sumRows(), largestInRows(), sum() and sumCols():");
    int[][] thing =
    {
      {5, 2, 2, 33},
      {2, 3, 2, 5},
      {9, 2, 5, 6},
      {10, 5, 7, 9}
    };
    System.out.println(ArrayOps.sum(thing[1]));
    System.out.println(ArrayOps.largest(thing[1]));
    System.out.println(ArrayOps.arrtoString(ArrayOps.sumRows(thing)));
    System.out.println(ArrayOps.arrtoString(ArrayOps.largestInRows(thing)));
    System.out.println(ArrayOps.sum(thing));
    System.out.println(ArrayOps.arrtoString(ArrayOps.sumCols(thing)));
    int[][] thing1 =
    {
      {1, 2, 3, 4},
      {2, 3, 4, 1},
      {3, 4, 1, 2}
    };
    int[][] thing2 =
    {
     {1, 1, 1},
     {2, 2, 2},
     {3, 3, 3}
    };
    int[][] thing3 =
    {
      {2, 2, 2},
      {2, 2, 2}
    };
    System.out.println();
    System.out.println("Tests for isRowMagic() and isColMagic():");
    System.out.println();
    System.out.println(ArrayOps.arrtoString(ArrayOps.sumCols(thing3)));
    System.out.println(ArrayOps.arrtoString(ArrayOps.sumRows(thing3)));
    System.out.println(ArrayOps.isRowMagic(thing1));
    System.out.println(ArrayOps.isRowMagic(thing2));
    System.out.println(ArrayOps.isRowMagic(thing3));
    System.out.println(ArrayOps.isColMagic(thing1));
    System.out.println(ArrayOps.isColMagic(thing2));
    System.out.println(ArrayOps.isColMagic(thing3));
    System.out.println();
    System.out.println("Tests for isLocationMagic():");
    System.out.println();
    int[][] thing4 =
    {
      {3, 4, 3},
      {4, 3, 4},
      {3, 4, 3}
    };
    System.out.println(ArrayOps.isLocationMagic(thing3, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(thing4, 1 , 1));


  }
}
