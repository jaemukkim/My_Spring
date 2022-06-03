package polymorphism_2_3_3;

public class BeanFactory {
	public Object getBean (String beanName) {
		
		//객체를 생성하는 클래스
		//Bean <== 객체를 뜻함.
		
		
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		}
		if (beanName.equals("lg")) {
			return new LgTV();
		}
		if (beanName.equals("sk")) {
			return new SkTV();
		}
		
		
		
		return null;
	}

}
