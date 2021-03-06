/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CreateTableStatement#isTemporary <em>Temporary</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CreateTableStatement#getColumnDefs <em>Column Defs</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CreateTableStatement#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCreateTableStatement()
 * @model
 * @generated
 */
public interface CreateTableStatement extends TableDefinition
{
  /**
   * Returns the value of the '<em><b>Temporary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Temporary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temporary</em>' attribute.
   * @see #setTemporary(boolean)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCreateTableStatement_Temporary()
   * @model
   * @generated
   */
  boolean isTemporary();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.CreateTableStatement#isTemporary <em>Temporary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temporary</em>' attribute.
   * @see #isTemporary()
   * @generated
   */
  void setTemporary(boolean value);

  /**
   * Returns the value of the '<em><b>Column Defs</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.ColumnSource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Defs</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCreateTableStatement_ColumnDefs()
   * @model containment="true"
   * @generated
   */
  EList<ColumnSource> getColumnDefs();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.TableConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCreateTableStatement_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<TableConstraint> getConstraints();

} // CreateTableStatement
