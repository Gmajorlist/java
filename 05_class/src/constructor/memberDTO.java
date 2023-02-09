package constructor;

public class memberDTO {// 1인분클래스// DTo = Data transfer Object 
                           // Member Vo // vo=Value Object
	private String name;
	private int age;
	private String phone;
	private String address;
	
	//생성자를 통해서 데이터 4개를 받아본다.
	public memberDTO(String name, int age, String phone,String address ) {
		this.name = name;
		this.age = age;
		this.phone =phone;
		this.address =address;
	}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getPhone() {
			return phone;
		}
		public String getAddress() {
			return address;
		}
	}


