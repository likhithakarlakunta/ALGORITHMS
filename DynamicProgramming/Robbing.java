package DynamicProgramming;

public class Robbing {

    public static void main(String[] args) {

        int[] houses = {2,7,9,3,1};

        int prev2 = 0;
        int prev1 = 0;

        for(int money : houses) {

            int current = Math.max(prev1, prev2 + money);

            prev2 = prev1;
            prev1 = current;
        }

        System.out.println(prev1);
    }

}
