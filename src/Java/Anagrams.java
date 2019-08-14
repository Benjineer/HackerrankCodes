package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()){
            return false;
        }
        if(a.equalsIgnoreCase(b)){
            return true;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        char[] aa = a.toCharArray();
        char[] ba = b.toCharArray();
        for (int i = 0; i < aa.length; i++) {
            if(map.get(aa[i]) == null){
                map.put(aa[i], 1);
            }else {
                Integer integer = map.get(aa[i]);
                map.put(aa[i], ++integer);
            }
        }

        for (int i = 0; i < ba.length; i++) {
            if(map.get(ba[i]) == null){
                map.put(ba[i], 1);
            }else {
                Integer integer = map.get(ba[i]);
                map.put(ba[i], --integer);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
}
