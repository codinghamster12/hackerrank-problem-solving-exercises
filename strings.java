import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
public class strings {
	
	
	public static int firstUniqueChar(String s) {
		HashMap<Character, Integer> count= new HashMap<Character, Integer>();
		int n= s.length();
		
		for(int i=0; i<n; i++) {
			char c= s.charAt(i);
			count.put(c, count.getOrDefault(c, 0) + 1);
			
		}
		
		for(int i=0; i<n; i++) {
			if(count.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public static int[] intersection2(int[] nums1, int[] nums2) {
		HashSet<Integer> set1= new HashSet<Integer>();
		HashSet<Integer> set2= new HashSet<Integer>();
		
		for(Integer i: nums1) set1.add(i);
		
		for(Integer i: nums2) set2.add(i);
		
		int len= Math.max(set1.size(), set2.size());
		
		int[] output= new int[len];
		int idx=0;
		
		for(Integer s: set1) if(set2.contains(s)) output[idx++] = s;
		
		output= Arrays.copyOf(output,  idx);
		
		HashMap<Integer, Integer> count1= new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> count2= new HashMap<Integer, Integer>();
		
		for(int i=0; i< nums1.length; i++) {
			count1.put(nums1[i], count1.getOrDefault(nums1[i], 0) + 1);
		}
		
		for(int i=0; i< nums2.length; i++) {
			count2.put(nums2[i], count2.getOrDefault(nums2[i], 0) + 1);
		}
		List<Integer> arrayList= new ArrayList<Integer>();
		
		int counter=0;
		for(Integer num: output) {
			int min= Math.min(count1.get(num), count2.get(num));
			for(int i=0; i< min; i++) {
				arrayList.add(output[counter]);
			}
			counter++;
		}
		int[] arr= new int[arrayList.size()];
		int ind= 0;
		for(Integer num: arrayList) {
			arr[ind++] = num;
			
		}
		
		return arr;

		
		
		
	}
	
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set1= new HashSet<Integer>();
		for(Integer num: nums) {
			
			if(set1.contains(num)) {
				return true;
			}
			else {
				set1.add(num);
			}
		}
		return false;
		
	}
	
	public static int[] set_intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set1= new HashSet<Integer>();
		HashSet<Integer> set2= new HashSet<Integer>();
		
		for(Integer i: nums1) set1.add(i);
		
		for(Integer i: nums2) set2.add(i);
		
		int len= Math.max(set1.size(), set2.size());
		
		int[] output= new int[len];
		int idx=0;
		
		for(Integer s: set1) if(set2.contains(s)) output[idx++] = s;
		
		return Arrays.copyOf(output, idx);
		

		
	}
	
	
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		int[] counter= new int[26];
		
		for(int i=0; i< s.length(); i++) {
			counter[s.charAt(i) - 'a']++;
			counter[t.charAt(i) - 'a']--;

		}
		
		for(int count: counter) {
			if(count != 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAnagram("aacc", "ccac");
		firstUniqueChar("loveleetcode");
		
		int[] nums1= new int[] {1,1,1,3,3,4,3,2,4,2};
		int[] nums2= new int[] {2,2};
		
//		set_intersection(nums1, nums2);
		intersection2(nums1, nums2);
		
		containsDuplicate(nums1);
		
		
		

	}

}
