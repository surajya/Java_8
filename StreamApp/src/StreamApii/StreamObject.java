package StreamApii;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Empty method
		Stream<Object> stream1 = Stream.empty();
		
		//2. Of method
		Stream<String> stream2 = Stream.of("suraj","honey","sodi","deep");
		stream2.forEach(e->System.out.println(e));
		
		//3.Builder method
		Stream<Object> stream3 = Stream.builder().build();
		
		//4.Arrays method
		IntStream stream = Arrays.stream(new int[] {23,343,12,43});
		stream.forEach(e->System.out.println(e));
	}

}
