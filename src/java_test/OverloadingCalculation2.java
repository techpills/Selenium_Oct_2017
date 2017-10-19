package java_test;


class OverloadingCalculation2

{  
	int height = 2;
	void info() 
	{
		int height = 10;
	      System.out.println("House is " + height    + " feet tall");
	      System.out.println("House is " + this.height    + " feet tall");
	  }
	   void info(String s) 
	   {
	      System.out.println(s + ": House is "   + height + " feet tall");
	   }
	  
	  public static void main(String args[]){  
	  OverloadingCalculation2 obj=new OverloadingCalculation2();  
	  obj.info();
	  obj.info("Sindhu");//now int arg sum() method gets invoked  
	  }  	
	}  