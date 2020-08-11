package RemoveControlFlag.FindIntAfter;

// return を使う場合
public class FindInt2 {
	public static boolean find(int[] data, int target) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return true;
			}
		}
		return false;
	}
}