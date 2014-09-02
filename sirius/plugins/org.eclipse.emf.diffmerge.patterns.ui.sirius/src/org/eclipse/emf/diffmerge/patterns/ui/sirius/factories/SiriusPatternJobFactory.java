/**
 * <copyright>
 * 
 * Copyright (c) 2010-2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S. - initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.emf.diffmerge.patterns.ui.sirius.factories;

import java.util.List;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.diffmerge.patterns.templates.engine.specifications.ITemplatePatternBasedSpecification;
import org.eclipse.emf.diffmerge.patterns.ui.factories.IPatternJobFactory;
import org.eclipse.emf.diffmerge.patterns.ui.sirius.misc.SiriusPatternImageBuilderJob;
import org.eclipse.emf.diffmerge.patterns.ui.wizards.AbstractPatternWizard;


/**
 * A Sirius-specific factory that will instantiate the proper jobs depending of the design environment
 * For Sirius, TemplateSpecificationType can be one of these types:
 * TemplatePatternApplicationSpecification
 * TemplatePatternBrowsingSpecification
 * TemplatePatternCreationSpecification
 * TemplatePatternUpdateSpecification
 * TemplateUsageSpecification
 */
public class SiriusPatternJobFactory implements IPatternJobFactory{
  
  /**
   * @see org.eclipse.emf.diffmerge.patterns.ui.factories.IPatternJobFactory#instantiatePatternImageBuilderJob(org.eclipse.emf.diffmerge.patterns.ui.wizards.AbstractPatternWizard, java.util.List, boolean)
   */
  public <TemplateSpecificationType extends ITemplatePatternBasedSpecification> Job 
  instantiatePatternImageBuilderJob(
      AbstractPatternWizard<TemplateSpecificationType> wizard_p,
      List<Object> context_p, boolean updatePattern_p) {
    return new SiriusPatternImageBuilderJob<TemplateSpecificationType>(wizard_p, context_p, updatePattern_p);
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.patterns.ui.factories.IPatternJobFactory#instantiatePatternImageBuilderJob(org.eclipse.emf.diffmerge.patterns.ui.wizards.AbstractPatternWizard, java.lang.String, boolean)
   */
  public <TemplateSpecificationType extends ITemplatePatternBasedSpecification> Job 
  instantiatePatternImageBuilderJob(
      AbstractPatternWizard<TemplateSpecificationType> wizard_p,
      String imageSpecification_p, boolean updatePattern_p) {
    return new SiriusPatternImageBuilderJob<TemplateSpecificationType>(wizard_p, imageSpecification_p, updatePattern_p);
  }  
  
}