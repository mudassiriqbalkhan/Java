import java.util.Scanner;
class DoWhileExample{
public void calcTable(int number){
do{
int i=10;
while(i<=10){
System.out.println("number+"X"+i+"="+(number * i));
i=i+2;
}
while(i<=10);
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter number for table");
int number = sc.nextInt();
DoWhileExamplewe=new DoWhileExample();
we.calcTable(number);
}
}