public class Character {
    private double money;
    private int age;
    private int happiness;
    private double[] investments = {0.0, 0.0, 0.0};
    private double goal;

    Character() {
        money = 0.0;
        age = 18;
        happiness = 50;
        goal = 100000;
    }
    void annualIncome(int amount) {
        money += amount;
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
        return investments[0] + investments[1] + investments[2];
    }

    double getGoal() {
        return goal;
    }

    void progressTime(int amount) {
        age++;
        annualIncome(amount);

        int counter = 0;
        for (double investment : investments) {
            double rate = Math.random() * (1.5 - 0.5) + 0.6;
            investment *= rate;
            investments[counter] = investment;
            counter += 1;
        }
    }

    void spend(int amount)
    {
        money -= amount;
    }

    void invest(double userInvest, int risk) {
        if (userInvest > money) {
            return;
        }
        investments[risk] += userInvest;
        money -= userInvest;
    }

    void withdrawInvestments(double withdrawAmount, int risk) {
        if(withdrawAmount > investments[risk]) {
            return;
        }
        investments[risk] -= withdrawAmount;
        money += withdrawAmount;

        if (withdrawAmount > 10000) {
            happiness += 10;
            if (happiness > 100) {
                happiness = 100;
            }
        }
    }

    void gamble(int userGamble) {
        money -= userGamble;
        int rand = (int)(Math.random() * 100);

        if(rand == 100) {
            money += userGamble * 5;
            happiness += 20;
        }
        else if(rand > 80 && rand < 99) {
            money += userGamble;
            happiness += 5;
        }
        else {
            happiness -= 30;
        }
        if (happiness < 0) {
            happiness = 0;
        } else if (happiness > 100) {
            happiness = 100;
        }
    }
    void work(float amount) {
        happiness -= 5;
        money += amount;
    }
}