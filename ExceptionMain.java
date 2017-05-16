package com.nadan.java.exception;

public class ExceptionMain {
	
	public static void main(String args[]){
		//try�� ���� �ϳ��� ���̱� ������ �� �ȿ��� �̰� ���� �ۿ��� �� ����
		int[] array = new int[6];
		int i, a;
		
		try{
			array[5] = 10;
			array[6] = 11;  //ArrayIndexOutOfBoundsException
			i = 1/0;  //ArithmeticException
			String s = "a"; //NumberFormatException
			a = Integer.parseInt(s);
			System.out.println("�ý����� �Ϸ�Ǿ����ϴ�");
			//e�� ������ �̸�, ����, �ý��ۿ��� �����ִ� ArrayIndexOutOfBoundsException Ÿ���� ����.
			//ArrayIndexOutOfBoundsException ��ü�� ���� Ŭ������ ��� ���� ���ǵǾ� �ִ�.
			
		} catch(ArrayIndexOutOfBoundsException e){ //�迭���� ��� ����
			e.printStackTrace();
		} catch(ArithmeticException e){ //������ 0���� ���� ����
			e.printStackTrace();
		} catch(NumberFormatException e){ //���ڸ� ���ڷ� �ٲٴ� ����
			e.printStackTrace();
		} finally { //������ ������ �ݵ�� finally������ ������� �����Ѵ�.
			System.out.println(array[5]);
		}
		
		//try-catch�� �������� �̷��� ������ ���ܵ� ���� �ٿ���� �ʰ� ��� ����ȴٴ� ���̴�
		//�ش������δ� �ȵ���̵带 ���� �� ��� �޼ҵ带 ���� �� �ִ�. �ֳ��ϸ� ��� ���ܰ� ������ �𸣱� �����̴�.

		System.out.println("�ý����� �Ϸ�Ǿ����ϴ�");
		
		
	}

}
