package TeaseApartInheritance.before;

import java.io.IOException;

public class Main {
	private static final String SAMPLE_CSV_STRING = "おはよう,Good morning.\n"
			+ "こんにちは,Hello.\n"
			+ "こんばんは,Good evening.\n"
			+ "おやすみ,Good night.\n";

	private static final String SAMPLE_CSV_FILE = "src/TeaseApartInheritance/before/file.csv";

	public static void main(String[] args) throws IOException {
		new CSVStringTablePrinter(SAMPLE_CSV_STRING).print();
		new CSVFileTreePrinter(SAMPLE_CSV_FILE).print();
	}
}