/*
 * @(#)BAD_QOS.java	1.4 06/04/21
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package org.omg.CORBA;

/**
 * The <code>BAD_QOS</code> exception is raised whenever an object cannot 
 * support the quality of service required by an invocation parameter that 
 * has a quality of service semantics associated with it.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 *      Java&nbsp;IDL exceptions</A>
 * @version 1.0, 03/05/2004
 * @since   J2SE 1.5
 */

public final class BAD_QOS extends SystemException {

    /**
     * Constructs an <code>BAD_QOS</code> exception with
     * minor code set to 0 and CompletionStatus set to COMPLETED_NO.
     */
    public BAD_QOS() {
	this("");
    }

    /**
     * Constructs an <code>BAD_QOS</code> exception with the 
     * specified message.
     * 
     * @param detailMessage string containing a detailed message.
     */
    public BAD_QOS(String detailMessage) {
        this(detailMessage, 0, CompletionStatus.COMPLETED_NO);
    }

    /**
     * Constructs an <code>BAD_QOS</code> exception with the 
     * specified minor code and completion status.
     * 
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
    public BAD_QOS(int minorCode, 
                   CompletionStatus completionStatus) {
        this("", minorCode, completionStatus);
    }

    /**
     * Constructs an <code>BAD_QOS</code> exception with the 
     * specified message, minor code, and completion status.
     * 
     * @param detailMessage string containing a detailed message.
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
    public BAD_QOS(String detailMessage, 
                   int minorCode, 
                   CompletionStatus completionStatus) {
        super(detailMessage, minorCode, completionStatus);
    }
}
