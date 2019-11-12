package testDemo;

import java.awt.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		test();
	}

	public static void test() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		demoDto aDemoDto = new demoDto();
		Class<? extends demoDto> class1  = aDemoDto.getClass();
		System.out.println(class1);
		List aaaList = new List();
		aaaList.add("1");
		aaaList.add("2");
		aaaList.add("3");
		aaaList.add("4");
		aaaList.add("5");
		for(int i = 1; i<6 ; i++) {
			Method method = class1.getMethod("setYuanQ"+i);
			System.out.println(method);
			method.invoke(aDemoDto);
		}	
	}
}