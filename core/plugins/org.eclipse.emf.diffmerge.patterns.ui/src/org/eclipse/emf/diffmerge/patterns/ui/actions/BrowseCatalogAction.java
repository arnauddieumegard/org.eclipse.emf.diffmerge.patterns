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
package org.eclipse.emf.diffmerge.patterns.ui.actions;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.patterns.core.CorePatternsPlugin;
import org.eclipse.emf.diffmerge.patterns.core.gen.corepatterns.PatternRepository;
import org.eclipse.emf.diffmerge.patterns.repositories.catalogs.PatternCatalogsPlugin;
import org.eclipse.emf.diffmerge.patterns.repositories.catalogs.ResourcesUtil;
import org.eclipse.emf.diffmerge.patterns.ui.wizards.PatternWizardDialog;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;


/**
 * An action for browsing catalogs and patterns
 * @author Olivier Constant
 * @author Skander Turki
 */
public class BrowseCatalogAction extends AbstractModelBasedAction {

  /**
   * Constructor
   */
  public BrowseCatalogAction() {
    super();
  }

  /**
   * @see org.eclipse.emf.diffmerge.patterns.ui.actions.AbstractModelBasedAction#coreRun(java.util.List)
   */
  @Override
  protected void coreRun(List<Object> selection_p) {
    Object context = null;
    PatternRepository repository = null;
    if (!selection_p.isEmpty()) {
      Object selection = selection_p.get(0);
      context = selection;
      EditingDomain domain = null;
      if(context instanceof IFile){
        domain = CorePatternsPlugin.getDefault().getModelEnvironment().getEditingDomain((IFile)context);
      }else if(context instanceof EObject){
        domain = CorePatternsPlugin.getDefault().getModelEnvironment().getEditingDomain((EObject)context);
      }
      if (domain != null) {
        context = domain.getResourceSet();
        IStructuredSelection rawSelection = getSelection();
        if (rawSelection != null) {
          Object selected = rawSelection.getFirstElement();
          if (selected instanceof IFile) {
            URI uri = ResourcesUtil.getUriForFile((IFile)selected);
            if (uri != null) {
              Resource resource = ResourcesUtil.getResourceForUri(uri, (ResourceSet)context);
              if (resource != null)
                repository = PatternCatalogsPlugin.getDefault().getAccessor().getCatalogInResource(resource);
            }
          }
        }
      }
      PatternWizardDialog dialog = new PatternWizardDialog(getShell(),
          _dialogAndWizardFactory.instantiatePatternBrowsingWizard(selection, repository), true, null);
      dialog.open();
    }
  }

}