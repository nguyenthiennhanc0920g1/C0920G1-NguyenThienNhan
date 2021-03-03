package _11_stack_and_queue.bai_tap;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class CountWordsAppear {
    public static void main(String[] args) {
        String text = "    hello Name ag  e hello hello name  998    go to    ";
        text = text.toLowerCase();
        String[] arrayText = text.split("\\s");

        TreeMap<String, Integer> arrayListIncludeWords = new TreeMap<>();

        for (String s : arrayText) {
            addElement(arrayListIncludeWords, s);
        }
        arrayListIncludeWords.remove("");
        for (String key : arrayListIncludeWords.keySet()) {
            System.out.println("(" + key + ")" + " xuat hien " + arrayListIncludeWords.get(key) + " lan.");
        }
    }

    private static void addElement(Map<String, Integer> map, String element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }

}
