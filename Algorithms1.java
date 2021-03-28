
public class Algorithms1 {
	
	public static int alaRusse(int a, int b) {
		int res= 0;
		while(a > 0) {
			if(a % 2 == 1) {
				res= res + b;
			}
			a= a/2;
			b= b* 2;
		}
		return res;
		
	}
	
	public static void divideInt(int a, int arr[]) {
		 int x = 0;
		 int index = 0;
		 while ((a % 100) > 0) {
		 x = a % 100;
		 a = a / 100;
		 arr[index] = x;
		 index++;
		 }
		 }
	public static int find_length(int a) {
		 int length = (int) Math.log10(Math.abs(a)) + 1;
		 
		if (length % 2 != 0) {
		 length = (int) (length / 2) + 1;
		 } else {
		 length = (int) (length / 2);
		 }
		 return length;
		 }
	
	
	public static double divideAndConquer(int a, int b) {
		
		if(a / 10 == 0 || b / 10 ==0) {
			return a * b;
		}
		else {
			
			int length1= find_length(a);
			int length2= find_length(b);
			
			int[] arr1= new int[length1];
			int[] arr2= new int[length2];
			int n= Math.max(length1, length2);
			
			divideInt(a, arr1);
			divideInt(b, arr2);
			
			
			double x1= divideAndConquer(arr1[0], arr2[0]); 
			double x2= divideAndConquer((arr1[0]), arr2[1]);
			double x3= divideAndConquer((arr1[1]), (arr2[0]));
			double x4= divideAndConquer((arr1[1]), (arr2[1]));
			
			return x1* Math.pow(10, n) + (x2 + x3) * Math.pow(10,  n/2) + x4;
			
			
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alaRusse(981, 1234);
		divideAndConquer(981, 1234);

	}

}
