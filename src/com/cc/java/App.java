package com.cc.java;

public class App  {

    
    public static void main(String[] args){
    
        Cat cat = new Cat("Grizabella", 23, "Rot");                                // Klasse --> Objekt / Instanz
        
        // Objekt mit call der Methode
        // cat.getInfo("Grizabella", 23, "Rot");
        
        // set den Namen von Cat zu "Chris"
        // cat.setName("chris");                                                  // aktuell kann der name nicht geändert werden. Weil zugriff in getName mit dem If eingeschränkt ist

        // gibt den Namen von Cat aus
        // System.out.println(cat.getName());                                     // cat.getName() --> deshalb weil wir in der Class Cat die Variablen auf Privat gesetzt haben

        System.out.println("-------------------------");

        Cat cat2 = new Cat("Alonzo", 29, "Schwarz");                               // Klasse --> Objekt / Instanz

        // Objekt mit call der Methode
        // cat2.getInfo("Alonzo", 29, "Schwarz");
        
    }

}
