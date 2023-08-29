
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> lis = new ArrayList<Integer>();

        lis.add(56);
        lis.add(23);
        lis.add(69);
        lis.add(96);
        lis.add(1);
        lis.add(63);
        lis.add(12);
        lis.add(89);
        lis.add(70);
        lis.add(3);
       
        System.out.println(lis);

       
        int target =70;
        int first = 0;
        int last = lis.size()-1;
        BinarySearch ser = new BinarySearch(lis, target, first, last);
        ser.Search();
    }
} 