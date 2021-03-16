package com.ur.urcap.examples.driver.screwdriver.advancedscrewdriver;

import com.ur.urcap.api.contribution.driver.screwdriver.ScrewdriverContribution;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(final BundleContext context) {
		context.registerService(ScrewdriverContribution.class, new AdvancedScrewdriver(), null);
	}

	@Override
	public void stop(BundleContext context) {

	}
}

