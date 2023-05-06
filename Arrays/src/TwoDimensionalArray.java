public class TwoDimensionalArray {
    int arr[][] = null;

    // Constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted!");
            } else {
                System.out.println("This cell is already occupied!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array!");
        }
    }

    // Accessing cell value
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row# " + row + " Col# " + col);
        try {
            System.out.println("Cell value is " + arr[row][col]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array!");
        }
    }

    // Traversing array
    public void traverse2DArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Searching a single value in the array
    public void searchingValue (int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("found " + value + " at row# " + row + "and, col#" + col);
                    return;
                }
            }
        }
        System.out.println("provided value does not exist in array!");
    }

    // Deleting a value from the array
    public void deleteValue(int row, int col) {
        try {
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array!");
        }
    }

    // rotate 2D matrix
    public boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer; // layers represent number squares we will perform swaps on
            int last = n - 1 - layer; // last element according to current layer
            for (int i=first; i<last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }

        }
        return true;

    }
}
