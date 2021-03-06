/*
 * Copyright 2011-2016 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://ksyun.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ksc.util;

import java.io.InputStream;

import com.ksc.KscWebServiceClient;
import com.ksc.internal.SdkFilterInputStream;

/**
 * This wrapper input stream holds a reference to the service client. This is
 * mainly done to avoid the AmazonWebServiceClient object being garbage
 * collected when the client reads data from the input stream.
 * 
 */
public class ServiceClientHolderInputStream extends SdkFilterInputStream {

	
	@SuppressWarnings("unused")
	private KscWebServiceClient client;

	public ServiceClientHolderInputStream(InputStream in,
			KscWebServiceClient client) {
		super(in);
		this.client = client;
	}	
}
