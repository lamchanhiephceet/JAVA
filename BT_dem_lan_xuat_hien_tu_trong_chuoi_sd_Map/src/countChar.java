import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class countChar {
    public static void main(String[] args) {
        String str = "how are you feel today ?";
        str = str.replaceAll(",","");
        String[] arr = str.split(" ");
        String key = "";
        Integer value;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0;i<arr.length;i++) {
            key = arr[i];
            if(map.containsKey(key)){
                value = map.get(key);
                map.remove(key);
                map.put(key, value+1);
            } else {
                map.put(key, 1);
            }
        }
        Set set = map.keySet();
        Iterator i = ((Set) set).iterator();
        while(i.hasNext()){
            key = (String)i.next();
            System.out.println("ky tu: "  + key + "  xuat hien: "  + map.get(key) +  " lan");
        }
    }
}
