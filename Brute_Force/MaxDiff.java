package Brute_Force;

public class MaxDiff {
    public static void main(String[] args) {

        int[] arr = {7,1,5,4};

        int maxDiff = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {

            for(int j=i+1;j<arr.length;j++) {

                maxDiff = Math.max(maxDiff, arr[j] - arr[i]);
            }
        }

        System.out.println(maxDiff);
    }
}
