package multi;

public class multiarray02 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10];
		int num =0;
		
		//입력
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				num++;
//				ar[i][j]= num;
//			}
//		}//입력부분은 마음대로 수정가능
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				num++;
				ar[j][i]= num;
//			}   1  11  21  31  41  51  61  71  81  91
//			   2  12  22  32  42  52  62  72  82  92
//			   3  13  23  33  43  53  63  73  83  93
//			   4  14  24  34  44  54  64  74  84  94
//			   5  15  25  35  45  55  65  75  85  95
//			   6  16  26  36  46  56  66  76  86  96
//			   7  17  27  37  47  57  67  77  87  97
//			   8  18  28  38  48  58  68  78  88  98
//			   9  19  29  39  49  59  69  79  89  99
//			  10  20  30  40  50  60  70  80  90 100
			}
			}
//		for(int i=ar.length-1; i>=0; i--) {
//			for(int j=ar[i].length-1; j>=0; j--) {
//				num++;
//				ar[i][j]= num;
			// 100  99  98  97  96  95  94  93  92  91
//			  90  89  88  87  86  85  84  83  82  81
//			  80  79  78  77  76  75  74  73  72  71
//			  70  69  68  67  66  65  64  63  62  61
//			  60  59  58  57  56  55  54  53  52  51
//			  50  49  48  47  46  45  44  43  42  41
//			  40  39  38  37  36  35  34  33  32  31
//			  30  29  28  27  26  25  24  23  22  21
//			  20  19  18  17  16  15  14  13  12  11
//			  10   9   8   7   6   5   4   3   2   1

//		}
		
		
		
		
		
		
		//출력
		for(int i=0; i<ar.length; i++) {//3을쓴이유는 3행이라서 
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(String.format("%4d",ar[i][j]));
			}//for j
			System.out.println();
		}//for i
		
		

	}

		}

	


