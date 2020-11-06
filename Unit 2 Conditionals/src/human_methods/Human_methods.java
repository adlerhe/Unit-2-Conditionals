package human_methods;

public class Human_methods {
	private static final int b = 98, g = 103;
	private int age;
	private int gender;
	
	
	//code starts here
	//settings
	public void setAge(int human_age) {
		age = human_age;
	}

	public void setGender(int sex) {
		
		gender = sex;
	}
	//vote
	public void vote() {
		if(age > 18) {
			System.out.println("yes");
			}
		else {
			System.out.println("no");
		}
		
	}
	//get shot
	public void need_shot() {
		if(age%4 == 0) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
	}
	//are you a toddler
	public void type_of_human() {
		if(age < 4) {
			if (gender == 103) {
				System.out.println("toddler girl");
			}
			if (gender == 98) {
				System.out.println("toddler boy");
				
			}
				
		}
		else {
			System.out.println("not a toddler");
		}
	}
	//do you get movie discount
	public void movie_discount() {
		if( age > 65 || age < 12) {
		System.out.println("yes");
		}
		else {
		System.out.println("no");
		}
	}
	//are you a teenager
	public void teenager() {
		if( age<18 || age>12) {
		System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	public static void main(String[] args) {
		Human_methods runner = new Human_methods();
		runner.setAge(3);
		runner.setGender((int)(b));
		runner.vote();
		runner.need_shot();
		runner.type_of_human();
		runner.movie_discount();
		runner.teenager();
	}

	private void vote(int i) {
		// TODO Auto-generated method stub
		
	}

	private void need_shot(int i) {
		// TODO Auto-generated method stub
		
	}

}
