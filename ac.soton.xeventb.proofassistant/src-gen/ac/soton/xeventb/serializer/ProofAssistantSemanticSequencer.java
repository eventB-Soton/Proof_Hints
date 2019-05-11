/*
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.serializer;

import ac.soton.eventb.emf.proofassistant.Case;
import ac.soton.eventb.emf.proofassistant.CasesHint;
import ac.soton.eventb.emf.proofassistant.ProofAssistant;
import ac.soton.eventb.emf.proofassistant.ProofassistantPackage;
import ac.soton.eventb.emf.proofassistant.SelectionHint;
import ac.soton.xeventb.services.ProofAssistantGrammarAccess;
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
public class ProofAssistantSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProofAssistantGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ProofassistantPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ProofassistantPackage.CASE:
				sequence_Case(context, (Case) semanticObject); 
				return; 
			case ProofassistantPackage.CASES_HINT:
				sequence_CasesHint(context, (CasesHint) semanticObject); 
				return; 
			case ProofassistantPackage.PROOF_ASSISTANT:
				sequence_ProofAssistant(context, (ProofAssistant) semanticObject); 
				return; 
			case ProofassistantPackage.SELECTION_HINT:
				sequence_SelectionHint(context, (SelectionHint) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Case returns Case
	 *
	 * Constraint:
	 *     (name=XLABEL predicate=XFormula)
	 */
	protected void sequence_Case(ISerializationContext context, Case semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BNAMED__NAME));
			if (transientValues.isValueTransient(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.EVENT_BPREDICATE__PREDICATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCaseAccess().getNameXLABELTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCaseAccess().getPredicateXFormulaParserRuleCall_1_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Hint returns CasesHint
	 *     CasesHint returns CasesHint
	 *
	 * Constraint:
	 *     (element=[EventBElement|EString] cases+=Case)
	 */
	protected void sequence_CasesHint(ISerializationContext context, CasesHint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProofAssistant returns ProofAssistant
	 *
	 * Constraint:
	 *     (name=EString component=[EventBNamedCommentedComponentElement|EString] hints+=Hint*)
	 */
	protected void sequence_ProofAssistant(ISerializationContext context, ProofAssistant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Hint returns SelectionHint
	 *     SelectionHint returns SelectionHint
	 *
	 * Constraint:
	 *     (element=[EventBElement|EString] selections+=[EventBElement|EString])
	 */
	protected void sequence_SelectionHint(ISerializationContext context, SelectionHint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}