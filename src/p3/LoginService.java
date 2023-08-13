package p3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoginService {
	public static void main(String[] args) {
//		Login login1=new Login();
//		login1.setUserName("mike");
//		login1.setPassword("root");
//		
//		Login login2=new Login();
//		login2.setUserName("pk");
//		login2.setPassword("test");
		
//		List<Login> loginList = Arrays.asList(login1,login2);
//		List<LoginDto> dtos  = loginList.stream().map(n->mapToDto(n)).collect(Collectors.toList());
//		System.out.println(dtos);	
		
		LoginDto dto1=new LoginDto();
		dto1.setUserName("pabitra");
		dto1.setPassword("root");
		
		LoginDto dto2=new LoginDto();
		dto2.setUserName("pabitra");
		dto2.setPassword("root");
		
		List<LoginDto> dtoObject = Arrays.asList(dto1,dto2);
		List<Login> collect = dtoObject.stream().map(n->mapToEntity(n)).collect(Collectors.toList());
		System.out.println(collect);
		
	}
	static LoginDto mapToDto(Login login) {
		LoginDto dto=new LoginDto();
		dto.setUserName(login.getUserName());
		dto.setPassword(login.getPassword());
		return dto;
	}
	static Login mapToEntity(LoginDto dto) {
		Login l=new Login();
		l.setUserName(dto.getUserName());
		l.setPassword(dto.getPassword());
		return l;
	}

}
