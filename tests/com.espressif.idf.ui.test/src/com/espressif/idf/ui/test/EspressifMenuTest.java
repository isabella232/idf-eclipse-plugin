/*******************************************************************************
 * Copyright 2022 Espressif Systems (Shanghai) PTE LTD. All rights reserved.
 * Use is subject to license terms.
 *******************************************************************************/
package com.espressif.idf.ui.test;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.ui.PlatformUI;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Kondal Kolipaka <kondal.kolipaka@espressif.com>
 *
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class EspressifMenuTest
{

	private static SWTWorkbenchBot bot;

	@Before
	public void beforeClass() throws Exception
	{
		UIThreadRunnable.syncExec(new VoidResult()
		{
			public void run()
			{
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().forceActive();
			}
		});
		bot = new SWTWorkbenchBot();

	}

	@Test
	public void testProductInformation()
	{
		bot.viewByTitle("Project Explorer").show();
		bot.menu("Espressif").menu("Product Information").click();

	}

}
