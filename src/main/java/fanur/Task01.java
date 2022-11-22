package fanur;

import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Logger;

public class Task01 {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        Logger log = Logger.getAnonymousLogger();
        log.info(ll.toString());
        Collections.reverse(ll);
        log.info(ll.toString());

    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist) {
        LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
        for (int i = llist.size() - 1; i >= 0; i--) {
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;

    }
}