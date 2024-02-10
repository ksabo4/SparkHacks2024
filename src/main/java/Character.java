

public class Character {
    private double money;
    private int age;
    private int happiness;
    private double investments;
    private String job;
    private boolean college;

    Character() {
        money = 0.0;
        age = 5;
        happiness = 50;
        investments = 0.0;
        job = "";
        college = false;
    }
    void addMoney() {
        if(age < 18) {
            money += 100;
        }
    }

    double getMoney() {
        return money;
    }

    int getAge() {
        return age;
    }

    int getHappiness() {
        return happiness;
    }

    double getInvestments() {
        return investments;
    }

    String getJob() {
        return job;
    }

    void progressTime() {
        age++;
        addMoney();
        investments *= 1.1;
    }
    
    void invest(double userInvest) {
        investments += userInvest;
        money -= userInvest;
    }

    void withdrawInvestments(double withdrawAmount) {
        if(withdrawAmount > investments) {
            return;
        }
        investments -= withdrawAmount;
        money += withdrawAmount;
    }

    void gamble(int userGamble) {
        money = money - userGamble;
        int rand = (int)(Math.random() * 100);

        if(rand == 100) {
            money += userGamble * 5;
        }
        else if(rand > 80 && rand < 99) {
            money += userGamble;
        }
    }
}