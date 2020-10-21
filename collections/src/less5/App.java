package less5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();

        dictionary.put("Frank", "He is a progammer");
        dictionary.put("Camila", "Also a progammer");

        // for (String word : dictionary.keySet()){
        //     System.out.println(dictionary.get(word));
        // }
            
        System.out.println(dictionary );
        for(Map.Entry<String, String> entry : dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
