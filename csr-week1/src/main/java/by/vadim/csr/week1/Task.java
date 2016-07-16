package by.vadim.csr.week1;

public class Task {

	private static final String FILENAME = "IntegerArray.txt";
	private IntergerFileReader intergerFileReader;
	private NumberOfInversionsAlgorithm numberOfInversionsAlgorithm;

	public Task(IntergerFileReader intergerFileReader, NumberOfInversionsAlgorithm numberOfInversionsAlgorithm) {
		this.intergerFileReader = intergerFileReader;
		this.numberOfInversionsAlgorithm = numberOfInversionsAlgorithm;
	}

	public static void main(String[] args) throws Exception {

		test(new NumberOfInversionsAlgorithm1());

		test(new NumberOfInversionsAlgorithm2());

	}

	private static void test(NumberOfInversionsAlgorithm numberOfInversionsAlgorithm) {
		Task task2 = new Task(new IntergerFileReader(), numberOfInversionsAlgorithm);

		int[] array = task2.getArray1(FILENAME);

		double length = (double) array.length;
		double length_1 = ((double) (array.length)) - 1;
		long max = (long) (length * length_1 / 2d);
		System.out.println(String.format("The maximum is:\t %s.", max));

		long result = task2.calc(array);

		System.out.println(String.format("The result is:\t %s.", result));
	}

	private long calc(int[] array) {
		return numberOfInversionsAlgorithm.calc(array).getInversionsCount();
	}

	private int[] getArray1(String fileName) {
		return intergerFileReader.read(fileName);
	}

	private int[] getArray2(String fileName) {
		return new int[] { 1, 3, 5, 2, 4, 6 };
	}

	private int[] getArray3(String fileName) {
		// return new int[] { 2, 1, 4, 3, 6, 5, 8, 7, 10, 9 };
		return new int[] { 54044, 14108, 79294, 29649, 25260, 60660, 2995, 53777, 49689, 9083, 16122, 90436, 4615,
				40660, 25675, 58943, 92904, 9900, 95588, 46120, 29390, 91323, 85363, 45738, 80717, 57415, 7637, 8540,
				6336, 45434, 65895, 61811, 8959, 9139, 31027, 87662, 2484, 65550, 23260, 15616, 3490, 49568, 5979,
				44737, 52808, 72122, 37957, 34826, 21419, 73531, 94323, 52910, 84496, 71799, 50162, 1692, 1565, 59279,
				56864, 20141, 13893, 63942, 6055, 33424, 44771, 25678, 33639, 27793, 41268, 1857, 63388, 32976, 46195,
				61291, 61740, 61680, 45264, 76361, 49243, 73250, 67432, 29124, 15198, 30626, 18950, 13857, 32569, 45179,
				47696, 21283, 77169, 26357, 97885, 54741, 57246, 61929, 25997, 45859, 3353, 32204, 97451, 60550, 49516,
				38558, 57674, 36443, 666, 32486, 54910, 24666, 45119, 40779, 3441, 83779, 60645, 63003, 59616, 7364,
				69058, 41651, 12201, 13234, 19717, 11536, 70350, 15611, 74484, 96153, 4127, 60035, 19418, 58613, 28590,
				32917, 97780, 17644, 15836, 88046, 26489, 38410, 54618, 16967, 81604, 60064, 5833, 80689, 43137, 57274,
				8002, 4445, 42933, 75378, 15130, 10689, 98579, 42780, 38379, 76394, 66337, 15126, 59535, 53639, 43182,
				88220, 5506, 21939, 26719, 32919, 78383, 62297, 30677, 15301, 35277, 2240, 37292, 11269, 92554, 12813,
				63131, 25964, 15618, 11318, 72799, 43976, 4698, 32984, 5 };
	}

}
