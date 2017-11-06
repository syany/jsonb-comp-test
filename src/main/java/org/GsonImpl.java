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
 * $Id: GsonImpl.java$
 */
package org;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * 。<br>
 *
 * @since 2017/10/24
 * @author
 */
public class GsonImpl extends AbsJson {
	static final Gson GSON = new Gson();

	static final Type MAP_TYPE = new TypeToken<Map<String, Object>>() {}.getType();
	/**
	 * コンストラクタ。<br>
	 */
	public GsonImpl() {
	}

	/* (非 Javadoc)
	 * @see org.JSON#fromJsonMap(java.io.InputStream)
	 */
	@Override
	public Map<String, Object> fromJsonMap(InputStream is) {

		InputStreamReader isr = new InputStreamReader(is, Charset.forName("UTF-8"));
		return GSON.fromJson(isr, MAP_TYPE);
	}

	/* (非 Javadoc)
	 * @see org.JSON#toJsonMap(java.util.Map)
	 */
	@Override
	public String toJsonMap(Map<String, Object> map) {
		return GSON.toJson(map, MAP_TYPE);
	}

}
