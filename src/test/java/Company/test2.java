package Company;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class test2 
{
//String s="aaaabbbccd" write a program which will provide output as "a4b3c2d1"
public static void main(String [] args) 
{
String s= "aaaabbbccd";


Map<Character, Integer> charmap= new HashMap<>();

for(char c : s.toCharArray())
{
	
	charmap.put(c,charmap.getOrDefault(c, 0)+1);
	
}
	for(Map.Entry<Character, Integer>entry : charmap.entrySet()) {
		
		 System.out.print(entry.getKey() + entry.getValue().toString());
	}
	

	
	
}
	
	
}
