class Student1 
{
	static String usn="1sb12ee007";
	int rollno;
	String name;
	String college;

	Student1(String a,int r,String b)
	{
	rollno=r;
	name=a;
	college=b;
	}
	void study()
	{
    System.out.println("students are learning");
	System.out.println("students are writting");
	}
	void learn()
	{
		System.out.println("students are reading");
		System.out.println("students learning new topics daily");
	}
}
class Studying
{
	
	public static void main(String[] args) 
	{
		Student1 s=new Student1("Padma",001,"Sairam college of engg");

		System.out.println(s.rollno+"   "+s.name+"  "+s.college+"  "+Student1.usn);
	}
}
