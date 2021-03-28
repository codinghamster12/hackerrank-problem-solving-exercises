import java.util.*;
public class Arrays {
	
	public static void duplicateZeros(int[] arr) {
		for(int i=0; i<arr.length - 1; i++){
            if(arr[i] == 0){
                
                for(int j=arr.length - 1; j> i+ 1; j--){
                    arr[j]= arr[j - 1];
                }
                
                arr[i+1]= 0;
                i++;
            }
        }
	}
	
	public static boolean mountainArray(int[] arr) {
		int max =Integer.MIN_VALUE;
		int maxInd= 0;
		boolean result= false;
        if(arr.length < 3){
            return result;
        }
		for(int i=0; i< arr.length ; i++) {
			if(arr[i] > max ) {
				max = arr[i];
				maxInd= i;
			}
		}
        if(maxInd== arr.length - 1 || maxInd == 0){
            return result;
        }
        else{
            for(int i=0; i<maxInd -1; i++) {
			if(arr[i+1] > arr[i]) {
				result= true;
			}
			else {
				result= false;
				return result;
			}
		}
		for(int i=maxInd; i<arr.length - 1; i++) {
			if(arr[i+1] <  arr[i]) {
				result= true;
			}
			else {
				result= false;
				return result;
			}
		}
            
        }
		
		return result;
	}
        
		public static int[] replaceElements(int[] arr) {
			int n= arr.length;
	        
	        for(int i=0; i<n; i++){
	            int j= i+ 1;
	            int max= Integer.MIN_VALUE;
	            if(i == n-1){
	                arr[i]= -1;
	                return arr;
	            }
	            else{
	                while(j < n){
	                
	                if(arr[j] > max){
	                max= arr[j];
	                }
	                
	                j++;
	                
	                
	            }
	            arr[i] = max;
	            }
	            
	            
	            
	            
	        }
	        return arr;
	        
		}
		
		public static int[] sortArrayByParity(int[] A) {
			int n= A.length;
	        int i=0;
	        int k= n-1;
	        for(int j=0; j<n; j++){
	            
	                if(A[j] % 2 == 0){
	                	
	                    A[i]= A[j];
	                    i++;
	                }
	                else{
	                	
	                	A[k] = A[j];
	                    k--;
	                    
	                }
	            
	        
	        }
	        return A;
		}
		
		public static int[] moveZeros(int[] nums) {
		    int n= nums.length;
	        int[] B= new int[n];
	        int k= n-1;
	        int j=0;
	        
	        for(int i=0; i<n; i++){
	            if(nums[i] == 0){
	                B[k--]= nums[i];
	            }
	            else{
	                B[j++]= nums[i];
	            }
	        }
	        return B;
		}
		
		public static int thirdMax(int[] nums) {
			int n= nums.length;
	        int count=3;
	        int max= Integer.MIN_VALUE;
	        int i=0;
	        int b=0;
	        
	        int maxInd= -1;
	        for(int m=0; m<n-1; m++) {
		        	for(int k=m+1; k < n; k++) {
		        		if(nums[k] > nums[m]) {
		        			int temp=0;
		        			temp= nums[m];
		        			nums[m]= nums[k];
		        			nums[k] = temp;
		        		}
		        	}
		        }
	        
	        for(int a=1; a<n; a++){
	            if(nums[a] != nums[b]){
	                nums[++b]= nums[a];
	                
	                
	            }
	        }
	        
	        n= b +1;
	        
	        
	        if(count > n){
	            for(int j=0; j<n; j++){
	                if(nums[j] > max){
	                    
	                    max= nums[j];
	                    maxInd= j;
	                }
	               
	            }
	            return max;
	            
	            
	        }
	        
	        while(i< count){
	            for(int j=0; j<n; j++){
	                if(nums[j] > max){
	                    
	                    max= nums[j];
	                    maxInd= j;
	                }
	                else if(nums[j] == max && nums[j] != Integer.MIN_VALUE){
	                    count++;
	                    
	                }
	            }
	            i++;
	            if(i== count){
	                return max;
	            }
	            else{
	                
	            nums[maxInd]= Integer.MIN_VALUE;
	            max= Integer.MIN_VALUE;
	            }
	            
	            
	            
	            
	        }
	        
	        return max;
	       
			
		}
		
			
		
	
	
