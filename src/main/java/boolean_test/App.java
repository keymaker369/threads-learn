package boolean_test;

public class App {

	public static void main(String... args) {

		System.out.println(Boolean.TRUE);
		System.out.println(new Boolean(true));

		System.out.println(Boolean.TRUE == new Boolean(true));
		System.out.println(true == new Boolean(true));
		System.out.println(true == Boolean.TRUE);
		System.out.println(Boolean.TRUE.equals(new Boolean(true)));
	}
}
