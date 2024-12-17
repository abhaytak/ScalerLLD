package collections;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Client {
    public static void main(String[] args) {
        //THIS CLASS IS ALL ABOUT READING THE DOCUMENTATION OF THE COLLECTIONS
        //COMMAND + CLICK WILL GIVE ME THE DETAIL INFO ABOUT COLLECTION I USED BELOW

        //List : sequence of element and usage of index to insert and search
        //ArrayList isn't thread-safe - important for interview questions
        List<Integer> x = new ArrayList<>();

        //LinkedList is not thread-safe
        //LinkedList is Doubly LinkedList behind the scene
        List<Integer> x1 = new LinkedList<>();
        //eg
        //LinkedList also implements the behaviours of Deque
        Deque<Integer> d1 = new LinkedList<>();

        //Vector is thread safe
        List<Integer> x2 = new Vector<>();

        //Stack extends Vector so it's thread safe
        List<Integer> x3 = new Stack<>();

        //List ends here
        //------------------------------------------------------------

        //Not thread safe
        //no order confirmation
        //constant time operation of add remove and search
        //doesn't maintain the order
        Set<String> s1 = new HashSet<>();
        s1.add("Hashset A");
        s1.add("Hashset B");
        s1.add("Hashset C");
        s1.add("Hashset D");
        System.out.println(s1);

        //not thread safe
        //does maintain the order same way we inserted it, try it using putting String
        Set<String> s2 = new LinkedHashSet<>();
        s2.add("LinkedHashSet A");
        s2.add("LinkedHashSet B");
        s2.add("LinkedHashSet C");
        s2.add("LinkedHashSet D");
        System.out.println(s2);

        //Internally TreeMap is being used
        //follows natural ordering or via the Comparable (covers below) : noticed in output
        Set<String> s3 = new TreeSet<>();
        s3.add("TreeSet D");
        s3.add("TreeSet C");
        s3.add("TreeSet A");
        s3.add("TreeSet B");
        System.out.println(s3);

        //Here enum comes
        //Enums usually use in status where application doesn't afford of human error
        //Simply declare enums and consume it in status
        //Instructor did code but not that imp so I haven't wrote the code

        //Set ends here
        //----------------------------------------------------------------

        //follows natural ordering or via the Comparable (covers below) : noticed in output
        Queue<String> q = new PriorityQueue<>();
        q.add("PriorityQueue B");
        q.add("PriorityQueue D");
        q.add("PriorityQueue A");
        q.add("PriorityQueue C");

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.poll();
        }

        //not thread safe
        Queue<String> q2 = new ArrayDeque<>();

        //Queue ends here
        //------------------------------------

        //Comparator vs comparable
        List<Student> l1 = new ArrayList<>(List.of(
                new Student(2, "D", 50.1),
                new Student(1, "B", 90.5),
                new Student(3, "E", 10.3)
        ));
    }
}
