package Collection_Framework;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StackPractice {
    static void main(String[] args) {
        List<Integer> list = new Stack<>();
        list.add(191);
        list.add(22);
        list.add(133);
        list.add(4);
        System.out.println(list);

        System.out.println(list.get(2));
        list.set(3,55);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);


        System.out.println("______push(), pop(), peek(), search(), empty()______");
//Stack Specific : push(), pop(), peek(), search(), empty()

        Stack<Integer> list2 = new Stack<>();
        list2.add(91);
        list2.add(22);
        list2.add(13);
        list2.add(4);
        System.out.println(list2);

        list2.push(77);
        System.out.println(list2);

        list2.pop();
        System.out.println(list2);


        System.out.println(list2.peek());

        System.out.println(list2. search(13));

        System.out.println(list2.empty());


    }
}
