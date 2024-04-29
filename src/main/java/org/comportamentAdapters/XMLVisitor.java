package org.comportamentAdapters;

// Visitor que realiza una operación sobre los nodos XML
interface XMLVisitor {
    // Método para visitar un elemento XML
    void visitElement(XMLElement element);
    // Método para visitar un atributo XML
    void visitAttribute(XMLAttribute attribute);
}