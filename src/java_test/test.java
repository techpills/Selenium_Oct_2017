package java_test;

public class test {
	
	int i = 20;
	
	void checki()
	
	{
		int i = 10;
		System.out.println(i);
		System.out.println(this.i);
	}
	
	public static void main(String args[])
	
	{
		test jt = new test();
		System.out.println("Hi viknesh!");
		jt.checki();
	}

}