	public static int removeElement(int[] nums, int val) {
		int n= nums.length; 
		int i=0;
		while(i<n) {
			if(nums[i] == val) {
				for(int j=i+1; j<n; j++) {
					nums[j-1]= nums[j];
				}
				n--;
			}
			else {
				i++;
			}
		
		}
		return n;
	}
	public static List<Integer> findDisappearedNumbers(int[] nums){
		ArrayList<Integer> missingNumbers= new ArrayList<Integer>();
		HashSet<Integer>  numbers= new HashSet<Integer>();
		int n= nums.length;
		for(int i=0; i<n; i++) {
			numbers.add(nums[i]);
		}
		for(int i=1; i<=n; i++) {
			if(!numbers.contains(i)) {
				missingNumbers.add(i);
			}
		}
		
		return missingNumbers;
		
		
	}
	public static int pivotIndex(int[] nums) {
        int left_sum=0;
        int n= nums.length;
        int total_sum=0;
        for(int i=0; i<n; i++) {
        	total_sum += nums[i];
        }
        for(int i=0; i<n; i++) {
        	if(i!=0) left_sum = left_sum + nums[i-1];
        	if(total_sum - left_sum - nums[i] == left_sum) {
        		return i;
        	}
        }
        return -1;
	}
	
	public static int[] plusOne(int[] digits) {
        String str= "";
        int[] arr= new int[digits.length];
        for(int i=0; i< digits.length; i++){
            str+= digits[i];
        }
        int plusOne= Integer.parseInt(str) + 1;
        char[] num= Integer.toString(plusOne).toCharArray();
        for(int i=0; i<num.length; i++){
            arr[i] = Character.getNumericValue(num[i]);
        }
        
        return arr;
        
        
    }
	
	public static String binaryAddition(String a, String b) {
	    StringBuilder sb= new StringBuilder();
	    int i= a.length() -1;
	    int j= b.length() - 1;
	    int carry=0;
	    
	    while(i>=0 || j>=0) {
	    	int sum= carry;
	    	if(i>=0) sum+= a.charAt(i) - '0';
	    	if(j>=0) sum+= b.charAt(j) - '0';
	    	sum= sum % 2;
	    	carry = sum / 2;
	    	i--;
	    	j--;
	    	
	    }
	    if(carry!= 0) sb.append(carry);
	    
	    return sb.reverse().toString();
	   
	}
	public static String longestCommonPrefix(String[] strs) {
		int j=0;
       
        int min= Integer.MAX_VALUE;
       
        String min_string="";
        int n= strs.length;
        for(int i=0; i<n; i++){
            if(strs[i].length() < min){
                min= strs[i].length();
                min_string= strs[i];
            }
        }
        int [] arr= new int[min];
        char[]char_arr= new char[min];
        while(j<min){
        	int count=0;
            for(int i=0; i<n; i++ ){
            if(strs[i].charAt(j) == min_string.charAt(j)){
                count++;
            }
            if(count == n){
                char_arr[j]= min_string.charAt(j);
                
                    
            }
                
            
        }
            j++;
            
            
        }
        
        for(int i=0; i<min; i++){
            while(arr[i+1]== arr[i] +1 ){
                char_arr[i]= char_arr[i];
                
            }
        }
        StringBuilder join_str= new StringBuilder();
        
        for(int i=0; i< char_arr.length; i++) {
        	join_str.append(char_arr[i]);
        }
        return join_str.toString();
	}
	
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr= {"flower","flow","flight"};
		longestCommonPrefix(arr);
		
		

		
		
		

	}

}
