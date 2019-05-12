/**
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.xproofassistant.ide;

import ac.soton.xeventb.xproofassistant.XProofAssistantRuntimeModule;
import ac.soton.xeventb.xproofassistant.XProofAssistantStandaloneSetup;
import ac.soton.xeventb.xproofassistant.ide.XProofAssistantIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class XProofAssistantIdeSetup extends XProofAssistantStandaloneSetup {
  @Override
  public Injector createInjector() {
    XProofAssistantRuntimeModule _xProofAssistantRuntimeModule = new XProofAssistantRuntimeModule();
    XProofAssistantIdeModule _xProofAssistantIdeModule = new XProofAssistantIdeModule();
    return Guice.createInjector(Modules2.mixin(_xProofAssistantRuntimeModule, _xProofAssistantIdeModule));
  }
}