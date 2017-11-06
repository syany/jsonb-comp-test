/*
 * Copyright 2013-2017/10/31 the Uranoplums Foundation and the Others.
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
 * $Id: JsonGrammerCompString.java$
 */
package org;

import org.junit.Test;

/**
 * 。<br>
 *
 * @since 2017/10/31
 * @author
 */
public class JsonGrammerCompArrayObj extends JsonCompBase {

	/**
	 * コンストラクタ。<br>
	 */
	public JsonGrammerCompArrayObj() {
	}


	@Test
	public void テスト6_01_解析チェック_配列() {
		this.compFrom("array_parse1.json");
	}
	@Test
	public void テスト6_02_解析チェック_配列() {
		this.compFrom("array_parse2.json");
	}
	@Test
	public void テスト6_03_解析チェック_配列() {
		this.compFrom("array_parse3.json");
	}
	@Test
	public void テスト6_04_解析チェック_配列() {
		this.compFrom("array_parse4.json");
	}
	@Test
	public void テスト6_05_解析チェック_オブジェクト() {
		this.compFrom("object_parse2.json");
	}
	@Test
	public void テスト6_06_解析チェック_オブジェクト() {
		this.compFrom("object_parse3.json");
	}
	@Test
	public void テスト6_07_解析チェック_オブジェクト() {
		this.compFrom("object_parse4.json");
	}
}
