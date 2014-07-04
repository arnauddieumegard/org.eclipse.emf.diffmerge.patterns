/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 * Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.eclipse.emf.diffmerge.patterns.ui.wizards.creation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.diffmerge.patterns.core.CorePatternsPlugin;
import org.eclipse.emf.diffmerge.patterns.diagram.PatternCoreDiagramPlugin;
import org.eclipse.emf.diffmerge.patterns.diagram.factories.IPatternOperationFactory;
import org.eclipse.emf.diffmerge.patterns.diagram.operations.AbstractPatternWithLayoutOperation;
import org.eclipse.emf.diffmerge.patterns.templates.engine.specifications.TemplatePatternCreationSpecification;
import org.eclipse.emf.diffmerge.patterns.ui.Messages;
import org.eclipse.emf.diffmerge.patterns.ui.PatternsUIPlugin;
import org.eclipse.emf.diffmerge.patterns.ui.factories.IPatternJobFactory;
import org.eclipse.emf.diffmerge.patterns.ui.wizards.AbstractPatternPage;
import org.eclipse.emf.diffmerge.patterns.ui.wizards.AbstractPatternWizard;
import org.eclipse.emf.diffmerge.patterns.ui.wizards.CompositeWizardPage;

/**
 * A wizard for creating a new pattern.
 * @author O. CONSTANT
 * @author Skander TURKI
 */
public class PatternCreationWizard extends AbstractPatternWizard<TemplatePatternCreationSpecification> {

  
  /** Whether the Next and Back buttons must be created */
  private final boolean _createNextBackButtons;
  
  /**
   * Constructor
   * @param sources_p the elements from which the pattern must be created
   * @param graphicalContext_p a non-null, potentially empty list of GEF elements
   */
  public PatternCreationWizard(List<? extends Object> sources_p,
      List<Object> graphicalContext_p
      , TemplatePatternCreationSpecification patternCreationSpecification_p, boolean createNextBackButtons_p) {
    super(patternCreationSpecification_p, graphicalContext_p, true);
    _createNextBackButtons = createNextBackButtons_p;
  }
  
/**
 * 
 * @see org.eclipse.jface.wizard.Wizard#needsPreviousAndNextButtons()
 */
  @Override
  public boolean needsPreviousAndNextButtons(){
    return _createNextBackButtons;
  }

  
  /**
   * @see org.eclipse.emf.diffmerge.patterns.ui.wizards.AbstractPatternWizard#doAddPages()
   */
  @Override
  public void doAddPages() {
    getData().initializeRoles();
    List<AbstractPatternPage<TemplatePatternCreationSpecification>> subPages =
        new ArrayList<AbstractPatternPage<TemplatePatternCreationSpecification>>();
    subPages.add(new PatternCreationPresentationPage(getData()));
    subPages.add(new PatternCreationElementsPage(getData()));
    subPages.add(new PatternCreationRolesPage(getData()));
    CompositeWizardPage<TemplatePatternCreationSpecification> compositePage =
        new CompositeWizardPage<TemplatePatternCreationSpecification>(
            "mainComposite", //$NON-NLS-1$
            Messages.PatternCreationWizard_Title,
            Messages.PatternCreationWizard_Message,
            getData(), false, subPages);
    addPage(compositePage);
    setWindowTitle(Messages.PatternCreationWizard_Header);
    computePatternImageFromGraphicalContext(true);
  }

  /**
   * @see org.eclipse.emf.diffmerge.patterns.ui.wizards.AbstractPatternWizard#doPerformFinish()
   */
  @Override
  protected boolean doPerformFinish() {
    boolean result = false;
    IPatternOperationFactory factory = PatternCoreDiagramPlugin.getDefault().getOperationFactory();
    if(factory != null){
      AbstractPatternWithLayoutOperation<?> operation = factory.instantiateCreatePatternAndInstanceOperation(getData(), getGraphicalContext(), getData().getRepository());
      Object returned = CorePatternsPlugin.getDefault().getModelEnvironment().execute(operation);
      result = returned != null;
    }	
    return result;
  }

  /**
   * @see org.eclipse.emf.diffmerge.patterns.ui.wizards.AbstractPatternWizard#instantiatePatternImageBuilderJob(org.eclipse.emf.diffmerge.patterns.ui.wizards.AbstractPatternWizard, java.util.List, boolean)
   */
  @SuppressWarnings("unchecked")
  @Override
  protected Job instantiatePatternImageBuilderJob(AbstractPatternWizard<TemplatePatternCreationSpecification> wizard_p,  
      List<Object> context_p, boolean updatePattern_p){
    IPatternJobFactory factory = PatternsUIPlugin.getDefault().getJobFactory();
    if(factory != null){
      return factory.instantiatePatternImageBuilderJob(wizard_p, context_p, updatePattern_p);
    }
    return null;
  }

  /**
   * @see org.eclipse.emf.diffmerge.patterns.ui.wizards.AbstractPatternWizard#instantiatePatternImageBuilderJob(org.eclipse.emf.diffmerge.patterns.ui.wizards.AbstractPatternWizard, java.lang.String, boolean)
   */
  @SuppressWarnings("unchecked")
  @Override
  protected Job instantiatePatternImageBuilderJob(AbstractPatternWizard<TemplatePatternCreationSpecification> wizard_p,  
      String imageSpecification_p, boolean updatePattern_p){
    IPatternJobFactory factory = PatternsUIPlugin.getDefault().getJobFactory();
    if(factory != null){
      return factory.instantiatePatternImageBuilderJob(wizard_p, imageSpecification_p, updatePattern_p);
    }
    return null;
  }

}