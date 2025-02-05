//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
		{
		int max = ray.getFirst();
		int min = ray.getFirst();

		for ( int i = 0; i < ray.size(); i++)
		{
			if ( ray.get(i) > max)
			{
				max = ray.get(i);
			}
			if (ray.get(i) < min)
			{
				min = ray.get(i);
			}
		}
		return (max+min)/2.0;
	}
}
}
