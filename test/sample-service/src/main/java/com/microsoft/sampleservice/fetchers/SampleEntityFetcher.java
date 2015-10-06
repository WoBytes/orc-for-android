/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.sampleservice.fetchers;

import com.microsoft.sampleservice.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;

/**
 * The type  SampleEntity
 */
public class SampleEntityFetcher extends OrcEntityFetcher<SampleEntity,SampleEntityOperations> 
                                     implements Readable<SampleEntity> {

     /**
     * Instantiates a new SampleEntityFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public SampleEntityFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, SampleEntity.class, SampleEntityOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public SampleEntityFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }
	
	/**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public SampleEntityFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
	/**
     * Gets content.
     *
     * @return the content
     */
    public OrcODataStreamFetcher getContent() {
		return new OrcODataStreamFetcher("content", this, getResolver());
    }

	
         /**
     * Gets nestedsampleentity.
     *
     * @return the nested sample entity
     */
    public SampleEntityFetcher getNestedSampleEntity() {
        return new SampleEntityFetcher("nestedSampleEntity", this);
    }

     /**
     * Gets navigations.
     *
     * @return the navigations
     */
    public OrcCollectionFetcher<AnotherEntity, AnotherEntityFetcher, AnotherEntityCollectionOperations> getNavigations() {
        return new OrcCollectionFetcher<AnotherEntity, AnotherEntityFetcher, AnotherEntityCollectionOperations>("Navigations", this, AnotherEntity.class, AnotherEntityCollectionOperations.class);
    }

    /**
     * Gets navigation.
     *
     * @return the navigation
     */
    public AnotherEntityFetcher getNavigation(String id){
         return new OrcCollectionFetcher<AnotherEntity, AnotherEntityFetcher, AnotherEntityCollectionOperations>("Navigations", this, AnotherEntity.class, AnotherEntityCollectionOperations.class).getById(id);
    }

     /**
     * Gets items.
     *
     * @return the items
     */
    public OrcCollectionFetcher<Item, ItemFetcher, ItemCollectionOperations> getItems() {
        return new OrcCollectionFetcher<Item, ItemFetcher, ItemCollectionOperations>("Items", this, Item.class, ItemCollectionOperations.class);
    }

    /**
     * Gets item.
     *
     * @return the item
     */
    public ItemFetcher getItem(String id){
         return new OrcCollectionFetcher<Item, ItemFetcher, ItemCollectionOperations>("Items", this, Item.class, ItemCollectionOperations.class).getById(id);
    }

     /**
     * Gets nested sample entity collection.
     *
     * @return the nested sample entity collection
     */
    public OrcCollectionFetcher<SampleEntity, SampleEntityFetcher, SampleEntityCollectionOperations> getNestedSampleEntityCollection() {
        return new OrcCollectionFetcher<SampleEntity, SampleEntityFetcher, SampleEntityCollectionOperations>("nestedSampleEntityCollection", this, SampleEntity.class, SampleEntityCollectionOperations.class);
    }

    /**
     * Gets nested sample entity collection.
     *
     * @return the nested sample entity collection
     */
    public SampleEntityFetcher getNestedSampleEntityCollection(String id){
         return new OrcCollectionFetcher<SampleEntity, SampleEntityFetcher, SampleEntityCollectionOperations>("nestedSampleEntityCollection", this, SampleEntity.class, SampleEntityCollectionOperations.class).getById(id);
    }

}
