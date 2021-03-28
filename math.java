import java.util.ArrayList;
import java.util.*;
public class math {
	
	public static int countPrimes(int n) {
		boolean[] arr= new boolean[n];
        int count =0;
        for(int i=2; i*i<n; i++){
            for(int j=2; i*j<n; j++){
                arr[i*j]= true;
            }
        }
        for(int i=2; i<arr.length; i++){
            if(!arr[i]){
                count++;
            }
        }
        return count;
	}
	public static int singleNumber(int[] A) {
		int x = 0;
		for (int a : A) {
			x = x ^ a;
		}
		return x;
	}
	public static boolean containsDuplicate(int[] nums) {
        int val= nums[0];
        for(int i=1; i<nums.length; i++){
            if(val== nums[i]){
                return true;
            }
        }
        return false;
        
    }
	public static int firstUniqChar(String s) {
        int size= s.length();
        char[] arr= s.toCharArray();
        HashSet<Character> set= new HashSet<Character>();
        for(char i: arr){
            if(set.contains(i)){
                set.remove(i);
            }
            else{
                set.add(i);
            }
        }
        char val= set.iterator().next();
        for(int i=0; i<size; i++){
            if(arr[i]== val){
                return i;
            }
        }
        return -1;
        
    }
	
	public static void reverseString(char[] arr) {
		int j=0;
		int n= arr.length;
		int mid= n/2;
		for(int i=n-1; i>=mid; i--) {
			Character temp= null;
			temp= arr[j];
			arr[j]= arr[i];
			arr[i]= temp;
			j++;
		}
	}
	
	public static int reverseInt(int num) {
		String str= Integer.toString(num);
		char[] arr= str.toCharArray();
		StringBuilder sb= new StringBuilder();
		Character sign= null;
		int n= arr.length;
		int j=0;
		int mid= n / 2;
		
		if(arr[j]== '-') {
			sign= arr[j];
			j++;
			mid= mid+1;
		}
		
		for(int i=n-1; i>=mid; i--) {
			
			
			
			
			
			Character temp= null;
			temp= arr[j];
			arr[j]= arr[i];
			arr[i]= temp;
			j++;
				
			
			
			
		}
		int a =0;
		if(sign != null) {
			sb.append(sign);
			a=1;
		}
		while(a<n && arr[a] == '0') {
			a++;
		}
		for(int i=a; i<n; i++) {
			sb.append(arr[i]);
		}
		
		try {
			return Integer.parseInt(sb.toString());
		}
		catch(Exception e) {
			return 0;
		}
				
		
	}
	public static String removeZero(String str) 
    { 
        // Count leading zeros 
        int i = 0; 
        while (i < str.length() && str.charAt(i) == '0') 
            i++; 
  
        // Convert str into StringBuffer as Strings 
        // are immutable. 
        StringBuffer sb = new StringBuffer(str); 
  
        // The  StringBuffer replace function removes 
        // i characters from given index (0 here) 
        sb.replace(0, i, ""); 
  
        return sb.toString();  // return in String 
    } 
	
	public static boolean validPallindrome(String s) {
        int left= 0;
        s= s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] arr= s.toCharArray();
		int right= s.length() -1;

            
        while(left < right){
            Character temp= null;
            temp= arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        String x="";
        for(int i=0; i<s.length(); i++){
            x+= arr[i];
        }
        if(x.equals(s)){
            return true;
        }
        return false;
	}
	
        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
