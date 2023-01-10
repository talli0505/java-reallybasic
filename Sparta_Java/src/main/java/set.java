import java.util.*;

public class set  {
  public static void main(String[] args) {
          Set<Integer> integerSet = new HashSet<>(); // list는 중복 된것도 그냥 내보내는데 set은 검수하고 내보넴 즉 중복은 제외
      integerSet.add(1);
      integerSet.add(1);
      integerSet.add(3);
      integerSet.add(2);
      integerSet.add(9);
      integerSet.add(8);
      System.out.println(integerSet); // 랜덤으로 출력

      Set<String> stringSet = new HashSet<>();
      stringSet.add("LA");
      stringSet.add("New York");
      stringSet.add("Las Vegas");
      stringSet.add("San Francisco");
      stringSet.add("Seoul");
      System.out.println(stringSet);

      stringSet.remove("Seoul"); // 랜덤 순서이기에 list가 index를 지우는거처럼 지울수없으므로 그 지우는 값을 적어야함
      System.out.println(stringSet);

      List<String> target = new ArrayList<>();
      target.add("New York");
      target.add("Las Vegas");
      stringSet.removeAll(target);
      System.out.println(target);

      System.out.println("La 포함되어있나요? " + stringSet.contains("LA"));
  }
}