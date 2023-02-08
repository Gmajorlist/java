package class_;

public class computer { //1인분
	private int x, y, sum, sub, mul;
	private double div;
	
	public void setData(int x, int y) {
		this.x= x;
		this.y= y; //여기서는 this 반드시 사용해야한다.2
		
	}
	public void calc() {
		this.sum = this.x + this.y;
		sub = x-y;
		mul = x*y;
		div = (double)x/y;
	}
	public int getx() {
		return x; // this 생략이 가능하다
	}
	public int gety() {
		return y;
}
	public int getsum() {
		return sum;
}
	public int getsub() {
		return sub;
}
	public int getmul() {
		return mul;
}
	public String getdiv() {
		return String.format("%.3f" , div);
}
	
}




