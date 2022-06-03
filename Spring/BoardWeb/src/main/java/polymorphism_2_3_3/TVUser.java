package polymorphism_2_3_3;

public class TVUser {

	public static void main(String[] args) {
		//TVUser Ŭ�������� ��ü�� �������� �ʰ� �ܺ� Ŭ�������� ��ü�� ������ ������ ��ü�� ������ �´�.
			//���յ��� ���ߴ� ���, ���� ������ ���� ���� ���ش�.
		
		/* ���յ��� ���ߴ� ��� - 
		     1. �������̽��� �̿��ϴ� ���
		     2. ������ ������ Factory ������ �����ϴ� ���
		        - ��ü�� �����ϴ� Ŭ���� (BeanFactory) <== ��ü�� ����,����
		          
		 */
		
		BeanFactory factory = new BeanFactory();
		
		TV tv = (TV) factory.getBean(args[0]);	//������ ��ü�� TV Ÿ������ ��ĳ����
		
		tv.powerOn();		//TV�� �޼ҵ� ȣ�� ==> ������ ��ü�� �޼ҵ带 ȣ��
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
		
	}

}
