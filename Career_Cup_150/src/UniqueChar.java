import java.util.HashMap;

/**
 * 
 */

/**
 * @author Wenzhe
 * @date 3/6/2013
 * career_cup 1.1
 */
public class UniqueChar {
	public static boolean isUnique_naive(String s){
		if(s.length() < 2){
			return true;
		}
		HashMap<Character,Integer> LetterAppearance = new HashMap<Character,Integer>(256);   
		for(int i=0;i<s.length();i++){
			if(LetterAppearance.containsKey(s.charAt(i))){
				return false;
			}else{
				LetterAppearance.put(s.charAt(i), 1);
			}
		}
		
		return true;	
	}
	
	public static boolean isUnique_charset(String s){
		boolean[] letters = new boolean[256];
		for(int i=0;i<s.length();i++){
			int val = s.charAt(i);
			if(letters[val] == true){
				return false;
			}else{
				letters[val] = true;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		String s = "abcsd";
		System.out.println(isUnique_charset(s));
	}
}
