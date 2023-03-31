import java.util.HashSet;
import java.util.Iterator;

public class Hashset{

    public static void main(String [] args){

        //creating 
        HashSet <Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); 

        //Search - contains 

        if (set.contains(1)){
            System.out.println("set contains 1");

        }
        if (set.contains(2)) {
            System.out.println("set contains 2");

        }
        if(!set.contains(4)){
            System.out.println("does not contains 4");

        }

        //Delete

        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1");
            
        }
        //Size
        System.out.println("size of set is " + set.size());

        //print all elements
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();

        //hasNext(); -true,false
        //next();-1,2,3 

        while(it.hasNext()){

            System.out.println(it.next());
            
        }


    }
}