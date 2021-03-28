import java.util.*;
import java.util.Arrays;

public class ProblemSolving {
	
	public static String balancedSums(List<Integer> arr) {
		
		int left_sum=0;
		int right_sum=0;
		int total_sum=0;
		
		for(int i=0; i< arr.size(); i++) {
			total_sum += arr.get(i);
		}
		
		for(int i=0; i<arr.size(); i++) {
			if(total_sum - left_sum - arr.get(i) == left_sum) {
				return "YES";
				
			}
			left_sum += arr.get(i);
			
			
			
			
		}
		
		return "NO";
		
	}
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int num=1;
		int min_elem= a.get(a.size() - 1);
		int i= a.get(a.size() - 1);
		int max_elem= b.get(0);
		int flag = 1;
		int count=0;
		while( i<= max_elem) {
			for(Integer x: a) {
				if(i % x != 0) {
					flag =0;
					break;
					
				}
			}
			
			if(flag == 1) {
				
				for(Integer y: b) {
					if(y % i != 0) {
						flag =0;
						break;
						
					}
				}
				
				
			}
			
			if(flag == 1) {
				count++;
			}
			
			
			i= min_elem * ++num;
			
		}
		
		return count;
		
		
		
		
		
		
	}
	
	
	
	public static int checkCommonMissing(HashSet<Integer> set1, HashSet<Integer> set2, int[] missing, int[] common) {
		int idx=0;
		int j=0;
		
		for(Integer n: set1) if(set2.contains(n)) common[idx++] = n; else missing[j++] = n;
		
		return j;
		

		
	}
	public static int[] missingNumbers(int[] arr, int[] brr) {
		
		HashSet<Integer> set1 = new HashSet<Integer>();
	        HashSet<Integer> set2= new HashSet<Integer>();
	        
	        for(Integer n: arr) set1.add(n);
	        for(Integer n: brr) set2.add(n);
	        int len= Math.max(set1.size(), set2.size());
	        int [] common= new int[len];
	        
	        int len1= arr.length;
	        int len2= brr.length;
	        int idx=0;
	        int count=0;
	        int[] missing = new int[len];
	        
	        for(Integer n: set2) if(set1.contains(n)) {
	            common[idx++] = n; 
	        }
	        else 
	        {
	            missing[count++] = n;
	        }
	        
	        HashMap<Integer, Integer> map1= new HashMap<Integer, Integer>();
	        HashMap<Integer, Integer> map2= new HashMap<Integer, Integer>();
	        
	        
	        
	        for(int i=0; i<len1; i++) {
	            map1.put(arr[i], map1.getOrDefault(arr[i], 0) + 1);
	        }
	        
	        for(int j=0; j<len2; j++) {
	            map2.put(brr[j], map2.getOrDefault(brr[j], 0) + 1);
	        }
	        
	        
	        for(int i=0; i<common.length; i++) {
	            if(map1.get(common[i]) != map2.get(common[i])) {
	                missing[count++] = common[i];
	                
	                
	            }
	            
	        }
	        
	        missing= Arrays.copyOf(missing, count);
	        Arrays.sort(missing);
	        
	        return missing;	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1= {11,4 ,11, 7 ,13, 4 ,12, 11, 10, 14};
//
//		int[] arr2= {11, 4, 11 ,7, 3 ,7, 10 ,13 ,4, 8, 12, 11, 10 ,14, 12};
//		
//		missingNumbers(arr1, arr2);
		
		List<Integer> list1 = new ArrayList<Integer>() {{
            add(3);
            add(4);
            } };
            
            List<Integer> list2 = new ArrayList<Integer>() {{
                add(24);
                add(48);
                } };
                
                getTotalX(list1, list2);

	}

}
