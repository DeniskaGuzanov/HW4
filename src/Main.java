import java.util.HashMap;

public class Main {
    public static void  main(String[] args) {

        HashMap<Integer, String > hash_map = new HashMap<Integer, String >();

        hash_map.put(10, "Serg");
        hash_map.put(20, "Jony");
        hash_map.put(30, "Mr.Black");
        hash_map.put(40, "Loly");
        hash_map.put(50, "Joly");
        hash_map.put(60, "Martin");

        System.out.println("Размер карты равен = " + hash_map.size());
    if(hash_map.containsKey(50)){
        String m = hash_map.get(50);
        System.out.println("Значение с ключом 50 = "+ m);
    }
    System.out.println("Выбор по ключу = " + hash_map.get(30));
    System.out.println("Инициализация карты: " + hash_map);

    String value_1 = (String) hash_map.put(10, "Alex");


    System.out.println("Меняем значение с ключом 10 " + value_1);
    System.out.println(hash_map);

    String value_2 = (String) hash_map.remove(40);
    System.out.println("Удалено значение с ключом 40" + value_2);
    System.out.println((hash_map));


    System.out.println("Существет значение с ключом 10 ? " + hash_map.containsKey(10));
    System.out.println("Существет значение с ключом 70 ? " + hash_map.containsKey(70));
    System.out.println("Существет значение со значением Serg ? " + hash_map.containsKey("Serg"));
    System.out.println("Существет значение со значением Mr.Black ? " + hash_map.containsKey("Mr.Black"));
    System.out.println("Новая карта: " + hash_map);
    }

}