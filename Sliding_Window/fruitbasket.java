package Sliding_Window;
import java.util.*;
public class fruitbasket {


    public static void main(String[] args) {

        int[] fruits = {1, 2, 1, 2, 3};

        HashMap<Integer,Integer> map = new HashMap<>();

        int left = 0;
        int maxCount = 0;

        for(int right=0; right<fruits.length; right++) {

            map.put(fruits[right],
                    map.getOrDefault(fruits[right],0) + 1);

            while(map.size() > 2) {

                map.put(fruits[left],
                        map.get(fruits[left]) - 1);

                if(map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            int currentCount = right - left + 1;

            if(currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        System.out.println("Max Fruits: " + maxCount);
    }
}
