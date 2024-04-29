package org.comportamentAdapters;


// Nodo que representa un atributo del elemento XML
class XMLAttribute implements XMLNode {
    private String name;
    private String value;

    // Constructor para crear un nuevo atributo XML con un nombre y un valor dados
    public XMLAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    // Implementación del método accept de la interfaz XMLNode
    // Este método permite que un visitor visite este atributo
    @Override
    public void accept(XMLVisitor visitor) {
        // El visitor visita este atributo
        visitor.visitAttribute(this);
    }

    // Método para obtener el nombre de este atributo
    public String getName() {
        return name;
    }

    // Método para obtener el valor de este atributo
    public String getValue() {
        return value;
    }
}