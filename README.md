# Exception

예외 처리에 대한 이해

```java
int[] array = new int[6];
int i, a;

try(try with 절){
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
```
