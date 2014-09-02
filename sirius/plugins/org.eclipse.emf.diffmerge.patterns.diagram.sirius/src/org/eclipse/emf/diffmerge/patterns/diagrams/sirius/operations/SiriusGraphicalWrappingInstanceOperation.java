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
package org.eclipse.emf.diffmerge.patterns.diagrams.sirius.operations;

import org.eclipse.emf.diffmerge.patterns.core.api.IPatternInstance;
import org.eclipse.emf.diffmerge.patterns.core.api.ext.IModelOperation;
import org.eclipse.emf.diffmerge.patterns.diagrams.operations.AbstractGraphicalWrappingInstanceOperation;


/**
 * A Sirius-specific model operation that wraps an operation on a pattern instance and may perform different
 * kinds of refresh on a diagram to reflect the effect of the wrapped operation.
 * @author Olivier Constant
 * @author Skander Turki
 */
public class SiriusGraphicalWrappingInstanceOperation<F> extends AbstractGraphicalWrappingInstanceOperation<F>{

  /**
   * Constructor
   * @param operation_p
   * @param diagram_p
   * @param refreshRequest_p
   */
  public SiriusGraphicalWrappingInstanceOperation(
      IModelOperation<? extends F> operation_p,
      Object diagram_p,
      org.eclipse.emf.diffmerge.patterns.diagrams.operations.AbstractGraphicalWrappingInstanceOperation.RefreshRequestKind refreshRequest_p) {
    super(operation_p, diagram_p, refreshRequest_p);
  }

  /**
   * Constructor
   * @param operation_p
   * @param instance_p
   * @param diagram_p
   * @param refreshRequest_p
   */
  public SiriusGraphicalWrappingInstanceOperation(IModelOperation<? extends F> operation_p,
      IPatternInstance instance_p, Object diagram_p, 
      org.eclipse.emf.diffmerge.patterns.diagrams.operations.AbstractGraphicalWrappingInstanceOperation.RefreshRequestKind refreshRequest_p){
    super(operation_p, instance_p, diagram_p, refreshRequest_p);
  }
  
  /**
   * 
   * @see org.eclipse.emf.diffmerge.patterns.diagrams.operations.AbstractGraphicalWrappingInstanceOperation#refreshDiagram()
   */
  @Override
  protected void refreshDiagram() {
    //Let Sirius handle this
    //getDiagram().refresh();
  }

}