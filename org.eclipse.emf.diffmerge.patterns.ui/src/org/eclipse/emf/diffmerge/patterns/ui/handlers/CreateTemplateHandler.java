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
package org.eclipse.emf.diffmerge.patterns.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.diffmerge.patterns.ui.actions.AbstractCreateTemplateAction;
import org.eclipse.emf.diffmerge.patterns.ui.factories.AbstractPatternActionFactory;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;


/**
 * @author Mohamed Sidati
 * @author Skander TURKI
 */
public class CreateTemplateHandler<DiagramElementType> extends AbstractWorkbenchSelectionHandler {

  /**
   * @see AbstractWorkbenchSelectionHandler#handleSelection(ISelection, IWorkbenchPart, ExecutionEvent)
   */
  @Override
  protected Object handleSelection(ISelection selection_p, IWorkbenchPart activePart_p) {
    IWorkbenchWindow window = getWorkbenchWindow();
    if (window != null) {
      IWorkbenchPage page = window.getActivePage();
      if (page != null) {
        IWorkbenchPart part = page.getActivePart();
        if (part != null) {
          AbstractCreateTemplateAction<DiagramElementType> action = instantiateCreateTemplateAction();
          if(action != null){
            action.setActivePart(null, part);
            action.selectionChanged(null, selection_p);
            action.run(null);
          }
        }
      }
    }
    return null;
  }

  
  
  @SuppressWarnings("unchecked")
  protected AbstractCreateTemplateAction<DiagramElementType> instantiateCreateTemplateAction(){
    try{
      AbstractPatternActionFactory<?, ?> factory = AbstractPatternActionFactory.getInstance();
      if(factory != null){
        return (AbstractCreateTemplateAction<DiagramElementType>)factory.instantiateCreateTemplateAction();
      } 
    }
    catch(Exception e){
      EcorePlugin.INSTANCE.log(e);
    }
    return null;
  }
  
}
