package testLab1;

import org.junit.Assert;
import org.junit.Test;
import Lab1.Labcode;

public class testLab1 {
	
	@Test
	public void testD(){
		Labcode lab6=new Labcode();
		String ex="5*4+6*x*y*x*z+x*z*y*z*3";
		lab6.setExp(ex);
		System.out.println(lab6.getExp());
		
		String deri="!d/d x";
		lab6.setCommand(deri);
		
		int tmp=lab6.expression(lab6.getExp());
		int tmp3=lab6.expression(lab6.getCommand());
		
		
		System.out.println(lab6.derivative());
		Assert.assertEquals("12*y*z*x+3*z*y*z",lab6.derivative());
		
		
	}
	
	/*@Test
	public void testE(){
		
		Labcode lab6=new Labcode();
		
		String ex="5*4+6*x*y*x*z+x*z*y*z*3";
		lab6.setExp(ex);
		int tmp1=lab6.expression(lab6.getExp());
		//Assert.assertEquals(1,tmp1);
		
		String sim="!simplify x=1";
		int tmp2=lab6.expression(sim);
		//Assert.assertEquals(2,tmp2);
		
		
		String deri="!d/d x";
		lab6.setCommand(deri);
		int tmp3=lab6.expression(lab6.getCommand());
		//Assert.assertEquals(3, tmp3);
		
		String str4="!ddd/dx y";
		int tmp4=lab6.expression(str4);
		Assert.assertEquals(0, tmp4);

	}*/
}
