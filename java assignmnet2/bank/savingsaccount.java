
public class savingsaccount extends bank {
	int depositamnt;
	public savingsaccount(String name,int amount,int depositamnt)
	{
		super(name,amount);
		this.depositamnt=depositamnt;
	}
	int getfixeddeposit()
	{
		return(super.getfixeddeposit()+depositamnt);
	}

}
