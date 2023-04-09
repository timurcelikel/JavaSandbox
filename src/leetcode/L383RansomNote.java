package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L383RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> charList = new ArrayList<>();
        for (char c : magazine.toCharArray()) {
            charList.add(c);
        }

        for (char d : ransomNote.toCharArray()) {
            if (charList.contains(d)) {
                int index = charList.indexOf(d);
                charList.remove(index);
            } else {
                return false;
            }
        }
        return true;
    }
}
