package com.sitecake.contentmanager.client.item;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.dom.client.Element;

public class ContentItemFactoryRegistryImpl implements
		ContentItemFactoryRegistry {

	private List<ContentItemFactory> factories;
	
	public ContentItemFactoryRegistryImpl() {
		factories = new ArrayList<ContentItemFactory>();
	}

	@Override
	public void registerFactory(ContentItemFactory factory) {
		factories.add(factory);
	}

	@Override
	public ContentItemFactory getFactory(Element element) {
		ContentItemFactory factory = null;
		
		for ( ContentItemFactory aFactory : factories ) {
			if ( aFactory.isFor(element) ) {
				factory = aFactory;
				break;
			}
		}
		
		return factory;
	}
	
	

}
