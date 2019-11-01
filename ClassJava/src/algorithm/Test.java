package algorithm;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		String[] participant= {"mislav", "stanko", "mislav", "ana"};
		String[] completion= {"stanko", "ana", "mislav"};
		String answer = "";
        HashMap<String, Integer> map = new HashMap();
        for(String str:participant) {
			map.put(str, map.getOrDefault(str, 0) + 1);	
		}
        for(String str:completion){
            map.put(str, map.get(str)-1);
        }
        for(String key: map.keySet()) {
            if (map.get(key)!=0){
                answer= key;
            }
        }
        System.out.println(answer);
	}

}
