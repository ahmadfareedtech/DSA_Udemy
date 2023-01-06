import java.util.Arrays;

public class Array1D {
    public static void main(String args[]) {
        //Declaration of array
        int[] arr; // reference variable created
        int[][] arr2d;

        //Instantiation of array
        arr = new int[3]; // space allocated to all cells of array
        arr2d = new int[2][2];

        //Initialization of array
        arr[0] = 1; // value added to cell
        arr2d[0][1] = 23;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2d));
    }

}
