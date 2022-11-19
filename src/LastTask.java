import java.util.*;

public class LastTask {
    private final Map<String, List<Integer>> map = new HashMap<>();
    private static final Random RANDOM = new Random();

    public LastTask() {
        for (int i = 0; i < 5; i++) {
            map.put(String.valueOf(i), createList());
        }
    }

    private List<Integer> createList() {
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2.add(RANDOM.nextInt(1000));
        }
        return list2;
    }

    public Set<Map.Entry<String, List<Integer>>> getFistMap(){
        return map.entrySet();
    }

    public Map<String, Integer> getSecondMap(){
        Map<String, Integer> secondMap = new HashMap<>();
        for(Map.Entry<String, List<Integer>> listEntry : map.entrySet()){
            int sum = 0;
            for(Integer number : listEntry.getValue()){
                sum += number;
            }
            secondMap.put(listEntry.getKey(), sum);
        }
        return secondMap;
    }
}
