package polymorphism_2_3_3;

public class BeanFactory {
	public Object getBean (String beanName) {
		
		//��ü�� �����ϴ� Ŭ����
		//Bean <== ��ü�� ����.
		
		
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
