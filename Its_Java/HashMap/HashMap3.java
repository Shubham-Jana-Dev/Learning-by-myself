import java.util.HashMap;
import java.util.Set;
public class HashMap3{
	public static void main(String[] args){
		int maxV = 0;
		int maxC = 0;
		String s = "frnwudssitnwoniveqvv";
		Set<Character> myVowel = Set.of('a','e','i','o','u');
		
		HashMap<Character, Integer> v = new HashMap<>();
		HashMap<Character, Integer> c = new HashMap<>();
		
		for(int j = 0; j<s.length(); j++){
			char ch = s.charAt(j);
			if(myVowel.contains(ch)){
				if(v.containsKey(ch)){
					v.put(ch,v.get(ch)+1);
				}else{
					v.put(ch,1);
				}
			}else{
				if(c.containsKey(ch)){
					c.put(ch,c.get(ch)+1);
				}else{
					c.put(ch,1);
				}
			}
		}
		
		int count = 0;
		for(Character k1 : c.keySet()){
			count = c.get(k1);
			if(maxC < count){
				maxC = count;
			}
		}
		
		for(Character k2 : v.keySet()){
			count = v.get(k2);
			if(maxV < count){
				maxV = count;
			}
		}
		
		int result = maxV + maxC; 
		
		System.out.println(v);
		System.out.println(c);
		
		System.out.println(result);
	}
}