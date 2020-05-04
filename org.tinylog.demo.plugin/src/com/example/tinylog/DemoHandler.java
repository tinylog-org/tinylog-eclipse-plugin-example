package com.example.tinylog;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;
import org.tinylog.Logger;

public class DemoHandler {
	
	@Execute
	public void execute(Shell shell) {
		Logger.info("Command triggered"); //$NON-NLS-1$
	}
	
}
