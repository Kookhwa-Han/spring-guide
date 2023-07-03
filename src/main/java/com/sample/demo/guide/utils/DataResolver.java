package com.sample.demo.guide.utils;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.layout.template.json.resolver.EventResolver;
import org.apache.logging.log4j.layout.template.json.resolver.TemplateResolverConfig;
import org.apache.logging.log4j.layout.template.json.util.JsonWriter;

public final class DataResolver implements EventResolver {
	private final Object data;

	/**
	 * @param config
	 */
	DataResolver(final TemplateResolverConfig  config){
		final Object obj = config.getObject("data");
		data = obj;
	}

	static String getName(){
		return "data";
	}

	@Override
	public void resolve(final LogEvent value, final JsonWriter jsonWriter) {
		final Object data = this.data;
		jsonWriter.writeValue(data);
	}

}
