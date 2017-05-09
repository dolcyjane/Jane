import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test(timeout=2)
	public void test() {
		BankAccount a=new BankAccount(56,"Dolcy",10000);
		int b=a.withdraw(500);
		assertEquals(9500,b);
		
	}

}
