/*
 * Copyright 2013-2017/10/24 the Uranoplums Foundation and the Others.
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
 * $Id: JsonComp.java$
 */
package org;

import org.junit.Test;

/**
 * 。<br>
 *
 * @since 2017/10/24
 * @author
 */
public class JsonBaseValue extends JsonCompBase {

	@Test
	public void テスト1_01_パースされる型チェック() {
		this.compFrom("parsed_type_check.json");
	}

	@Test
	public void テスト1_02_キー重複時の登録チェック() {
		this.compFrom("parsed_depl_key_check.json");
	}

	@Test
	public void テスト2_01_文法チェック_1つの値() {
		this.compFrom("string_parse1.json");
	}

	@Test
	public void テスト2_02_文法チェック_1つの値() {
		this.compFrom("number_parse1.json");
	}
	@Test
	public void テスト2_03_文法チェック_1つの値() {
		this.compFrom("literal_parse1.json");
	}
	@Test
	public void テスト2_04_文法チェック_1つの値() {
		this.compFrom("literal_parse2.json");
	}
	@Test
	public void テスト2_05_文法チェック_1つの値() {
		this.compFrom("literal_parse3.json");
	}
	@Test
	public void テスト2_06_文法チェック_1つの値() {
		this.compFrom("array_parse1.json");
	}
	@Test
	public void テスト2_07_文法チェック_1つの値() {
		this.compFrom("object_parse1.json");
	}
	@Test
	public void テスト2_08_文法チェック_1つの値() {
		this.compFrom("blank_parse1.json");
	}
}
