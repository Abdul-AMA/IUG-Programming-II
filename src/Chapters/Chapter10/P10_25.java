package Chapters.Chapter10;

import java.util.*;

public class P10_25 {
    public static void main(String[] args) {

        String s = "ab#12#453";
        String regex = "#";
        String s2 = "a?b?gf#e";
        String regex2 = "[?#]";

        System.out.println("split(\"ab#12#453\",\"#\"): " + Arrays.toString(split(s, regex)));
        System.out.println("split(\"a?b?gf#e\",\"[?#]\"): " + Arrays.toString(split(s2, regex2)));


    }


    public static String[] split(String s, String regex) {
        List<String> splited = new ArrayList<>();

        ArrayList<Character> splitters = new ArrayList<>();
        for (char ch : regex.toCharArray()) {
            if (ch == '[' || ch == ']') continue;
            splitters.add(ch);
        }

        if (s != null && regex.length() >= 1) {
            String temp = "";
            for (int i = 0; i < s.length(); i++) {
                if (splitters.contains(s.charAt(i))) {
                    splited.add(temp);
                    temp = "";
                    temp += s.charAt(i);
                    splited.add(temp);
                    temp = "";
                } else
                    temp += s.charAt(i);

            }
            splited.add(temp);

        }


        String[] result = new String[splited.size()];
        for (int i = 0; i < splited.size(); i++) {
            result[i] = splited.get(i);
        }

        return result;
    }
}
