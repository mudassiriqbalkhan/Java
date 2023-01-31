import java.util.Scanner;
class WhileExample{
public void calcTable(int number){
int i=1;
while(i<=10){
System.out.println("value is:"+(number * i));
i++;
}
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter number for table");
int number = sc.nextInt();
ForExample fe=new ForExample();
fe.calcTable(number);
}
}