package TeaseApartInheritance.after;

import java.io.IOException;

public abstract class CSVPrinter {
	protected final CSVReader _csvReader;

	protected CSVPrinter(CSVReader csvReader) {
		_csvReader = csvReader;
	}

	public abstract void print() throws IOException;
}