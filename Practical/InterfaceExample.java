interface Sports{
public void homeTeam(String name);
public void team(int noOfPlayers);

}

class FootBall implements Sports{
public void homeTeam(String name){
name="mumbai";
System.out.println("our team is representing"+name);

}
public void team(int noOfPlayers){
noOfPlayers=11;
System.out.println("total no of players:"+noOfPlayers);
}
}
class InterfaceExample{
public static void main(String args[]){
FootBall b = new FootBall();
b.homeTeam();
b.team();
}
}