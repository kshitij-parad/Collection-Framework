import java.util.TreeMap;
import java.util.Map;

public class RevisionTreeHashMap {
 public static void main(String[] args) {
    Map<Integer,String> map = new TreeMap<>();

    map.put(3,"Nashik");
    map.put(1,"Mumbai");
    map.put(2,"Pune");

    System.out.println(map);
 }   
}
