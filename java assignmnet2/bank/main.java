
public class main {
	public static void main(String args[])
	{
		savingsaccount sa=new savingsaccount("lakshmi",400000,1);
				System.out.println("the deposited amount is"+sa.depositamnt);
				System.out.println(sa.name+"  total amount of after deposit amount is "+sa.getfixeddeposit());
				currentaccount ca=new currentaccount("bob",8,1000000);
				System.out.println("the deposited amount is"+ca.depositedamount);
				System.out.println(ca.name+"  total amount of after credited amount is"+ca.getcashcredit());
				double totalamount=sa.getfixeddeposit()+ca.getcashcredit();
				System.out.println("the total amount is"+totalamount);
	}

}
