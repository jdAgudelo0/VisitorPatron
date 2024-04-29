package org.comportamentAdapters;


// Elemento de la estructura del documento XML
interface XMLNode {
    // Método para aceptar un visitor
    void accept(XMLVisitor visitor);
}