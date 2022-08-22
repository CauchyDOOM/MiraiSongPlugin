/**
 * Mirai Song Plugin
 * Copyright (C) 2021  khjxiaogu
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.khjxiaogu.MiraiSongPlugin.musicsource;

import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.khjxiaogu.MiraiSongPlugin.MusicInfo;
import com.khjxiaogu.MiraiSongPlugin.MusicSource;
import com.khjxiaogu.MiraiSongPlugin.Utils;

public class KugouMusicSource implements MusicSource {

	@Override
	public MusicInfo get(String keyword) throws Exception {
		keyword=Utils.urlEncode(keyword);
		return new MusicInfo("audio_name", "author_name", "https://q1.qlogo.cn/g?b=qq&nk=2425845116&s=3", "http://233366.proxy.nscc-gz.cn:8888/?speaker=%E5%85%AB%E9%87%8D%E7%A5%9E%E5%AD%90&text=" + keyword, "https://q1.qlogo.cn/g?b=qq&nk=2425845116&s=3", "Genshin","",205141);
	}

}
