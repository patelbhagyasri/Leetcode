
import java.util.Scanner;

class Anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] store = new int[26];
        for (int i = 0; i < s.length(); i++) {
            //System.out.println("char is:"+s.charAt(i));
            store[s.charAt(i) - 'a']++;
            // System.out.println(s.charAt(i) - 'a');
            store[t.charAt(i) - 'a']--;
            // System.out.println(store[t.charAt(i) - 'a']);
          //  System.out.println("Store15:" + store[15]);
          //  System.out.println("Store16:" + store[16]);
         //   System.out.println("Store17:" + store[17]);
         //   System.out.println("Store18:" + store[18]);
         //   System.out.println("Store19:" + store[19]);
          //  System.out.println("");
        }

        for (int n : store) {
            if (n != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1, s2;
        System.out.println("Enter String 1:");
        Scanner s = new Scanner(System.in);
        s1 = s.next();
        System.out.println("Enter String 2:");
        s2 = s.next();
        Anagram a = new Anagram();
        boolean ans = a.isAnagram(s1, s2);
        System.out.println("Ans is:" + ans);
       // System.out.println('r' - 'a');

    }

}
