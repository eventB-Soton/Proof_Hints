/**
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.xproofassistant;

import ac.soton.xeventb.xproofassistant.XProofAssistantStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class XProofAssistantStandaloneSetup extends XProofAssistantStandaloneSetupGenerated {
  public static void doSetup() {
    new XProofAssistantStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
