package src;
import java.util.Arrays;

public class SecondLargestNumberInArray {
    static void secondLargest(int[] arr, int arrSize){
        // Sorting of array
        Arrays.sort(arr);

        int i;
        int second;
        
        // There should be atleast two numbers
        if (arrSize < 2){
            System.out.println("Invalid input");
        }
        //setting up the largest number to min
        int largest = second = Integer.MIN_VALUE;

        //Finding the largest number
        for(i = 0; i < arrSize; i++)
        {
            largest = Math.max(largest, arr[i]);
        }

        //Finding the second largest 
        for (i = 0; i < arrSize; i++){
            if (arr[i] != largest){
                second = Math.max(second,arr[i]);
            }

        }
        if (second == Integer.MIN_VALUE)
            System.out.println("-1");
        else
            System.out.printf("The second largest element is %d", second);
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,2};
        secondLargest(arr, arr.length);
       
    }
}