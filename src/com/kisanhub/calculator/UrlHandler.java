package com.kisanhub.calculator;

public interface UrlHandler
{
	void(final Method method, final Map<String, String> headers, final String url, final byte[] body);
}
