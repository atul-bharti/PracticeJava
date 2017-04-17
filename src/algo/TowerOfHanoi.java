package algo;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String from ="A";
		String to ="B";
		String aux ="C";
		int diskCount = 3;
		transfer( diskCount, from, to, aux);

	}
	
	public static void transfer(int diskCount,String from,String to,String aux) {
		if(diskCount == 1) {
			System.out.println("Transfer from "+from+" to "+to);
			return;
			}
		transfer(diskCount -1, from, aux,to);
		transfer(1, from, to,aux);
		transfer(diskCount -1, aux, to,from); 
		
	}

}
