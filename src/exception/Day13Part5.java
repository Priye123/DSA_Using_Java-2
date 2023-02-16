package exception;

class RahulNotFoundException extends Exception {

	public RahulNotFoundException() {
		super("Rahul is missing");
		//System.out.println("---------------------------");
	}
}

public class Day13Part5 {

	public static void main(String[] args) throws RahulNotFoundException {
		String food_choice = "Maggi";
		
		System.out.println("Hello");
		if (!(food_choice.equals("Chowmein"))) {
			throw new RahulNotFoundException();
			//System.out.println("Rahul");
			
		}else {
			System.out.println("Woww!!!! I got my choice");
		}

	}

}

//Assignment
// class :- UnderAgeException
//class:-Voting 
//age<18 if ---it must throw UnderAgeException
//       else --- You can vote 
