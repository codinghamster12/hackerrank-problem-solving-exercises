import java.util.HashMap;
import java.util.*;
import java.util.Stack;
import java.util.Arrays;
public class other {
	
	public static boolean isValid(String s) {
		
		HashMap<Character, Character> mappings= new HashMap<Character, Character>();
		mappings.put(')', '(');
		mappings.put('}', '{');
		mappings.put(']', '[');
		
		
		Stack<Character> stack= new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			char c= s.charAt(i);
			
			if(mappings.containsKey(c)) {
				char topElement= stack.empty() ? '#' :  stack.pop();
				
				if(topElement != mappings.get(c)) {
					return false;
				}
				
				
				
				
			}
			else {
				stack.push(c);
			}
			
			
			
			
		}
		
		return stack.isEmpty();
		
		
			
		
	}
	
	public static int camelCase(String s) {
		
		
		int i=0;
		int count=0;
		
		
		while(i < s.length()) {
			if(Character.isUpperCase(s.charAt(i))) {
				count++;
			}
			i++;
			
			
		}
		
		return count +1;
		
		
		
	}
	
	public static String caesarCipher(String s , int k) {
		char[] caesar= s.toCharArray();
		String newString= "";
		int x;
		
		for(Character ch: caesar) {
			
			if(Character.isLetter(ch)) {
				
				int ascii = ((int)ch + k);
				if(!((ascii >= 65) && (ascii <= 90)) && Character.isUpperCase(ch)) {
					while(!((ascii >= 65) && (ascii <=90)) ) {
						ascii = 65 + ascii -1 -90;
					}
					newString += (char)(ascii);
				}
				else if(!((ascii >= 97) && (ascii <= 122)) && Character.isLowerCase(ch)) {
					while(!((ascii >= 97) && (ascii <=122)) ) {
						ascii = 97 + ascii -1 -122;
					}
					newString += (char)(ascii);
				}
				else {
					newString += (char)((int)ch + k);
				}
				
			}
			else {
				newString+= (char)((int)ch);
			}
			
		}
		return newString;
		
	}
	
	public static String isPangram(String s) {
		boolean[] visited = new boolean[26];
		int index=0;
		char[] chars= s.toCharArray();
		
		for(Character ch: chars) {
			if(Character.isLetter(ch)) {
				if(Character.isLowerCase(ch)) {
					index = ch - 'a';
					
				}
				else if(Character.isUpperCase(ch)) {
					index = ch - 'A';
				}
				
				visited[index]= true;
				
				
			}
			
			
			
			
		}
		
		for(int i=0; i<visited.length; i++) {
			if(!visited[i]) {
				return "not pangram";
			}
			
		}
		
		return "pangram";
		
		
		
	}
	
	public static boolean checkPallindrome(char[] chars) {
		
		
		int i=0;
		int j=chars.length - 1;
		
		
		while(i<j) {
			if(chars[i] != chars[j]) return false;
			else i++; j--;
			
			
			
		}
		
		return true;
		
	}
	
	public static int pallindromeIndex(String s) {
		
		int l = s.length();
        int i,j,a,b;
        for (i=0, j=l-1; i<l; i++,j--){
            if (s.charAt(i)!=s.charAt(j))
                break;
        }
        if (i>j) return -1;

        for (a = i+1, b = j;a<j && b>i+1; a++,b--){
            if (s.charAt(a)!=s.charAt(b))
                return j;
        }
        return i;
		
		
		
		
		
		
	}
	
	public static String superReducedString(String s) {
		Stack<Character> stack= new Stack<Character>();
		for(int i=0; i<s.length(); i++) {
			char c= s.charAt(i);
			
			if(stack.isEmpty()) {
				stack.push(c);
			}
			else {
				char topElement= stack.peek();
				
				if(topElement == c) {
					stack.pop();
				}
				else {
					stack.push(c);
				}
				
			}
			
			
			
			
			
		}
		
        StringBuilder sb= new StringBuilder("");
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        
        
        
        
        
        
        
        
        return sb.reverse().toString();
		
		 
       
			
		
		
		
		
			
		
		
		
		
		
		
			
		
	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		if(strs.length == 0) return "";
		String prefix= strs[0];
		
		for(int i=1; i<strs.length; i++) {
			while(strs[i].indexOf(prefix) != 0) {
				prefix= prefix.substring(0, prefix.length() - 1);
			}
		}
		
		return prefix;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs= {"flower", "flow", "flight"};
		longestCommonPrefix(strs);
		superReducedString("aaabccddd");
		camelCase("saveChangesInTheEditor");
		isValid("({})");
		caesarCipher("middle-Outz", 2);
		isPangram("The quick brown fox jumps over the lazy dog");
		pallindromeIndex("aaccccbaa");

	}

}
