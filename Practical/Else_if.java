import java.util.Scanner;
class Else_if{
public void calc(int marks){
if((marks >= 75) && (marks <=100)){
System.out.println("good keep it up");
}
else if((marks <=74) && (marks >=35)){
System.out.println("need to work hard");
}
else if((marks <=34) && (marks >=0)){
System.out.println("failed");
}
else{
System.out.println("wrong input");
}
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter your marks");
int marks=sc.nextInt();
Else_if m=new Else_if();
m.calc(marks);
}
}
