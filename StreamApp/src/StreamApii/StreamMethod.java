package StreamApii;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(44,32,234,54,321);
		
		//1.Filter
		List<Integer> collect = list.stream().filter(e->{
			System.out.println("true");
			return true;
		}).collect(Collectors.toList());
		
		System.out.println(collect);
		
		//2.Map
		List<Integer> collect2 = list.stream().map(e->e*2).collect(Collectors.toList());
		System.out.println(collect2);
		
		//3.ForEach method
		list.stream().forEach(System.out::print);
		System.out.println();
		
		//4.sorted method
		list.stream().sorted().forEach(e->System.out.println(e));
		
		//5.min method
		Integer integer = list.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("min value is: "+integer);
		
		//6.max method
		Integer integer2 = list.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("max value is: "+integer2);
	}

}
