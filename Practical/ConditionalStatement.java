ximport java.util.Scanner;//import scanner class of util package
class ConditionalStatement{
public void calc(float x, float y){
if(x>y){
System.out.println("x is greater than y");
}
else{
System.out.println("x is not greater than y");
}
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter number 1");
float x = s.nextFloat();
System.out.println("enter number 2");
float y= s.nextFloat();
ConditionalStatement obj = new 	ConditionalStatement();
obj.calc(x,y);
}
}
