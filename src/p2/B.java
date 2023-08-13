   package p2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
	public static void main(String[] args) {
		CDto a1= new CDto();
		CDto a2= new CDto();
		CDto a3= new CDto();
		
		List<CDto> object = Arrays.asList(a1,a2,a3);
		System.out.println(object);
		 List<B> bObject = object.stream().map(n->mapToEntity(n)).collect(Collectors.toList());
		 System.out.println(bObject);
	}
	
	static B mapToEntity(CDto b) {
		return new B();
	}
}
