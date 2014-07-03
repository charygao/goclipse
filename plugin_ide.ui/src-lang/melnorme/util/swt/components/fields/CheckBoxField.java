/*******************************************************************************
 * Copyright (c) 2014, 2014 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.util.swt.components.fields;

import melnorme.util.swt.components.AbstractFieldExt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class CheckBoxField extends AbstractFieldExt<Boolean> {
	
	protected Button checkBox;
	
	public CheckBoxField(String labelText) {
		super(labelText);
	}
	
	@Override
	public Boolean getDefaultFieldValue() {
		return false;
	}
	
	@Override
	protected void createContents_do(Composite topControl) {
		checkBox = createFieldCheckbox(this, topControl, SWT.NONE);
		checkBox.setText(labelText);
	}
	
	@Override
	protected void createContents_layout() {
		layout1Control(checkBox);
	}
	
	@Override
	public Button getFieldControl() {
		return checkBox;
	}
	
	@Override
	protected void doUpdateComponentFromValue() {
		checkBox.setSelection(getFieldValue());
	}
	
}