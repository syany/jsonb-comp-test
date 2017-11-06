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
 * $Id: JsonCompBase.java$
 */
package org;

import java.io.InputStream;

import org.junit.Before;

/**
 * 。<br>
 *
 * @since 2017/10/31
 * @author
 */
public class JsonCompBase {

	JSON jsonb;
	JSON jsonic;
	JSON gson;
	JSON jackson;
	ClassLoader classLoader;

	@Before
	public void setUp() {
		jsonb = new Jsonb();
		jsonic = new Jsonic();
		gson = new GsonImpl();
		jackson = new Jackson();
		classLoader = Thread.currentThread()
				.getContextClassLoader();
	}

	protected void compFrom(final String jsonFile) {
		StackTraceElement[] ste = new Throwable().getStackTrace();
		System.out.println("# ============================================================");
		System.out.println("[] " + ste[1].getMethodName() + " ( " + jsonFile + " ) [START]");
		System.out.println("* Jackson ----------------------------------------------------");
		try (InputStream is = classLoader.getResourceAsStream(jsonFile)) {
			Object o = this.jackson.fromJsonMap(is);
			TypeAnalyzer.typeCheck(o);
		} catch (Exception e) {
			System.err.println("jack: " + e.getLocalizedMessage());
		}
		System.out.println();
		System.out.println("* Jsonic ----------------------------------------------------");
		try (InputStream is = classLoader.getResourceAsStream(jsonFile)) {
			Object o = this.jsonic.fromJsonMap(is);
			TypeAnalyzer.typeCheck(o);
		} catch (Exception e) {
			System.err.println("jsonic: " + e.getLocalizedMessage());
		}
		System.out.println();
		System.out.println("* Gson ----------------------------------------------------");
		try (InputStream is = classLoader.getResourceAsStream(jsonFile)) {
			Object o = this.gson.fromJsonMap(is);
			TypeAnalyzer.typeCheck(o);
		} catch (Exception e) {
			System.err.println("gson: " + e.getLocalizedMessage());
		}
		System.out.println();
		System.out.println("* JSON-B ----------------------------------------------------");
		try (InputStream is = classLoader.getResourceAsStream(jsonFile)) {
			Object o = this.jsonb.fromJsonMap(is);
			TypeAnalyzer.typeCheck(o);
		} catch (Exception e) {
			System.err.println("jsonb: " + e.getLocalizedMessage());
		}
		System.out.println("[] " + ste[1].getMethodName() + " ( " + jsonFile + " ) [END]");
	}

}
