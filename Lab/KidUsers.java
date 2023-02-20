//Scenario: A library needs to develop an online application for two types of users/roles, Adults and children. Both of these users should be able to register an account. Any user who is less than 12 years of age will be registered as a child and they can borrow a “Kids” category book for 10 days, whereas an adult can borrow “Fiction” category books which need to be returned within 7 days.
Note: In future, more users/roles might be added to the library where similar rules will be enforced.
package Lab3;//defining package

public class KidUsers implements LibraryUser {//creating class KidUsers which implements an interface LibraryUser

	//	defining instance variables
	int age=11;
	String bookType="Kids";
	
	//defining the abstract methods 
	
	@Override
	public void registerAccount() {
		
		if(age<=12)//checking if age is less than equal to 12
		{
			System.out.println("You have successfully registered under a Kids Account");//printing success message on true condition
		}
		else if (age>12){//checking if age is greater than equal to 12
			System.out.println("Sorry, Age must be less than 12 to register as a kid");//printing failure message on condition age greater than 12
		}
		
	}

	@Override
	public void requestBook() {
		if(bookType=="Kids")//checking if bookType is Kids
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");//printing success message on true condition
		}
		else //while bookType is not Kids
		{
			System.out.println("Oops, you are allowed to take only kids books");//printing failure message on false condition 
		}
	}

}
