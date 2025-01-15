package JAVA101;
import java.util.Scanner;
public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Fighter firststarter;
    Fighter secondstarter;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.firststarter = firststarter;
        this.secondstarter = secondstarter;
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    void run() {
        if (Math.random() < 0.5) {
             firststarter = f1;
             secondstarter = f2;
        }else {
            firststarter = f2;
            secondstarter = f1;
        }
            if (isCheck()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("========YENİ ROUND========");
                    if (f1.equals(firststarter)) {
                        this.f2.health = this.f1.hit(f2);
                        this.f1.health = this.f2.hit(f1);
                        System.out.println(f1.name + " kalan canı: " + f1.health);
                        System.out.println(f2.name + " kalan canı: " + f2.health);
                    } else if (f2.equals(firststarter)) {
                        this.f1.health = this.f2.hit(f1);
                        this.f2.health = this.f1.hit(f2);
                        System.out.println(f1.name + " kalan canı: " + f1.health);
                        System.out.println(f2.name + " kalan canı: " + f2.health);
                    } else {
                        break;
                    }
                    if (isWin()) {
                        break;
                    }
                }

            } else {
                System.out.println("sporcuların sikletleri yarışmaya girmeye uygun değil.");
            }
        }
        boolean isWin () {
            if (this.f1.health == 0) {
                System.out.println("winner: " + this.f2.name);
                return true;
            }
            if (this.f2.health == 0) {
                System.out.println("winner: " + this.f1.name);
                return true;
            }
            return false;
        }
        }