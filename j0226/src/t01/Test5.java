package t01;

public class Test5 {
	public static void main(String[] args) {
		int su = 30;
		System.out.printf("숫자 : %d\n", su);
		
		int su2 = 50-3;
		int su3 = su+su2;
		int su4, su5, su6; // 사용하지 않는 변수는 선언하지 않는것이 좋다.
		su4 = 10;
		su5 = 20;
		su6 = 30;
		System.out.println("su3 : " + su3 + ", su4 : " + su4);
		
		System.out.println(su3);
		
		int $su8 = 200, _su9 = 300;
		System.out.println("$su8 : " + $su8+_su9);
		
		int sum = $su8+_su9+su3;
		System.out.println(sum);
		
		int su10, su11; // 사용하지 않는 변수는 선언하지 않는것이 좋다.
		su10 = 50;
		// su11 = 60;
		//su10 = su10 + su11; // 초기화 되지 않은 변수는 사용할 수 없다.
		System.out.println("su10 : " + su10);
		
	}
}
