public class ArrayOps{
  public static int sum(int[] arr)
  { int sum = 0;
    for (int i = 0; i < arr.length ; i ++) {
      sum = sum + arr[i];
    }
    return sum;
  }
  public static int largest(int[] arr)
  {
    int max = arr[1];
    for (int i = 0;i < arr.length; i ++ ) {
      max = Math.max(max, arr[i]);
    }
    return max;
  }

  public static String arrtoString(int[] arr){
    String adder = "{";
    for (int i = 0; i < arr.length; i ++)
    {
      adder = adder + Integer.toString(arr[i]);
      if (i != arr.length - 1)
      {
         adder = adder + ", ";
      }
    }
    return adder + "}";
  }
  public static int[] sumRows(int[][] matrix)
  {
    int[] thing = new int[matrix.length];
    for (int i = 0; i < matrix.length ; i ++ ) {
      thing[i] = sum(matrix[i]);
    }
    return thing;
  }
  public static  int[] largestInRows(int[][] matrix)
  {
    int[] thing = new int[matrix.length];
    for (int i = 0;i < matrix.length ; i ++ )
    {
      thing[i] = largest(matrix[i]);
    }
    return thing;
  }
}
