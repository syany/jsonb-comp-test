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
public class JsonGrammerCompLiteral extends JsonCompBase {

	/**
	 * コンストラクタ。<br>
	 */
	public JsonGrammerCompLiteral() {
	}


	@Test
	public void テスト4_01_文法チェック_リテラル() {
		this.compFrom("literal_grammer1.json");
	}
	@Test
	public void テスト4_02_文法チェック_リテラル() {
		this.compFrom("literal_grammer2.json");
	}
	@Test
	public void テスト4_03_文法チェック_リテラル() {
		this.compFrom("literal_grammer3.json");
	}
	@Test
	public void テスト4_04_文法チェック_リテラル() {
		this.compFrom("literal_grammer4.json");
	}
	@Test
	public void テスト4_05_文法チェック_リテラル() {
		this.compFrom("literal_grammer5.json");
	}
	@Test
	public void テスト4_06_文法チェック_リテラル() {
		this.compFrom("literal_grammer6.json");
	}
	@Test
	public void テスト4_07_文法チェック_リテラル() {
		this.compFrom("literal_grammer7.json");
	}
}
