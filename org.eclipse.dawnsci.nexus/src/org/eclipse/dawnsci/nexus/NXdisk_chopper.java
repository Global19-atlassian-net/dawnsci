/*-
 *******************************************************************************
 * Copyright (c) 2015 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This file was auto-generated from the NXDL XML definition.
 * Generated at: 2015-10-12T11:55:04.232+01:00
 *******************************************************************************/

package org.eclipse.dawnsci.nexus;

import java.util.Map;

import org.eclipse.dawnsci.analysis.api.dataset.IDataset;
import org.eclipse.dawnsci.analysis.dataset.impl.Dataset;

/**
 * TODO: need documentation
 * 
 * @version 1.0
 */
public interface NXdisk_chopper extends NXobject {

	/**
	 * Type of the disk-chopper: only one from the enumerated list (match text exactly)
	 * <p>
	 * <p><b>Enumeration:</b><ul>
	 * <li><b>Chopper type single</b> </li>
	 * <li><b>contra_rotating_pair</b> </li>
	 * <li><b>synchro_pair</b> </li></ul></p>
	 * </p>
	 * 
	 * @return  the value.
	 */
	public IDataset getType();	

	/**
	 * Type of the disk-chopper: only one from the enumerated list (match text exactly)
	 * <p>
	 * <p><b>Enumeration:</b><ul>
	 * <li><b>Chopper type single</b> </li>
	 * <li><b>contra_rotating_pair</b> </li>
	 * <li><b>synchro_pair</b> </li></ul></p>
	 * </p>
	 * 
	 * @return  the value
	 */
	 public String getScalarType();

	/**
	 * chopper rotation speed
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_FREQUENCY
	 * </p>
	 * 
	 * @return  the value.
	 */
	public IDataset getRotation_speed();	

	/**
	 * chopper rotation speed
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_FREQUENCY
	 * </p>
	 * 
	 * @return  the value
	 */
	 public double getScalarRotation_speed();

	/**
	 * Number of slits
	 * <p>
	 * <b>Type:</b> NX_INT
	 * </p>
	 * 
	 * @return  the value.
	 */
	public IDataset getSlits();	

	/**
	 * Number of slits
	 * <p>
	 * <b>Type:</b> NX_INT
	 * </p>
	 * 
	 * @return  the value
	 */
	 public long getScalarSlits();

	/**
	 * angular opening
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_ANGLE
	 * </p>
	 * 
	 * @return  the value.
	 */
	public IDataset getSlit_angle();	

	/**
	 * angular opening
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_ANGLE
	 * </p>
	 * 
	 * @return  the value
	 */
	 public double getScalarSlit_angle();

	/**
	 * disc spacing in direction of beam
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_LENGTH
	 * </p>
	 * 
	 * @return  the value.
	 */
	public IDataset getPair_separation();	

	/**
	 * disc spacing in direction of beam
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_LENGTH
	 * </p>
	 * 
	 * @return  the value
	 */
	 public double getScalarPair_separation();

	/**
	 * radius to centre of slit
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_LENGTH
	 * </p>
	 * 
	 * @return  the value.
	 */
	public IDataset getRadius();	

	/**
	 * radius to centre of slit
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_LENGTH
	 * </p>
	 * 
	 * @return  the value
	 */
	 public double getScalarRadius();

	/**
	 * total slit height
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_LENGTH
	 * </p>
	 * 
	 * @return  the value.
	 */
	public IDataset getSlit_height();	

	/**
	 * total slit height
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_LENGTH
	 * </p>
	 * 
	 * @return  the value
	 */
	 public double getScalarSlit_height();

	/**
	 * chopper phase angle
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_ANGLE
	 * </p>
	 * 
	 * @return  the value.
	 */
	public IDataset getPhase();	

	/**
	 * chopper phase angle
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_ANGLE
	 * </p>
	 * 
	 * @return  the value
	 */
	 public double getScalarPhase();

	/**
	 * pulse reduction factor of this chopper in relation to other
	 * choppers/fastest pulse in the instrument
	 * <p>
	 * <b>Type:</b> NX_INT
	 * </p>
	 * 
	 * @return  the value.
	 */
	public IDataset getRatio();	

	/**
	 * pulse reduction factor of this chopper in relation to other
	 * choppers/fastest pulse in the instrument
	 * <p>
	 * <b>Type:</b> NX_INT
	 * </p>
	 * 
	 * @return  the value
	 */
	 public long getScalarRatio();

	/**
	 * Effective distance to the origin
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_LENGTH
	 * </p>
	 * 
	 * @return  the value.
	 */
	public IDataset getDistance();	

	/**
	 * Effective distance to the origin
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_LENGTH
	 * </p>
	 * 
	 * @return  the value
	 */
	 public double getScalarDistance();

	/**
	 * low and high values of wavelength range transmitted
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_WAVELENGTH
	 * <b>Dimensions:</b> 1: 2;
	 * </p>
	 * 
	 * @return  the value.
	 */
	public IDataset getWavelength_range();	

	/**
	 * low and high values of wavelength range transmitted
	 * <p>
	 * <b>Type:</b> NX_FLOAT
	 * <b>Units:</b> NX_WAVELENGTH
	 * <b>Dimensions:</b> 1: 2;
	 * </p>
	 * 
	 * @return  the value
	 */
	 public double getScalarWavelength_range();

	/**
	 * 
	 * @return  the value.
	 */
	public NXgeometry getGeometry();	
  
	/**
	 * Get a NXgeometry node by name:
	 * <ul>
	 * <li></li>
	 * </ul>
	 * 
	 * @param name  the name of the node.
	 * @return  a map from node names to the NXgeometry for that node.
	 */
	public NXgeometry getGeometry(String name);
	
	/**
	 * Get all NXgeometry nodes:
	 * <ul>
	 * <li></li>
	 * </ul>
	 * 
	 * @return  a map from node names to the NXgeometry for that node.
	 */
	public Map<String, NXgeometry> getAllGeometry();

}
