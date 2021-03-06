/*
 * @(#)LocalClientRequestDispatcherFactory.java	1.6 05/11/17
 * 
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.corba.se.spi.protocol;

import com.sun.corba.se.spi.ior.IOR ;

public interface LocalClientRequestDispatcherFactory {
    public LocalClientRequestDispatcher create( int id, IOR ior )  ;
}
    
