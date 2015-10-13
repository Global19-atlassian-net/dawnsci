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

package org.eclipse.dawnsci.nexus.impl;

import org.eclipse.dawnsci.analysis.api.dataset.IDataset;
import org.eclipse.dawnsci.analysis.dataset.impl.Dataset;

import org.eclipse.dawnsci.nexus.*;

/**
 * This is the description for a (typically neutron) velocity selector
 * 
 * @version 1.0
 */
public class NXvelocity_selectorImpl extends NXobjectImpl implements NXvelocity_selector {

	private static final long serialVersionUID = 1L;  // no state in this class, so always compatible

	public static final String NX_TYPE = "type";
	public static final String NX_ROTATION_SPEED = "rotation_speed";
	public static final String NX_RADIUS = "radius";
	public static final String NX_SPWIDTH = "spwidth";
	public static final String NX_LENGTH = "length";
	public static final String NX_NUM = "num";
	public static final String NX_TWIST = "twist";
	public static final String NX_TABLE = "table";
	public static final String NX_HEIGHT = "height";
	public static final String NX_WIDTH = "width";
	public static final String NX_WAVELENGTH = "wavelength";
	public static final String NX_WAVELENGTH_SPREAD = "wavelength_spread";

	protected NXvelocity_selectorImpl(final NexusNodeFactory nodeFactory) {
		super(nodeFactory);
	}

	protected NXvelocity_selectorImpl(final long oid) {
		super(oid);
	}
	
	@Override
	public Class<? extends NXobject> getNXclass() {
		return NXvelocity_selector.class;
	}
	
	@Override
	public NXbaseClass getNXbaseClass() {
		return NXbaseClass.NX_VELOCITY_SELECTOR;
	}

	@Override
	public IDataset getType() {
		return getDataset(NX_TYPE);
	}

	@Override
	public String getScalarType() {
		return getString(NX_TYPE);
	}

	public void setType(IDataset type) {
		setDataset(NX_TYPE, type);
	}

	public void setScalarType(String type) {
		setString(NX_TYPE, type);
	}

	@Override
	public IDataset getRotation_speed() {
		return getDataset(NX_ROTATION_SPEED);
	}

	@Override
	public double getScalarRotation_speed() {
		return getDouble(NX_ROTATION_SPEED);
	}

	public void setRotation_speed(IDataset rotation_speed) {
		setDataset(NX_ROTATION_SPEED, rotation_speed);
	}

	public void setScalarRotation_speed(double rotation_speed) {
		setField(NX_ROTATION_SPEED, rotation_speed);
	}

	@Override
	public IDataset getRadius() {
		return getDataset(NX_RADIUS);
	}

	@Override
	public double getScalarRadius() {
		return getDouble(NX_RADIUS);
	}

	public void setRadius(IDataset radius) {
		setDataset(NX_RADIUS, radius);
	}

	public void setScalarRadius(double radius) {
		setField(NX_RADIUS, radius);
	}

	@Override
	public IDataset getSpwidth() {
		return getDataset(NX_SPWIDTH);
	}

	@Override
	public double getScalarSpwidth() {
		return getDouble(NX_SPWIDTH);
	}

	public void setSpwidth(IDataset spwidth) {
		setDataset(NX_SPWIDTH, spwidth);
	}

	public void setScalarSpwidth(double spwidth) {
		setField(NX_SPWIDTH, spwidth);
	}

	@Override
	public IDataset getLength() {
		return getDataset(NX_LENGTH);
	}

	@Override
	public double getScalarLength() {
		return getDouble(NX_LENGTH);
	}

	public void setLength(IDataset length) {
		setDataset(NX_LENGTH, length);
	}

	public void setScalarLength(double length) {
		setField(NX_LENGTH, length);
	}

	@Override
	public IDataset getNum() {
		return getDataset(NX_NUM);
	}

	@Override
	public long getScalarNum() {
		return getLong(NX_NUM);
	}

	public void setNum(IDataset num) {
		setDataset(NX_NUM, num);
	}

	public void setScalarNum(long num) {
		setField(NX_NUM, num);
	}

	@Override
	public IDataset getTwist() {
		return getDataset(NX_TWIST);
	}

	@Override
	public double getScalarTwist() {
		return getDouble(NX_TWIST);
	}

	public void setTwist(IDataset twist) {
		setDataset(NX_TWIST, twist);
	}

	public void setScalarTwist(double twist) {
		setField(NX_TWIST, twist);
	}

	@Override
	public IDataset getTable() {
		return getDataset(NX_TABLE);
	}

	@Override
	public double getScalarTable() {
		return getDouble(NX_TABLE);
	}

	public void setTable(IDataset table) {
		setDataset(NX_TABLE, table);
	}

	public void setScalarTable(double table) {
		setField(NX_TABLE, table);
	}

	@Override
	public IDataset getHeight() {
		return getDataset(NX_HEIGHT);
	}

	@Override
	public double getScalarHeight() {
		return getDouble(NX_HEIGHT);
	}

	public void setHeight(IDataset height) {
		setDataset(NX_HEIGHT, height);
	}

	public void setScalarHeight(double height) {
		setField(NX_HEIGHT, height);
	}

	@Override
	public IDataset getWidth() {
		return getDataset(NX_WIDTH);
	}

	@Override
	public double getScalarWidth() {
		return getDouble(NX_WIDTH);
	}

	public void setWidth(IDataset width) {
		setDataset(NX_WIDTH, width);
	}

	public void setScalarWidth(double width) {
		setField(NX_WIDTH, width);
	}

	@Override
	public IDataset getWavelength() {
		return getDataset(NX_WAVELENGTH);
	}

	@Override
	public double getScalarWavelength() {
		return getDouble(NX_WAVELENGTH);
	}

	public void setWavelength(IDataset wavelength) {
		setDataset(NX_WAVELENGTH, wavelength);
	}

	public void setScalarWavelength(double wavelength) {
		setField(NX_WAVELENGTH, wavelength);
	}

	@Override
	public IDataset getWavelength_spread() {
		return getDataset(NX_WAVELENGTH_SPREAD);
	}

	@Override
	public double getScalarWavelength_spread() {
		return getDouble(NX_WAVELENGTH_SPREAD);
	}

	public void setWavelength_spread(IDataset wavelength_spread) {
		setDataset(NX_WAVELENGTH_SPREAD, wavelength_spread);
	}

	public void setScalarWavelength_spread(double wavelength_spread) {
		setField(NX_WAVELENGTH_SPREAD, wavelength_spread);
	}

	@Override
	public NXgeometry getGeometry() {
		return getChild("geometry", NXgeometry.class);
	}

	public void setGeometry(NXgeometry geometry) {
		putChild("geometry", geometry);
	}

}
