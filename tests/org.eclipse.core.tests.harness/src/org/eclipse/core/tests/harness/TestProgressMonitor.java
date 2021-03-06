/*******************************************************************************
 * Copyright (c) 2000, 2015 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.core.tests.harness;

import org.eclipse.core.runtime.IProgressMonitor;

public abstract class TestProgressMonitor implements IProgressMonitor {

	/**
	 * @see IProgressMonitor#beginTask
	 */
	@Override
	public void beginTask(String name, int totalWork) {
		//do nothing
	}

	/**
	 * @see IProgressMonitor#done
	 */
	@Override
	public void done() {
		//do nothing
	}

	@Override
	public void internalWorked(double work) {
		//do nothing
	}

	/**
	 * @see IProgressMonitor#isCanceled
	 */
	@Override
	public boolean isCanceled() {
		return false;
	}

	/**
	 * @see IProgressMonitor#setCanceled
	 */
	@Override
	public void setCanceled(boolean b) {
		//do nothing
	}

	/**
	 * @see IProgressMonitor#setTaskName
	 */
	@Override
	public void setTaskName(String name) {
		//do nothing
	}

	/**
	 * @see IProgressMonitor#subTask
	 */
	@Override
	public void subTask(String name) {
		//do nothing
	}

	/**
	 * @see IProgressMonitor#worked
	 */
	@Override
	public void worked(int work) {
		//do nothing
	}
}
