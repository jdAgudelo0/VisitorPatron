package org.comportamentAdapters;

import java.util.ArrayList;
import java.util.List;

// Nodo que representa un elemento del documento XML
class XMLElement implements XMLNode {
    private String name;
    private List<XMLNode> children;

    // Constructor para crear un nuevo elemento XML con un nombre dado
    public XMLElement(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    // Método para agregar un nodo hijo a este elemento
    public void addChild(XMLNode node) {
        children.add(node);
    }

    // Implementación del método accept de la interfaz XMLNode
    // Este método permite que un visitor visite este elemento y sus hijos
    @Override
    public void accept(XMLVisitor visitor) {
        // El visitor visita este elemento
        visitor.visitElement(this);
        // Se recorren los hijos de este elemento y se les hace aceptar al visitor
        for (XMLNode child : children) {
            child.accept(visitor);
        }
    }

    // Método para obtener el nombre de este elemento XML
    public String getName() {
        return name;
    }
}