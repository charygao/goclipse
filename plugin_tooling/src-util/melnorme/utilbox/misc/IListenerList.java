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
package melnorme.utilbox.misc;

import java.util.List;


public interface IListenerList<LISTENER> {

	public List<LISTENER> getListeners();

	public void removeListener(LISTENER listener);

	public void addListener(LISTENER listener);

	public IListenerList<LISTENER> createCopy();
	
}