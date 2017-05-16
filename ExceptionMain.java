package com.nadan.java.exception;

public class ExceptionMain {
	
	public static void main(String args[]){
		//try문 또한 하나의 블럭이기 때문에 그 안에서 이거 쓰면 밖에서 못 쓴다
		int[] array = new int[6];
		int i, a;
		
		try{
			array[5] = 10;
			array[6] = 11;  //ArrayIndexOutOfBoundsException
			i = 1/0;  //ArithmeticException
			String s = "a"; //NumberFormatException
			a = Integer.parseInt(s);
			System.out.println("시스템이 완료되었습니다");
			//e는 예외의 이름, 변수, 시스템에서 던져주는 ArrayIndexOutOfBoundsException 타입의 변수.
			//ArrayIndexOutOfBoundsException 객체에 예외 클래스의 모든 것이 정의되어 있다.
			
		} catch(ArrayIndexOutOfBoundsException e){ //배열수를 벗어난 예외
			e.printStackTrace();
		} catch(ArithmeticException e){ //정수를 0으로 나눈 예외
			e.printStackTrace();
		} catch(NumberFormatException e){ //문자를 숫자로 바꾸는 예외
			e.printStackTrace();
		} finally { //오류가 나더라도 반드시 finally에서는 결과값을 리턴한다.
			System.out.println(array[5]);
		}
		
		//try-catch의 좋은점은 이렇게 오류가 생겨도 앱이 다운되지 않고 계속 실행된다는 것이다
		//극단적으로는 안드로이드를 만들 때 모든 메소드를 감쌀 수 있다. 왜냐하면 어디서 예외가 생길지 모르기 때문이다.

		System.out.println("시스템이 완료되었습니다");
		
		
	}

}
