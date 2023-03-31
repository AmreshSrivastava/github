import java.util.*;

public class Hashmap {
    public static void main(String [] args){

        //country(key) , population(value)
        HashMap <String , Integer > map = new HashMap<>();

        //Insertion-map.put()
        map.put("India" , 120 );
        map.put("US" , 30);
        map.put("china" , 150);

        System.out.println(map);

        map.put("china" , 180);
        System.out.println(map);

        //Search
        if(map.containsKey("china")){
            System.out.println("key is present on the map");

        }
        else{
            System.out.println("key is not present in the map");

        }


        System.out.println(map.get("china")); //key exists

        System.out.println(map.get("Indonesia")); //key does not exist

        //for(int val : arr )- entryset

        for(Map.Entry<String , Integer> e : map.entrySet()){
          
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        //keyset
        Set<String> keys = map.keySet();
        for(String key : keys ){
            System.out.println(key+ " " + map.get(key));

        }

        //remove
        map.remove("china");
        System.out.println(map);
            
    }

}
