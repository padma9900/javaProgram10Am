//write a program  for object

class Qspider1 
{
	String branch1="BTM";
	String branch2="malleshwaram";
	String branch3="Rajajinagar";
	String branch4="old airport road";
	String fees="32000 for fresher";
String fees1="40000 for experinced";

	void branch()
	{
System.out.println("there are 2 courses available");
System.out.println("Testing");
System.out.println("Developmemnt");

	}
	void student()
	{
System.out.println("Jspider training");
System.out.println("Qspider training");

	}
	public static void main(String[] args) 
	{
 Qspider1 q=new Qspider1(); 

	 q.branch();

	 System.out.println();
	 System.out.println("there are 2 trainings");

	 q.student();
	 System.out.println();
  System.out.println("there are 4 branches in bengalure");
System.out.println(q.branch1);
System.out.println(q.branch2);

		System.out.println(q.branch3);
		System.out.println(q.branch4);
		System.out.println();
		System.out.println("there is a fees specified for student");
		System.out.println(q.fees);
		System.out.println(q.fees1);
		

	}
}
