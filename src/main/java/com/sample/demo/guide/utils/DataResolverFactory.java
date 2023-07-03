package com.sample.demo.guide.utils;


import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.layout.template.json.resolver.EventResolverContext;
import org.apache.logging.log4j.layout.template.json.resolver.EventResolverFactory;
import org.apache.logging.log4j.layout.template.json.resolver.TemplateResolverConfig;
import org.apache.logging.log4j.layout.template.json.resolver.TemplateResolverFactory;
/**
 * {@link DataResolver} factory.
 */
@Plugin(name = "DataResolverFactory", category=TemplateResolverFactory.CATEGORY)
public final class DataResolverFactory implements EventResolverFactory{
	private static final DataResolverFactory INSTANCE = new DataResolverFactory();
	
	private DataResolverFactory(){}

	@PluginFactory
	public static DataResolverFactory getInstance(){
		return INSTANCE;
	}

	@Override
	public String getName() {
		return DataResolver.getName();
	}

	@Override
	public DataResolver  create(EventResolverContext context, TemplateResolverConfig config) {
		return new DataResolver(config);
	}
}
