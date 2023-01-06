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
    public void insertValueIntheArray(int row, int col, int value) {
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
}
