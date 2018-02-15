package SCMahesh04.AMavenGit;

class Student
{
	int rollnumber;
	String name;
	int age;
	Student(int i, String n)
	{
		rollnumber=i;
		name=n;
		System.out.println("Rollnumber:" +rollnumber);
		System.out.println("Name:" +name);
	}
	Student(int i, String n,int a)
	{
		rollnumber=i;
		name=n;
		age=a;
		System.out.println("Rollnumber:" +rollnumber);
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
	}
}
public class AppTest 
{
	public static void main(String[] args) 
	{
		new Student(14,"Mahesh");
		System.out.println("___________________________");
		new Student(14,"Mahesh",25);
	}
}
