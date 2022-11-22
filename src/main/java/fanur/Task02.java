package fanur;

import java.util.LinkedList;
import java.util.logging.Logger;

public class Task02 {
    public static void main(String[] args) {
        Logger log = Logger.getAnonymousLogger();
        LinkedList<Integer> ls = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            ls.add(i);
        }

        enqueue(ls, 11);
        log.info(ls.toString());

        dequeue(ls, log);
        first(ls, log);


    }

    public static void enqueue(LinkedList<Integer> list, int value) {
        list.addLast(value);

    }

    public static void dequeue(LinkedList<Integer> list, Logger log) {

        log.info("The first element is: " + list.getFirst());
        list.removeFirst();
        log.info(list.toString());

    }

    public static void first(LinkedList<Integer> list, Logger log) {

        log.info("The first element is: " + list.getFirst());

    }
}