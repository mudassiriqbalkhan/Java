import java.util.Scanner;
class ForExample{
public void calcTable(int number){
for(int i=1; i<=10;i++){
System.out.println("value is:"+(number * i);
}
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
ForExample fe=new ForExample();
fe.calcTable(number);
}
}