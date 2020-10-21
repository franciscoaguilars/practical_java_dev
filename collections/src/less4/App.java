package less4;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(20);
        nums.add(30);
        nums.add(34);

        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(13);
        nums2.add(45);


        nums.addAll(nums2);

        System.out.println(nums);
    }
}
