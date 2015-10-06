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
package com.microsoft.sampleservice;





/**
 * The type Item A.
*/
public class ItemA extends Item {

    public ItemA(){
        setODataType("#Microsoft.SampleService.ItemA");
    }
            
    private String PropertyA;
     
    /**
    * Gets the Property A.
    *
    * @return the String
    */
    public String getPropertyA() {
        return this.PropertyA; 
    }

    /**
    * Sets the Property A.
    *
    * @param value the String
    */
    public void setPropertyA(String value) { 
        this.PropertyA = value; 
        valueChanged("PropertyA", value);

    }
}

