package RemoveControlFlag.SimpleDatabaseAfter;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		try {
			SimpleDatabase db = new SimpleDatabase(new FileReader(
					"src/RemoveControlFlag/SimpleDatabaseAfter/dbfile.txt")
			);
//			SimpleDatabase2 db = new SimpleDatabase2(new FileReader(
//					"src/RemoveControlFlag/SimpleDatabaseAfter/dbfile.txt")
//			);
			Iterator<String> it = db.iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("KEY: \"" + key + "\"");
				System.out.println("VALUE: \"" + db.getValue(key) + "\"");
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}