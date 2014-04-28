package util;

public class AlgorithmUtil {

	public static int getFibonachyNumber(int index) {
		int current = 1;
		int result = 1;
		int previous = 1;
		return getFibonachyNumber(index, current, result, previous);
	}

	private static int getFibonachyNumber(int index, int current, int result, int previous) {
		if(current == index) {
			return result;
		} else {
			return getFibonachyNumber(index, ++current, result + previous, result);
		}
	}

}
