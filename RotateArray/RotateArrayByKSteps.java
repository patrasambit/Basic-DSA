package RotateArray;

public class RotateArrayByKSteps {

    public void rotateArray(int[] array, int arrSize, int k) {
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = array[i];
        }

        for (int i = k; i < arrSize; i++) {
            array[i - k] = array[i];
        }
        for (int i = 0; i < k; i++) {
            array[i + arrSize - k] = temp[i];
        }
    }

    public void printArray(int[] array, int arrSize) {
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Rotated Array : " + array[i]);
        }
    }
    public static void main(String[] args) {

        RotateArrayByKSteps ra = new RotateArrayByKSteps();

        int[] arr = { 1, 2, 3, 4, 5 };
        ra.rotateArray(arr, arr.length, 2);
        ra.printArray(arr, arr.length);

    }

}