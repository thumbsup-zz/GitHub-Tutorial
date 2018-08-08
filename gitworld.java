public class gitworld
{
	
	public gitworld()
	{
		String l_msg = "Hello Git world");
		
		for (int i = 0;i<5;i++)
			printMsg(l_msg);
	}

	private void printMsg(String p_msg)
	{
		System.out.println(p_msg);
	}
	
	
	public static void main(String[] args)
	{
		gitworld g1 = new gitworld();

	}
}