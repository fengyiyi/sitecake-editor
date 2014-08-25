package com.sitecake.contentmanager.client.item;

import com.google.gwt.dom.client.Element;

public interface ContentItemFactoryRegistry {
	public void registerFactory(ContentItemFactory factory);
	public ContentItemFactory getFactory(Element element);
}
