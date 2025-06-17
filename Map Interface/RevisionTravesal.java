import java.util.HashMap;
import java.util.Map;
public class RevisionTravesal {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();

        map.put(11,"Kshitij");     
        map.put(22,"Priti");     
        map.put(33,"Sanket");
        
        for(int key: map.keySet()) {
            System.out.print(key+", ");
        }

        for(String value: map.values()) {
            System.out.print(value+", ");
        }

        for(Map.Entry<Integer,String> en: map.entrySet()){
            System.out.println(en);
        }

        map.forEach((key,value) -> System.out.println(key+ ": "+value) );
    }
}
