package collection;

import java.util.ArrayList;

public class PersonMain {
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("원숭이", 25);
		PersonDTO bb = new PersonDTO("돼지", 39);
		PersonDTO cc = new PersonDTO("호랑이", 29);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
		
		
	}
	public static void main(String[] args) {
		PersonMain personMain = new PersonMain();
		ArrayList<PersonDTO> list = personMain.init();
		
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO.getName()+ "\t" + personDTO.getAge());
		}//for
		System.out.println();
		
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		
		
		
		
		
	}

}
