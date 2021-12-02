package com.cc.java;

public class Cat{

    //attribute oder Feld nennt man Variablen in einer Klasse
    private String name;
    private int age;
    private String furColor;

    //Konstrukter (eigener Konstrukter)
    public Cat(String name, int age, String furColor){
        getInfo(name, age, furColor);

    }

    // Methode
    public void getInfo(String name, int age, String furColor){
        this.name   = name;
        this.age    = age;
        this.furColor   = furColor;
        System.out.println("Mein name ist: " + name + " und bin " + age + " alt" + " mit der Fellfarbe " + furColor);
    }

    //Getter and Setter für alle Variablen (Kapselung)
    public String getName() {
        return name;
    }
    
    //mit dem IF kann ich den Namen nicht ändern der bleibt der gleiche wie im Konstrukter. So kann man den Zugriff von dritten Beschränken
    public void setName(String name) {
        if(false){
        this.name = name;
        
    }}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    
}
