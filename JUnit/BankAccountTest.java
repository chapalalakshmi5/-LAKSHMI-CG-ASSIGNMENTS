package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		BankAccount bc=new BankAccount();
		
		Exception exception = assertThrows(InsufficientFundsException.class, () -> { bc.withdraw(1000,2000);});
	                          assertThrows(InsufficientFundsException.class, () -> { bc.withdraw(0,2000);});
		
		
		
	}

}
