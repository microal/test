//package main;
import java.util.*;
//import Manager.RabitManager;

public class Rabit
{
	public static void main(String[] argvs) 
	{
		
		int rabitNum = 0;
		RabitManager manager = new RabitManager();
		System.out.println("Please Input Day:");
		Scanner in=new Scanner(System.in);
		int day=in.nextInt();		
		rabitNum = manager.rabitCnt(day);
		System.out.println("DAY="+day+";RabitNum is " + rabitNum);
	}
}

/*public*/class RabitCouple 
{
	/*public*/RabitCouple(int brith_day) 
	{
		this.brith_day = brith_day;
	}

	/*public*/ boolean bear(int day) 
	{
		if ((day - brith_day) >= 2)
		return true;
		else
		return false;
	}

private int brith_day;
}



/*public*/ class RabitManager 
{
	/*public*/ RabitManager() 
	{
		init();
	}

	private void init() 
	{
		rabitList = new ArrayList();
		rabitList.add(new RabitCouple(1));
	}

	/*public*/ int rabitCnt(int month) 
	{
		int current_m = 0;
		for (current_m = 1; current_m <= month; current_m++) 
		{
			Iterator it = rabitList.iterator();
			List newRabit = new ArrayList();
			while (it.hasNext()) 
			{
				RabitCouple rabit = (RabitCouple) it.next();
				if (rabit.bear(current_m)) 
				{
					newRabit.add(new RabitCouple(current_m));
				}
			}
			rabitList.addAll(newRabit);
		}

		return rabitList.size();
	}

	List rabitList;
}

