import java.util.HashMap;
import java.util.Map;

public class ColleguesMap {
    static Map<String, Integer> colleagues = new HashMap<>();

    public void addToCollegues(String key, Integer value){
        int mapValue = colleagues.get(key);
        if (colleagues.containsKey(key) && colleagues.get(key).equals(value)){
            throw new IllegalArgumentException("Values are not equal");
        } else {
            colleagues.put(key, mapValue+value);
            }
        }
    }
