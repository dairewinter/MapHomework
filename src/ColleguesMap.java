import java.util.HashMap;
import java.util.Map;

public class ColleguesMap {
    static Map<String, Integer> colleagues = new HashMap<>();

    public void addToCollegues(String key, int value){
        if (!colleagues.containsKey(key)){
            colleagues.put(key, value);
        } else {
            int mapValue = colleagues.get(key);
            if (mapValue == value){
                throw new IllegalArgumentException("Values are not equal");
            } else {
                colleagues.put(key, mapValue+value);
            }
        }
    }
}
