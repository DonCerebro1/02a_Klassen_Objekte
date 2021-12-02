package com.cc.java;

public class App  {

    
    public static void main(String[] args){
    
        Cat cat = new Cat("Grizabella", 23, "Rot");                               // Klasse --> Objekt / Instanz
        output("Ram-Adresse: " + cat.getAddress());

        // Objekt mit call der Methode
        // cat.getInfo("Grizabella", 23, "Rot");
        
        // set den Namen von Cat zu "Chris"
        // cat.setName("chris");                                                  // aktuell kann der name nicht geändert werden. Weil zugriff in getName mit dem If eingeschränkt ist --> siehe vorriges commit

        // gibt den Namen von Cat aus
        // output(cat.getName());                                                 // cat.getName() --> deshalb weil wir in der Class Cat die Variablen auf Privat gesetzt haben

        Cat cat2 = new Cat("Alonzo", 29, "Schwarz");                              // Klasse --> Objekt / Instanz
        output("Ram-Adresse: " + cat2.getAddress());

        // Objekt mit call der Methode
        // cat2.getInfo("Alonzo", 29, "Schwarz");
        
    }
    
        // Ausgabe Methode damit wir uns das System.out.Println sparen können
        static void output(String outputStr) {
            System.out.println(outputStr);
    }

}
