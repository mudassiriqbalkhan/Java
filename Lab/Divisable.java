//write a program to print numbers from 1-100 which are divisable by 5 and if the number is grater than 40
public class Divisable{
public void divByGreaterThan40(){
for(int i=1;i<=100;i++)
{
if(i%5==0 && i>40)
{
System.out.println(i+"");
}
}
}
public static void main(String args[]){
Divisable obj=new Divisable();
System.out.println("number from 1-100 which are divisable by 5 and grater than 40:");
obj.divByGreaterThan40();
}
}