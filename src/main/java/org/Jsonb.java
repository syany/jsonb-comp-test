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
 * $Id: Jsonb.java$
 */
package org;

import java.io.InputStream;
import java.util.Map;

import javax.json.bind.JsonbBuilder;

/**
 * 。<br>
 *
 * @since 2017/10/24
 * @author
 */
public class Jsonb extends AbsJson {
	static final javax.json.bind.Jsonb JSONB = JsonbBuilder.create();

	/**
	 * コンストラクタ。<br>
	 */
	public Jsonb() {
	}

	/* (非 Javadoc)
	 * @see org.JSON#fromJsonMap(java.io.InputStream)
	 */
	@Override
	public Map<String, Object> fromJsonMap(InputStream is) {
		return JSONB.fromJson(is, HASH_MAP_TYPE);
	}

	/* (非 Javadoc)
	 * @see org.JSON#toJsonMap(java.util.Map)
	 */
	@Override
	public String toJsonMap(Map<String, Object> map) {
		return JSONB.toJson(map, HASH_MAP_TYPE);
	}

}
