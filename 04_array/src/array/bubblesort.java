package array;

public class bubblesort {

	public static void main(String[] args) {
		int[] ar = {25, 40, 32 ,78, 56};
		
			//소트 전
			for(int i=0; i<ar.length; i++) {
				System.out.print(String.format("%4d", ar[i]));
			}
			System.out.println();
			
			//정렬
			//오름차순 ( ASCENDING)
			//내림차순	( DESCENDING)\
			int temp;
			for(int i=0; i<ar.length-1; i++ ) {
				for(int j=0; j<ar.length-1-i; j++){
					if(ar[i] > ar[j+1]) {// > 오름차순, < 내림차순
						temp = ar[j];
						ar[j] = ar[j+1];
						ar[j+1] = temp;
					}
				}
			}
			//소트 후 
			for(int i=0; i<ar.length; i++) {
				System.out.print(String.format("%4d", ar[i]));
			}
			System.out.println();
		}




}


