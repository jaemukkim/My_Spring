package polymorphism_4_1_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//TVUser 클래스에서 객체를 생성하지 않고 외부 클래스에서 객체를 생성후 생성된 객체를 가지고 온다.
			//결합도를 낮추는 방법, 유지 보수를 아주 쉽게 해준다.
		
		/* 결합도를 낮추는 방법 - 
		     1. 인터페이스를 이용하는 방법
		     2. 디자인 패턴중 Factory 패턴을 적용하는 방법
		        - 객체를 생성하는 클래스 (BeanFactory) <== 객체를 생성,관리
		     3. Spring 프레임워크에서 객체를 생성후 주입하는 방법
		          	- IoC (제어의 역행) : 객체 (개발자) ==> 객체 (Spring 프레임워크)
		          	- DI (의존성 주입) : 객체를 자바코드 내부에서 생성하지 않고 Spring 프레임워크에서 
		          						객체를 생성후 객체를 자바코드 내부로 주입 한다.
		 */
		
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//GenericXmlApplicationContext : Bean 설정 파일을 로드함 
		
		
		//스프링 컨테이너에서 객체를 요청
		
		
		TV tv = (TV) factory.getBean("tv");	//가져온 객체를 TV 타입으로 업캐스팅
		
		tv.powerOn();		//TV의 메소드 호출 ==> 생성된 객체의 메소드를 호출
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
	
		
		//스프링 컨테이너로 부터 하나의 객체를 여러번 요청할 수 있다.  :
		System.out.println("==============================");
	
		TV tv10 = (TV) factory.getBean("tv");
		TV tv11 = (TV) factory.getBean("tv");
		TV tv12 = (TV) factory.getBean("tv");
		TV tv13 = (TV) factory.getBean("tv");
		
		System.out.println(tv10);
		System.out.println(tv11);
		System.out.println(tv12);
		System.out.println(tv13);
		
		factory.close(); 	//메모리에서 객체 제거
		/*
		System.out.println("======================================");
		//별개의 객체를 생성할 경우 : 메모리의 낭비가 초래됨 / 주소가 다름
			TV tv1 = new SamsungTV();
			TV tv2 = new SamsungTV();
			TV tv3 = new SamsungTV();
			TV tv4 = new SamsungTV();
			
			System.out.println(tv1);
			System.out.println(tv2);
			System.out.println(tv3);
			System.out.println(tv4);
		
		System.out.println("==========================================");
		//주소를 복사해서 사용하면 메모리의 낭비를 줄여 줄 수 있다.
			TV tv5 = new SamsungTV();
			TV tv6 = tv5;			//tv6는 tv5의 주소만 복사함.
			TV tv7 = tv6;
		
		System.out.println(tv5);
		System.out.println(tv6);
		System.out.println(tv7);
		*/
		
	}

}
