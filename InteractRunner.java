import java.util.Scanner;

public class InteractRunner
{
	public static void main (String[] arg)
	{
		Scanner reader = new Scanner(System.in);
		try
		{
			Calculate calc=new Calculate();
			String exit = "no";
			while (!exit.equals("yes"))
			{
				System.out.println("enter first arg: ");
				String first=reader.next();
				System.out.println("enter second arg: ");
				String second=reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("result "+ calc.getResult());
				//calc.clearResult();
				System.out.println("exit: yes/no ");
				exit=reader.next();
		
			}
		}
		finally 
		{
			reader.close();
		}

	} 
}