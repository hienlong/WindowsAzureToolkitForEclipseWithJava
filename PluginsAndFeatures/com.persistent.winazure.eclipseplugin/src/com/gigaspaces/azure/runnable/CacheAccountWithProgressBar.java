/*******************************************************************************
 * Copyright (c) 2012 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.gigaspaces.azure.runnable;

import org.eclipse.swt.widgets.Shell;

import waeclipseplugin.Activator;
import com.gigaspaces.azure.util.PublishData;
import com.gigaspaces.azure.wizards.Messages;
import com.gigaspaces.azure.wizards.WizardCacheManager;

public class CacheAccountWithProgressBar extends AccountActionRunnable {

	public CacheAccountWithProgressBar(PublishData data, Shell shell, String message) {
		super(data, shell);
	}

	@Override
	public void doTask() {
		try {
			WizardCacheManager.cachePublishData(data, this);
		} 
		catch (Exception e) {
			Activator.getDefault().log(Messages.error, e);
		}	
	}
}
