
public class  EmailValidation {

	public static void main(String[] args) {
		String email = "mail@nomail.com";
		System.out.println("Is email is valid: "+ emailValidation(email));
		email="mail@gmail.com";
		System.out.println("Is email is valid: "+ emailValidation(email));
		email="mail@yahoo.com";
		System.out.println("Is email is valid: "+ emailValidation(email));
		
	}
		public static boolean emailValidation(String email) {
			if(email.contains("@gmail.com") || email.contains("@yahoo.com")) {
				return true;
			}else {
				return false;
				
				
			}

		

	}

}
