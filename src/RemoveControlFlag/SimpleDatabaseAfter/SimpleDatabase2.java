package RemoveControlFlag.SimpleDatabaseAfter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 正規表現を使う場合
public class SimpleDatabase2 {
	private Map<String, String> _map = new HashMap<String, String>();
	private static Pattern _pattern = Pattern.compile("([^=]+)=(.*)");

	public SimpleDatabase2(Reader r) throws IOException {
		BufferedReader reader = new BufferedReader(r);
		while (true) {
			String line = reader.readLine();
			if (line == null) {
				break;
			}
			Matcher matcher = _pattern.matcher(line);
			if (matcher.matches()) {
				String key = matcher.group(1);
				String value = matcher.group(2);
				_map.put(key, value);
			}
		}
	}

	public void putValue(String key, String value) {
		_map.put(key, value);
	}

	public String getValue(String key) {
		return _map.get(key);
	}

	public Iterator<String> iterator() {
		return _map.keySet().iterator();
	}
}