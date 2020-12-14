public class EmpWageBuilder
{
	//Constants
     	public static final int IS_FULL_TIME = 1;
     	public static final int IS_PART_TIME = 2;
       	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String args[])
	{
		System.out.println("WELCOME TO EMP WAGE COMPUTATION PROGRAM");

		//variables
		int empHrs = 0;
		int empWage = 0 ;
		double empCheck = Math.floor(Math.random() * 10) % 3;

		switch((int)empCheck)
		{
			case IS_FULL_TIME:
					empHrs = 8;
			break;
			case IS_PART_TIME:
					empHrs = 4;
			break;
			default:
					empHrs = 0;
			break;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage : "+empWage);
	}
}
