/*******************************************************************************
 *  Copyright (c) 2016 Obeo. 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *       Obeo - initial API and implementation
 *  
 *******************************************************************************/
/**
 */
package org.obeonetwork.m2doc.ui.genconf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.m2doc.ui.genconf.GenconfPackage
 * @generated
 */
public interface GenconfFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    GenconfFactory eINSTANCE = org.obeonetwork.m2doc.ui.genconf.impl.GenconfFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Generation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generation</em>'.
     * @generated
     */
    Generation createGeneration();

    /**
     * Returns a new object of class '<em>Model Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model Definition</em>'.
     * @generated
     */
    ModelDefinition createModelDefinition();

    /**
     * Returns a new object of class '<em>String Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Definition</em>'.
     * @generated
     */
    StringDefinition createStringDefinition();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    GenconfPackage getGenconfPackage();

} // GenconfFactory
