class Student{
	
	//private data members
	private int sid;
	private String name;
	private String email;
	private long phoneno;
	
	//getter setter method
	public int getSid(){
		return sid;
	}
	
	public void setSid(int sid){
		this.sid = sid;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public long getPhoneno(){
		return phoneno;
	}
	
	public void setPhoneno(long phoneno){
		this.phoneno = phoneno;
	}
	
}

class EncapsulationDemo{
	public static void main(String args[]){
		
		Student s = new Student();
		s.setSid(100);
		s.setName("mudassir");
		s.setEmail("mud123@gamil.com");
		s.setPhoneno(123);
		
		System.out.println("Values are :" + s.getSid() + " " + s.getName() + " " + s.getEmail() + " " + s.getPhoneno());
	}
}