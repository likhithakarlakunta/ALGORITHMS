package Sliding_Window;
import java.util.*;
public class UniqueSubString {

    public static void main(String[] args) {

        String str = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right=0; right<str.length(); right++) {

            while(set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            int currentLength = right - left + 1;

            if(currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        System.out.println("Length: " + maxLength);
}
}
