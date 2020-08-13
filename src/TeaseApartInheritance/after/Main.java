package TeaseApartInheritance.after;

import java.io.IOException;

public class Main {
	private static final String SAMPLE_CSV_STRING = "おはよう,Good morning.\n"
			+ "こんにちは,Hello.\n"
			+ "こんばんは,Good evening.\n"
			+ "おやすみ,Good night.\n";

	private static final String SAMPLE_CSV_FILE = "src/TeaseApartInheritance/after/file.csv";

	public static void main(String[] args) throws IOException {
		new CSVTablePrinter(new CSVStringReader(SAMPLE_CSV_STRING)).print();
		new CSVTreePrinter(new CSVFileReader(SAMPLE_CSV_FILE)).print();
	}
}