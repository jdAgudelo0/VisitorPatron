package org.comportamentAdapters;

// Visitor concreto que imprime la estructura del documento XML
class XMLPrinterVisitor implements XMLVisitor {
    private int indentLevel = 0;

    // Implementación del método para visitar un elemento XML
    @Override
    public void visitElement(XMLElement element) {
        // Imprime la etiqueta de apertura del elemento XML con indentación
        System.out.println(getIndent() + "<" + element.getName() + ">");
        // Incrementa el nivel de indentación
        indentLevel++;
    }

    // Implementación del método para visitar un atributo XML
    @Override
    public void visitAttribute(XMLAttribute attribute) {
        // Imprime el atributo XML con indentación
        System.out.println(getIndent() + "  " + attribute.getName() + "=\"" + attribute.getValue() + "\"");
    }

    // Método privado para obtener la indentación según el nivel actual
    private String getIndent() {
        StringBuilder indent = new StringBuilder();
        // Agrega espacios de indentación según el nivel actual
        for (int i = 0; i < indentLevel; i++) {
            indent.append("  ");
        }
        return indent.toString();
    }
}
