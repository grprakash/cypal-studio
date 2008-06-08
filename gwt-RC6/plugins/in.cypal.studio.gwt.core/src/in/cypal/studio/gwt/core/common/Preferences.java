/*
 * Copyright 2006 - 2008 Cypal Solutions (tools@cypal.in)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package in.cypal.studio.gwt.core.common;

import in.cypal.studio.gwt.core.Activator;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;

/**
 * 
 * @author Prakash G.R.
 * 
 */
public final class Preferences {

	static final IPreferencesService preferencesService = Platform.getPreferencesService();
	static final IScopeContext[] contexts = new IScopeContext[] { new InstanceScope(), new DefaultScope() };

	public static String getString(String key, String defaultValue) {
		return preferencesService.getString(Activator.PLUGIN_ID, key, defaultValue, contexts);
	}

	public static boolean getBoolean(String key, boolean defaultValue) {
		return preferencesService.getBoolean(Activator.PLUGIN_ID, key, defaultValue, contexts);
	}

	public static String getString(String key) {
		return getString(key, "");
	}

	public static boolean getBoolean(String key) {
		return getBoolean(key, false);
	}

}