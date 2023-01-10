import java.util.*;

public class queue {
  public static void main(String[] args) {
    //        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(5);
//        queue.add(3);
//        System.out.println(queue); // 입력된 순서대로 들어옴
//        System.out.println(queue.poll()); // 앞에껄 빼고 return 한다
//        System.out.println(queue);
//        System.out.println(queue.peek()); // 이건 빼지 않고 보기만
//        System.out.println(queue);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4);
        System.out.println(arrayDeque); // 4 3 2 1 순이 됨 ( 들어간게 밀림 )

        arrayDeque.addLast(0);
        System.out.println(arrayDeque);

        arrayDeque.offerFirst(10); // 마지막에 들어감 ( addfirst랑 비교하면 크기에서 offer는 false add는 exception이 나옴 )
        System.out.println(arrayDeque);
        arrayDeque.offerLast(-1);
        System.out.println(arrayDeque);

        arrayDeque.push(22);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque);
  }
}