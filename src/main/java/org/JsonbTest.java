/**
 *
 */
package org;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbException;

/**
 * @author k_sya
 *
 */
public class JsonbTest {

	/**
	 *
	 */
	public JsonbTest() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create Jsonb and serialize
		Jsonb jsonb = JsonbBuilder.create();

		ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();

		InputStream is = classLoader.getResourceAsStream("test.json");

		Type hashMapType = new HashMap<String, Object>() {
		}.getClass().getGenericSuperclass();

		try {
			Map<String, Object> jsonMap = jsonb.fromJson(is, hashMapType);

			System.out.println("Map-->:" + jsonMap);
		} catch (JsonbException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
