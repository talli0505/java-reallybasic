import java.util.*;

public class list {
        public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(4);
        integerList.add(11);
        integerList.add(10);
        System.out.println(integerList); // 넣어준 순서대로 나옴

        Collections.sort(integerList); // 정렬 desc는 오름차순으로 기본
        System.out.println(integerList);
        System.out.println(integerList.size());

        integerList.remove(4);
        System.out.println(integerList);

        //        for(int i=0; i< integerList.size(); i++) {
        //            System.out.println(integerList.get(i));
        //        }

        for(int current:integerList) {
                System.out.println(current);
        }
        }
}
