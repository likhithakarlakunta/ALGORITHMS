package Sliding_Window;

public class Avg {
    public static void main(String[] args) {

        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int sum = 0;

        for(int i=0;i<k;i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        for(int i=k;i<arr.length;i++) {

            sum = sum - arr[i-k] + arr[i];

            if(sum > maxSum) {
                maxSum = sum;
            }
        }

        double average = (double) maxSum / k;

        System.out.println("Average: " + average);
}
}
