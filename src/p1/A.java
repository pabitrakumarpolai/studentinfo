package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(20, 30, 15, 16, 40, 3);
		List<Integer> evenNum = num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("evenNumber" + evenNum);

		List<Integer> number = Arrays.asList(20, 30, 15, 16, 40, 3);
		List<Integer> oddNum = number.stream().filter(y -> y % 2 != 0).collect(Collectors.toList());
		System.out.println("odd Number" + oddNum);

		List<Integer> remove = Arrays.asList(2, 3, 3, 5, 2, 5, 3, 6);
		List<Integer> re = remove.stream().distinct().collect(Collectors.toList());
		System.out.println("after remove:" + re);
		
		List<Integer> sort=Arrays.asList(2,2,4,4,6,6,3);
		List<Integer> afterSort = sort.stream().sorted().collect(Collectors.toList());
		System.out.println("afterSort"+afterSort);

		List<String> name = Arrays.asList("mike", "mithun", "mike", "pabitra");
		List<String> newName = name.stream().filter(n -> n.startsWith("m")).collect(Collectors.toList());
		System.out.println("thisAretheNameStrateWith'm':"+newName);

		List<String> name1 = Arrays.asList("mike", "mithun", "mike", "pabitra");
		List<String> toUpper = name1.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println("toUperCase"+toUpper);
		
		List<String> name2=Arrays.asList("MIKE","MIKE","PABITRA");
		List<String> toLower = name2.stream().map(n->n.toLowerCase()).collect(Collectors.toList());
		System.out.println("toLowerCaase"+toLower);
		
		List<String> name3=Arrays.asList("mike", "mithun", "mike", "pabitra");
		List<String> occurance=name3.stream().filter(n->n.equalsIgnoreCase("mike")).collect(Collectors.toList());
		System.out.println(occurance);
		
		List<String> ex4=Arrays.asList("mike", "mithun", "mike", "pabitra");
		List<String> collect = ex4.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> asList = Arrays.asList("opq","xyz","asc","bdg");
		List<String> collect2 = asList.stream().sorted().collect(Collectors.toList());
		System.out.println(collect2);
		
		
	}
}
