import java.util.LinkedHashMap;
import java.util.Map;

public class RevisionLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();

        map.put(3,"Nashik");
        map.put(1,"Mumbai");
        map.put(2,"Pune");

        System.out.println(map);
    }
}
