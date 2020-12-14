public class EmpWageBuilder
{
	public static void main(String args[])
	{
		System.out.println("WELCOME TO EMP WAGE COMPUTATION PROGRAM");

		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;

		if (empCheck == IS_FULL_TIME)
			System.out.println("Emp is present");
		else
			System.out.println("Emp is absent");
	}
}
