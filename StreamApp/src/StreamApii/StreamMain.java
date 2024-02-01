package StreamApii;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  list= List.of(2,34,3,23,4,88,54,33);
		System.out.println((List<Integer>)list.stream().filter(i->i%2==0).collect(Collectors.toList()));
	
	}

}
