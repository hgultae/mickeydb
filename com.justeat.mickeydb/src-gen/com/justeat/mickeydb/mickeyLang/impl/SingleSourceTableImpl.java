/**
 */
package com.justeat.mickeydb.mickeyLang.impl;

import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;
import com.justeat.mickeydb.mickeyLang.SingleSourceTable;
import com.justeat.mickeydb.mickeyLang.TableDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Source Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.SingleSourceTableImpl#getTableReference <em>Table Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleSourceTableImpl extends SelectSourceImpl implements SingleSourceTable
{
  /**
   * The cached value of the '{@link #getTableReference() <em>Table Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableReference()
   * @generated
   * @ordered
   */
  protected TableDefinition tableReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleSourceTableImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MickeyLangPackage.Literals.SINGLE_SOURCE_TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDefinition getTableReference()
  {
    if (tableReference != null && tableReference.eIsProxy())
    {
      InternalEObject oldTableReference = (InternalEObject)tableReference;
      tableReference = (TableDefinition)eResolveProxy(oldTableReference);
      if (tableReference != oldTableReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MickeyLangPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE, oldTableReference, tableReference));
      }
    }
    return tableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDefinition basicGetTableReference()
  {
    return tableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTableReference(TableDefinition newTableReference)
  {
    TableDefinition oldTableReference = tableReference;
    tableReference = newTableReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE, oldTableReference, tableReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MickeyLangPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE:
        if (resolve) return getTableReference();
        return basicGetTableReference();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MickeyLangPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE:
        setTableReference((TableDefinition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MickeyLangPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE:
        setTableReference((TableDefinition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MickeyLangPackage.SINGLE_SOURCE_TABLE__TABLE_REFERENCE:
        return tableReference != null;
    }
    return super.eIsSet(featureID);
  }

} //SingleSourceTableImpl
