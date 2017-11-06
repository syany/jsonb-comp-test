/*
 * Copyright 2013-2017/10/29 the Uranoplums Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 * $Id: TypeAnalyzer.java$
 */
package org;

import java.util.List;
import java.util.Map;

/**
 * 。<br>
 *
 * @since 2017/10/29
 * @author
 */
public class TypeAnalyzer {

	/**
	 * 未検査キャスト警告回避用。
	 * @param o
	 * @return キャスト後の値
	 */
	protected static List<Object> castToList(Object o) {
		@SuppressWarnings("unchecked")
		List<Object> res = (List<Object>) o;
		return res;
	}
	/**
	 * 未検査キャスト警告回避用。
	 * @param o
	 * @return キャスト後の値
	 */
	protected static Map<String, Object> castToMap(Object o) {
		@SuppressWarnings("unchecked")
		Map<String, Object> res = (Map<String, Object>) o;
		return res;
	}

	public static void typeCheck(Object value) {
		if (List.class.isInstance(value)) {
			typeCheck(castToList(value));
		} else if (Map.class.isInstance(value)) {
			typeCheck(castToMap(value));
		} else {
			if (value == null) {
				System.out.println(" value: " + value + ",");
			} else {
				System.out.println(" value: " + value.toString() + "(" + value.getClass().toString() + "),");
			}
		}
	}

	public static void typeCheck(List<Object> l) {
		System.out.println("$List ("+ l.getClass().toString() +") :[");
		l.forEach((value) -> {
			typeCheck(value);
		});
		System.out.println("]");
	}
	public static void typeCheck(Map<String, Object> m) {
		System.out.println("$Map ("+ m.getClass().toString() +") :{");
		m.forEach((key, value) -> {
			System.out.print("key: " + key.toString() + " --> ");
//			System.out.print("key: " + key.toString() + " ("+ key.getClass().toString()+")");
			typeCheck(value);
		});
		System.out.println("}");
	}
}
