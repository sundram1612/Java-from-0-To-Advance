import java.lang.reflect.Array;
import java.util.*;
public class Cwh_91_ArrayList {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList <Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(20);
        l2.add(45);

        l1.add(6);
        l1.add(7);
        l1.add(5);
        l1.add(4);
        l1.add(0,9);
        l1.add(0,3);
        l1.addAll(0,l2);
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(4));
        // l1.clear();
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
