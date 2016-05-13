package com.jibi;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

public class HttpFetcher {

	public String fetchAsString(String url) throws ClientProtocolException, IOException {
		return Request.Get(url).execute().returnContent().asString();
	}
}