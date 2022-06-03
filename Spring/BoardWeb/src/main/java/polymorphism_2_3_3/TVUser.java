package polymorphism_2_3_3;

public class TVUser {

	public static void main(String[] args) {
		//TVUser 클래스에서 객체를 생성하지 않고 외부 클래스에서 객체를 생성후 생성된 객체를 가지고 온다.
			//결합도를 낮추는 방법, 유지 보수를 아주 쉽게 해준다.
		
		/* 결합도를 낮추는 방법 - 
		     1. 인터페이스를 이용하는 방법
		     2. 디자인 패턴중 Factory 패턴을 적용하는 방법
		        - 객체를 생성하는 클래스 (BeanFactory) <== 객체를 생성,관리
		          
		 */
		
		BeanFactory factory = new BeanFactory();
		
		TV tv = (TV) factory.getBean(args[0]);	//가져온 객체를 TV 타입으로 업캐스팅
		
		tv.powerOn();		//TV의 메소드 호출 ==> 생성된 객체의 메소드를 호출
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
		
	}

}
