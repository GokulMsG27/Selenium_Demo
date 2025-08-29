package TestNGClasses;



import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityTestNG {
  @Test(priority =1)
  public void A() {
	  throw new SkipException("Not need to run");
  }
  
  @Test(priority =-2)
  public void B() {
	  System.out.println("B");
  }
  
  @Test(priority =0)
  public void C() {
	  System.out.println("C");
  }
  
  @Test(priority ='A')
  public void D() {
	  System.out.println("D");
  }
  
  @Test(enabled = false)
  public void E() {
	  System.out.println("E");
  }
}
