
public class Perform1 {

	public static void main(String[] args) {

		TopLevel();

	}

	private static void TopLevel() {
		System.out.println("In TopLevel. Starting to run program");
		OneLevelDown();
		System.out.println("Back in TopLevel.");
	}

	private static void OneLevelDown() {
		System.out.println(">>>> Now in OneLevelDown");
		TwoLevelsDown();
		System.out.println(">>>> Back in OneLevelDown");
	}

	private static void TwoLevelsDown() {
		System.out.println(">>>>>>>> Now in TwoLevelsDown.");
		ThreeLevelsDown();
		System.out.println(">>>>>>>> Back in TwoLevelsDown.");
	}

	private static void ThreeLevelsDown() {
		System.out.println(">>>>>>>>>>>> Now in ThreeLevelsDown");

	}
}
