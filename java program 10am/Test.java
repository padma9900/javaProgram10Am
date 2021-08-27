
//wap for variable shadowing 

class Test 
{
	int a=10; // global varible
	void m1()    // its a non static 
	{
		int a=20; //local varible

		System.out.println(this.a); // without static context
		System.out.println(a);

	}
}
