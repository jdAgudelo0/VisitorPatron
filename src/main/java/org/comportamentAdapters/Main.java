package org.comportamentAdapters;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Construir la estructura del documento XML
        XMLElement root = new XMLElement("root");
        XMLElement childElement = new XMLElement("child");
        XMLAttribute attribute = new XMLAttribute("attr", "value");
        root.addChild(childElement);
        childElement.addChild(new XMLAttribute("childAttr", "childValue"));

        // Aplicar el Visitor para imprimir la estructura del documento XML
        XMLPrinterVisitor printerVisitor = new XMLPrinterVisitor();
        root.accept(printerVisitor);
    }
}