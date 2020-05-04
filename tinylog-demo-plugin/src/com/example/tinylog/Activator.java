package com.example.tinylog;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.pmw.tinylog.Logger;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "tinylog-demo-plugin"; //$NON-NLS-1$

	public Activator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		Logger.info("Starting {}", PLUGIN_ID);
		super.start(context);
		Logger.info("Current working directory is: {}", System.getProperty("user.dir"));
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		Logger.info("{} is down", PLUGIN_ID);
	}

}
