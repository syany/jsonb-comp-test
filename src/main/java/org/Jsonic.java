/*
 * Copyright 2013-2017/10/25 the Uranoplums Foundation and the Others.
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
 * $Id: Jsonic.java$
 */
package org;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import net.arnx.jsonic.JSONException;

/**
 * 。<br>
 *
 * @since 2017/10/25
 * @author
 */
public class Jsonic extends AbsJson {


	/**
	 * コンストラクタ。<br>
	 */
	public Jsonic() {
	}

	/* (非 Javadoc)
	 * @see org.JSON#fromJsonMap(java.io.InputStream)
	 */
	@Override
	public Map<String, Object> fromJsonMap(InputStream is) {
		Map<String, Object> res = new HashMap<>();
		try {
			res = net.arnx.jsonic.JSON.decode(is,HASH_MAP_TYPE );
		} catch (JSONException | IOException e) {
			e.printStackTrace();
		}
		return res;
	}

	/* (非 Javadoc)
	 * @see org.JSON#toJsonMap(java.util.Map)
	 */
	@Override
	public String toJsonMap(Map<String, Object> map) {
		String res = "";
		res = net.arnx.jsonic.JSON.encode(map);
		return res;
	}

}
