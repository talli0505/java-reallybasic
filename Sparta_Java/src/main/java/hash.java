import java.util.*;

public class hash {
  public static void main(String[] args) {
      Map<Integer, String> map = new HashMap<>();
      map.put(1, "apple");
      map.put(2, "berry");
      map.put(3, "Cherry");

      System.out.println(map);

      System.out.println("1st in map: " +map.get(0));
      System.out.println("1st in map: " +map.get(1));

      map.remove(2);
      System.out.println(map);
      System.out.println(map.containsKey(2));
      System.out.println(map.containsValue("Cherry"));

      map.clear();
      System.out.println(map);
  }
}