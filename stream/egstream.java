package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class egstream {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList();
		a.add(56);
		a.add(78);
		a.add(12);
		a.add(1);
		a.add(23);
		a.add(21);
		a.add(34);
		a.add(78);
		a.add(56);
		a.add(12);
		
		Comparator<Integer> c = (i1,i2)->{
			if(i1>i2)
				return -1;
			else if(i1<i2)
			return 1;
			else
				return 0;
		};
		
		Predicate<Integer> p = (val)->val%2==0;
	
		
		List<Integer> l = a.stream().filter(p).toList();
		
		
		
		
		Function<Integer,Integer> f = (val)->val*10;
		
		List<Integer> g = a.stream().filter(p).map(f).toList();
//		System.out.println(g);
		
		List<Integer> h = a.stream().sorted(c).distinct().toList();
		System.out.println(h);
		
		Integer min =  a.stream().min(c).get();
		
		System.out.println(min);

		Integer max = a.stream().max(c).get();
		System.out.println(max);
		
		a.forEach(System.out::println);
	
	}


	
}
