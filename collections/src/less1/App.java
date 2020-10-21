package less1;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args)  {

        //Array List
        ArrayList<String> words = new ArrayList<String>();

        words.add("Hey");
        words.add("How");
        words.add("LOL");

        for (String s : words){
            System.out.println(s);
        }

        //Linked List
        LinkedList<Integer> nums = new LinkedList<Integer>();

        nums.add(20);
        nums.add(30);

        for (int a : nums){
            System.out.println(a);
        }
    }
}

