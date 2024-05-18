import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static boolean isomorphicStrings(String s, String t){
        if(s == null || t == null){
            return false;
        }
        if(s.length() == 0 || t.length() == 0){
            return false;
        }
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> characterMap = new HashMap<>();
        for(int i =0; i< s.length();i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if(characterMap.containsKey(ss)){
                if(tt != characterMap.get(ss)){
                    return false;
                }
            } else {
                characterMap.put(ss, tt);
            }
        }
        return true;
    }
}
