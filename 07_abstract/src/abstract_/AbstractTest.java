package abstract_;

public abstract class AbstractTest { //POJO (Plain Old Java Object)
	protected 
	
	private String name;
//private 외부로 부터 데이터가 안들어옴
//생성자, setter로 들어오고 getter로 나감 
	

	public AbstractTest() {
		// TODO Auto-generated constructor stub
	}

	public AbstractTest(String name) {//구현
	super();
	this.name = name;
}
	
	
	public String getName() {
		return name;
	}


	public abstract void setName(String name); //추상메소드		
	
	


	

}
