import java.util.Scanner;
public class numberOfOnes {
	
	public static int countOnes(int n) {
		String binary= "";
		int rem=0;
		
		while(n > 0) {
			n = n/2;
			rem = n% 2;
			binary += rem;
			
		}
		
		char[] arr= binary.toCharArray();
		
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='1') {
				count++;
			}
		}
		return count;
		
	}
	
	public static boolean powerOfThree(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
		
	}
	
	public static int romanToInt(String s) {
		char[] arr= s.toCharArray();
		int num =0;
		
		int j=0;
		while(arr[j]== 'I' && arr[j+1] != 'V' && arr[j+1] != 'X' && arr[j+1]!= 'L' && arr[j+1] != 'C' && arr[j+1] != 'D' && arr[j+1] != 'M') {
			num+=1;
			j++;
		}
		
			
			for(int i=j; i<arr.length; i++) {
				
				while(arr[i] == 'I' && (arr[i+1] == 'V' && arr[i+1] != 'X' || arr[i+1]!= 'L' || arr[i+1] != 'C' || arr[i+1] != 'D' || arr[i+1] != 'M')) {
					num += 1;
					
				}
				if(arr[i] == 'V') {
					num += 5;
					
					
				}
				if(arr[i] == 'L') {
					num += 50;
				}
				if(arr[i]== 'X') {
					num+=10;
				}
				
				if(arr[i] == 'M') {
					num += 1000;
				}
				if(arr[i] == 'D') {
					num += 500;
				}
				if(arr[i] == 'C') {
					num += 100;
				}
				
				
				
				
			
			
		}
		
		
		return num;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		String s= scanner.nextLine();
		
		romanToInt(s);
		
		
		
				
		
	

	}

}
