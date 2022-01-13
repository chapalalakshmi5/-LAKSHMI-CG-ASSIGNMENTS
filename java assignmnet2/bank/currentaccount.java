
public class currentaccount extends bank {
	int depositedamount;
	public currentaccount(String name,int amount,int depositedamount)
	{
		super(name,amount);
		this.depositedamount=depositedamount;
	}
	int getcashcredit()
	{
		return(super.getcashcredit()+depositedamount);
	}

}
