/*
 * @(#)JPEGStreamMetadataFormat.java	1.6 05/11/17
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.imageio.plugins.jpeg;

import javax.imageio.metadata.IIOMetadataFormat;
import javax.imageio.metadata.IIOMetadataFormatImpl;

public class JPEGStreamMetadataFormat extends JPEGMetadataFormat {

    private static JPEGStreamMetadataFormat theInstance = null;

    private JPEGStreamMetadataFormat() {
        super(JPEG.nativeStreamMetadataFormatName,
              CHILD_POLICY_SEQUENCE);
        addStreamElements(getRootName());
    }

    public static synchronized IIOMetadataFormat getInstance() {
        if (theInstance == null) {
            theInstance = new JPEGStreamMetadataFormat();
        }
        return theInstance;
    }
}
