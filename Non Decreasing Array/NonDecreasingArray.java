package NonDecreasingArray;

import java.util.Scanner;

public class NonDecreasingArray {
    public static boolean isPossible(int[] arr, int n) {
        int count = 0;  // Count of violations

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                // Try to fix the violation
                if (i < 2 || arr[i] >= arr[i - 2]) {
                    arr[i - 1] = arr[i];  // Modify the previous element
                } else {
                    arr[i] = arr[i - 1];  // Modify the current element
                }
            }
        }

        return true;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayElement = sc.nextInt();
        int[] array = new int[20];

        for(int i = 0; i < arrayElement; i++){
            array[i] = sc.nextInt();
        }

        if(isPossible(array, array.length))
            System.out.printf("true");
        else
            System.out.printf("No");
        
        sc.close();
    }
    
}
