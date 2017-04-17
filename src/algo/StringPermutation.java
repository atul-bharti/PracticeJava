package algo;



public class StringPermutation {
	static char[] str = new char[3];
	static  char[] alphabet = {'a','b','c'};
	static int strLen = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 permute(strLen,alphabet.length-1);
	}
	
	static void permute(int n,int k) {
		
		if(n < 1) {
			printArr();
			return;
		}
		for(int i =0;i < k  ;i++) {
			str[n-1] = alphabet[i];
			permute(n-1,k);
		}
	}
	static void printArr(){
		for(int i = 0;i < strLen; i ++)
			System.out.print(str[i]);
		System.out.println();
	}

}
