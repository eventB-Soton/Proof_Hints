/*
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.xproofassistant.serializer;

import ac.soton.eventb.emf.proofassistant.Case;
import ac.soton.eventb.emf.proofassistant.CasesHint;
import ac.soton.eventb.emf.proofassistant.ProofAssistant;
import ac.soton.eventb.emf.proofassistant.ProofassistantPackage;
import ac.soton.eventb.emf.proofassistant.SelectionHint;
import ac.soton.xeventb.xproofassistant.services.XProofAssistantGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eventb.emf.core.CorePackage;

@SuppressWarnings("all")
public class XProofAssistantSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XProofAssistantGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ProofassistantPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ProofassistantPackage.CASE:
				sequence_XCase(context, (Case) semanticObject); 
				return; 
			case ProofassistantPackage.CASES_HINT:
				sequence_XCasesHint(context, (CasesHint) semanticObject); 
				return; 
			case ProofassistantPackage.PROOF_ASSISTANT:
				sequence_XProofAssistant(context, (ProofAssistant) semanticObject); 
				return; 
			case ProofassistantPackage.SELECTION_HINT:
				sequence_XSelectionHint(context, (SelectionHint) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     XCase returns Case
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=XFormula)
	 */
	protected void sequence_XCase(ISerializationContext context, Case semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXCaseAccess().getNameXLABELTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXCaseAccess().getPredicateXFormulaParserRuleCall_1_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XHint returns CasesHint
	 *     XCasesHint returns CasesHint
	 *
	 * Constraint:
	 *     (element=[EventBElement|EString] cases+=XCase+)
	 */
	protected void sequence_XCasesHint(ISerializationContext context, CasesHint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XProofAssistant returns ProofAssistant
	 *
	 * Constraint:
	 *     (name=EString component=[EventBNamedCommentedComponentElement|EString] hints+=XHint*)
	 */
	protected void sequence_XProofAssistant(ISerializationContext context, ProofAssistant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XHint returns SelectionHint
	 *     XSelectionHint returns SelectionHint
	 *
	 * Constraint:
	 *     (element=[EventBElement|EString] selections+=[EventBElement|EString]+)
	 */
	protected void sequence_XSelectionHint(ISerializationContext context, SelectionHint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
