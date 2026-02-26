package JavaExercises;

import java.util.Arrays;

public class ReverseArrayInteger {
    public static void main(String[] args)
    {
        int arr[] = {2, 3, 5, 7, 9, 12};

        int n = arr.length;

        for (int i = 0; i<n/2; i++){

            int j = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }

}


