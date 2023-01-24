Class{
 static int num = 55;
 long num1 = 7654321980;
 public void display(){
 char a = 'M';
 double num2=45.355;
 System.out.println("local variable value :"+a);
 System.out.println("local variable value :"+num2);
 }
 public static void calc(){
	 float b = 99.34;
	 float c = 45.23;
	 float res =b * c;
	 System.out.println("Result is :" +res);
 public static void main(String args[]){
 variableExample obj = new variableExample();
 obj.display();
 System.out.println("Instance variable value: " + obj.num1);
 System.out.println("Static variable value : " + variableExample.num);
  System.out.println("local variable value: " +num2);
  
 }
 
 }