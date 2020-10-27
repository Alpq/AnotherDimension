public class Tester{

  public static void main(String args[]){

    int[][] thing =
    {
      {5, 2, 2, 33}, {2, 3, 2, 5}, {9, 2, 5, 6}, {10, 5, 7, 9}
    };
    System.out.println(ArrayOps.sum(thing[1]));
    System.out.println(ArrayOps.largest(thing[1]));
  }
}
