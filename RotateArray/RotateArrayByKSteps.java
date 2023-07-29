package RotateArray;

public class RotateArrayByKSteps {

    public void rotateArray(int[] array, int arrSize, int k) {
        //Creating a temp array to store k elements
        //Rotating array by k steps
        int[] temp = new int[k];

        // Moving array of k element into temp array
        for (int i = 0; i < k; i++) {
            temp[i] = array[i];
        }

        //Moving rest elements to original array by deleting k elements
        for (int i = k; i < arrSize; i++) {
            array[i - k] = array[i];
        }

        // Merging both array to one
        for (int i = 0; i < k; i++) {
            array[i + arrSize - k] = temp[i];
        }
    }

    //Printing new array
    public void printArray(int[] array, int arrSize) {
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Rotated Array : " + array[i]);
        }
    }
    public static void main(String[] args) {

        //Creating object reference to pass values from static method to non-static method
        RotateArrayByKSteps ra = new RotateArrayByKSteps();

        int[] arr = { 1, 2, 3, 4, 5 };
        ra.rotateArray(arr, arr.length, 2);
        ra.printArray(arr, arr.length);
    }
}