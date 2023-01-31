import java.util.Scanner;
class SwitchExample{
	public void cal_grade(){
		switch(grade){
		case "A" :
		System.out.println("Congrates......you marks is in range of 100-80");
		break;
		case "B" :
		System.out.println("Great......you marks is in range of 80-65");
		break;
		case "C" :
		System.out.println("Congrates......you marks is in range of 65-50");
		break;
		case "D" :
		System.out.println("Congrates......you marks is in range of 50-36");
		break;
		case "F" :
		System.out.println("Failed.. your marks is below 35");
		break;
		default:
		System,out.println("error invalid input");
	}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Grade");
		String grade = sc.next();
		grade=grade=sc.next();
		SwitchExample se = new SwitchExample();
		se.calc_grade(grade);
	}
}
	
