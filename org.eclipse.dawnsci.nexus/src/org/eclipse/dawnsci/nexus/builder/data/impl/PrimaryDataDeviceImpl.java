/*-
 *******************************************************************************
 * Copyright (c) 2011, 2016 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Matthew Gerring - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.dawnsci.nexus.builder.data.impl;

import org.eclipse.dawnsci.nexus.NXobject;
import org.eclipse.dawnsci.nexus.builder.data.PrimaryDataDevice;

public class PrimaryDataDeviceImpl<N extends NXobject> extends DataDeviceImpl<N> implements PrimaryDataDevice<N> {

	private final String signalFieldSourceName;
	
	private final DataFieldModel signalFieldModel;
	
	public PrimaryDataDeviceImpl(N nexusObject, DataFieldModel signalFieldModel) {
		super(nexusObject);
		this.signalFieldSourceName = signalFieldModel.getSourceFieldName();
		this.signalFieldModel = signalFieldModel;
	}
	
	@Override
	public String getSignalFieldSourceName() {
		return signalFieldModel.getSourceFieldName();
	}
	
	@Override
	public int getFieldRank(String sourceFieldName) {
		if (sourceFieldName.equals(signalFieldSourceName)) {
			return signalFieldModel.getFieldRank();
		}
		
		return super.getFieldRank(sourceFieldName);
	}
	
	@Override
	public String getDestinationFieldName(String sourceFieldName) {
		if (sourceFieldName.equals(signalFieldSourceName)) {
			return signalFieldModel.getDestinationFieldName();
		}
		
		return super.getDestinationFieldName(sourceFieldName);
	}
	
	protected void appendFields(StringBuilder sb) {
		sb.append(",  signalField=");
		sb.append(signalFieldModel);
		sb.append("\n");
		
		super.appendFields(sb);
	}

}
