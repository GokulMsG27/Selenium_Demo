package TestNGClasses;

import org.testng.annotations.Test;

public class GroupTestNG {
  @Test(groups= {"smoke"})
  public void f1() {
	  System.out.println("f1");
  }
  
	  @Test(groups= {"sanity"})
	  public void f2() {
		  System.out.println("f2");
	  }
	  
	 
		  @Test(groups= {"smoke"})
		  public void f3() {
			  System.out.println("f3");
		  }
		  
		  
			  @Test(groups= {"sanity"})
			  public void f4() {
				  System.out.println("f4");
			  }
			  
			 
				  @Test(groups= {"smoke"})
				  public void f5() {
					  System.out.println("f5");
				  }
				  
				 
					  @Test(groups= {"sanity"})
					  public void f6() {
						  System.out.println("f6");
					  }
					  
		
						  @Test(groups= {"smoke"})
						  public void f7() {
							  System.out.println("f7");
						  }
}
