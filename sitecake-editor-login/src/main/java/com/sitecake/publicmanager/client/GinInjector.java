package com.sitecake.publicmanager.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.sitecake.commons.client.util.DomSelector;
import com.sitecake.publicmanager.client.resources.LocaleProxy;

@GinModules(GinModule.class)
public interface GinInjector extends Ginjector {
	public static final GinInjector instance = GWT.create(GinInjector.class);
	
	DomSelector getDomSelector();
	LoginManager getLoginManager();
	TopContainer getTopContainer();
	LocaleProxy getLocaleProxy();
}
