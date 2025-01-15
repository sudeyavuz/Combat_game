package JAVA101;
import java.util.Scanner;
public class Fighter {
    String name;
    int power;
    int health;
    int weight;
    int dodge;

    Fighter(String name,int power,int health,int weight,int dodge){
        this.name = name;
        this.power = power;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;

    }
    int hit(Fighter foe){
        System.out.println(this.name+" vurdu "+foe.name+" "+this.power+" hasar aldı.");
        if (foe.isDodge()){
            System.out.println(foe.name+" gelen darbeyi blokladı");
            return foe.health;
        }
        if (foe.health-this.power<0){
            System.out.println(foe.name+" nakavt oldunuz");
            return 0;
        }
        return foe.health - this.power;

    }
    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber<=this.dodge;
    }

}
