package com.verphen;

import java.awt.Color;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MyBrowser {
	public static void main(String[] args) {

		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setText("L.z Browser");

		// -------code start ------------------------

		Browser browser = new Browser(shell, SWT.None);
		browser.setUrl("http://www.baidu.com/");

		// -------code end ------------------------

		shell.layout();
		shell.open();
		while (!shell.isDisposed()) {
			while (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
