/*
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.xproofassistant.ui;

import ac.soton.xeventb.xproofassistant.ui.internal.XproofassistantActivator;
import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XProofAssistantExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(XproofassistantActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		XproofassistantActivator activator = XproofassistantActivator.getInstance();
		return activator != null ? activator.getInjector(XproofassistantActivator.AC_SOTON_XEVENTB_XPROOFASSISTANT_XPROOFASSISTANT) : null;
	}

}
