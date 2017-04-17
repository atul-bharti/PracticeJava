package algo;

public class Fibbonacci {
    static long fnum = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibbonacci(40,1);

	}
	static long  fibbonacci(int n,int m) {
		if(n == 1 )
			return 1;
		long num = fibbonacci(n+m,n);
		if(num >= fnum)
			System.out.print(num+" ");
		fnum = num;
		return fnum;
	}

}
