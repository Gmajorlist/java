package multi;

public class multiarray01 {

	public static void main(String[] args) {
		int[][] ar = new int [3][2]; // 3행 2열 
		
		ar[0][0]=10;
		ar[0][1]=20;
		
		ar[1][0]=30;
		ar[1][1]=40;
		
		ar[2][0]=50;
		ar[2][1]=60;
		//다중for 사용 하면 됩니다.
		for(int i=0; i<3; i++) {//3을쓴이유는 3행이라서 
			for(int j=0; j<ar[i].length; j++) {
				System.out.println("ar["+ i +"]["+ j +"] = " + ar[i][j]);
			}//for j
			System.out.println();
		}//for i
		
		

	}

}
