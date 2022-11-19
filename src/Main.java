import java.util.*;

public class Main {
    static Map<Product, Integer> products = new HashMap();
    static Map<String, Integer> colleagues = new HashMap<>();

    public static void main(String[] args) {
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Антонов Антон", 890909090);
        phonebook.put("Андреев Андрей", 798989);
        phonebook.put("Васильев Василий", 545454);
        phonebook.put("Алексеев Алексей", 131313);
        phonebook.put("Михайлов Михаил", 202020);
        phonebook.put("Леонидов Леонид", 565656);
        phonebook.put("Петров Петр", 343434);
        phonebook.put("Дмитриев Дмитрий", 34334);
        System.out.println(phonebook);



        colleagues.put("Мария", 26);
        colleagues.put("Анна", 31);
        colleagues.put("Юлия", 25);
        System.out.println(colleagues);
        addEntry("Арина", 24);
        System.out.println(colleagues);

        Map<String, List<Integer>> strings = new HashMap<>(5);
        Random randоm = new Random();
            strings.put("Картофель", List.of(randоm.nextInt(1000)));
            strings.put("Морковь", List.of(randоm.nextInt(1000)));
            strings.put("Помидоры", List.of(randоm.nextInt(1000)));
            System.out.println(strings);

        LinkedHashMap<Integer, String> integerStringMap = new LinkedHashMap<>();
        integerStringMap.put(21, "Роза");
        integerStringMap.put(13, "Маргаритка");
        integerStringMap.put(27, "Ромашка");
        System.out.println(integerStringMap);
    }

    public static void addEntry(String key, Integer value){
        for(Map.Entry<String, Integer> stringIntegerEntry : colleagues.entrySet()){
            if (colleagues.containsValue(value) && colleagues.containsKey(key)) {
                throw new RuntimeException("Такой объект уже есть!");
            } else{
                colleagues.put(key, value);
            }
            if (colleagues.containsKey(key) && !colleagues.containsValue(value)){

            } else {
                colleagues.put(key, value);
            }
            break;
        }
    }

}