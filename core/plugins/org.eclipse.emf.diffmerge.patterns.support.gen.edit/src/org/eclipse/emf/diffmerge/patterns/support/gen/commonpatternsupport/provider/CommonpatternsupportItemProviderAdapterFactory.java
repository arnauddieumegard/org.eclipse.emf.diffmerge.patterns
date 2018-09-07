/*********************************************************************
 * Copyright (c) 2010-2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S. - initial API and implementation
 **********************************************************************/
package org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.util.CommonpatternsupportAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonpatternsupportItemProviderAdapterFactory extends CommonpatternsupportAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
  /**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CommonpatternsupportItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.CommonPatternInstanceSet} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CommonPatternInstanceSetItemProvider commonPatternInstanceSetItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.CommonPatternInstanceSet}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createCommonPatternInstanceSetAdapter() {
		if (commonPatternInstanceSetItemProvider == null) {
			commonPatternInstanceSetItemProvider = new CommonPatternInstanceSetItemProvider(this);
		}

		return commonPatternInstanceSetItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.CommonPatternInstance} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CommonPatternInstanceItemProvider commonPatternInstanceItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.CommonPatternInstance}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createCommonPatternInstanceAdapter() {
		if (commonPatternInstanceItemProvider == null) {
			commonPatternInstanceItemProvider = new CommonPatternInstanceItemProvider(this);
		}

		return commonPatternInstanceItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.ResourceLocation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ResourceLocationItemProvider resourceLocationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.ResourceLocation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createResourceLocationAdapter() {
		if (resourceLocationItemProvider == null) {
			resourceLocationItemProvider = new ResourceLocationItemProvider(this);
		}

		return resourceLocationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.ElementLocation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ElementLocationItemProvider elementLocationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.ElementLocation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createElementLocationAdapter() {
		if (elementLocationItemProvider == null) {
			elementLocationItemProvider = new ElementLocationItemProvider(this);
		}

		return elementLocationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.AttributeLocation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AttributeLocationItemProvider attributeLocationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.AttributeLocation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createAttributeLocationAdapter() {
		if (attributeLocationItemProvider == null) {
			attributeLocationItemProvider = new AttributeLocationItemProvider(this);
		}

		return attributeLocationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.ReferenceLocation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ReferenceLocationItemProvider referenceLocationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.ReferenceLocation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createReferenceLocationAdapter() {
		if (referenceLocationItemProvider == null) {
			referenceLocationItemProvider = new ReferenceLocationItemProvider(this);
		}

		return referenceLocationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.ElementMappingLocation} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ElementMappingLocationItemProvider elementMappingLocationItemProvider;

  /**
	 * This creates an adapter for a {@link org.eclipse.emf.diffmerge.patterns.support.gen.commonpatternsupport.ElementMappingLocation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createElementMappingLocationAdapter() {
		if (elementMappingLocationItemProvider == null) {
			elementMappingLocationItemProvider = new ElementMappingLocationItemProvider(this);
		}

		return elementMappingLocationItemProvider;
	}

  /**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ElementMappingEntryItemProvider elementMappingEntryItemProvider;

  /**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter createElementMappingEntryAdapter() {
		if (elementMappingEntryItemProvider == null) {
			elementMappingEntryItemProvider = new ElementMappingEntryItemProvider(this);
		}

		return elementMappingEntryItemProvider;
	}

  /**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

  /**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

  /**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

  /**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

  /**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

  /**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

  /**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void dispose() {
		if (commonPatternInstanceSetItemProvider != null) commonPatternInstanceSetItemProvider.dispose();
		if (commonPatternInstanceItemProvider != null) commonPatternInstanceItemProvider.dispose();
		if (resourceLocationItemProvider != null) resourceLocationItemProvider.dispose();
		if (elementLocationItemProvider != null) elementLocationItemProvider.dispose();
		if (attributeLocationItemProvider != null) attributeLocationItemProvider.dispose();
		if (referenceLocationItemProvider != null) referenceLocationItemProvider.dispose();
		if (elementMappingLocationItemProvider != null) elementMappingLocationItemProvider.dispose();
		if (elementMappingEntryItemProvider != null) elementMappingEntryItemProvider.dispose();
	}

}
