// Kevin Chen
// 10/14/14
// CSE 02 Roulette
// determine the chance of betting one number in Roulette
//
public class Roulette{
    public static void main(String[] args) {
        int uNum = (int)(Math.random()*37);  // find a random number between 0 and 37
        // declare the variables
        int counter = 0;
        int matches = 0;
        int noMatch = 0;
        int simCounter = 0;
        int totalWin = 0;
        int profitCount = 0;
        double aveWin = 0;
        while(simCounter <1000){  // run the simulation 1000 times
            while(counter < 100){  // simulate the 1$ bet 100 times
                int rouNum = (int)(Math.random()*37);
                if(rouNum == uNum){
                    matches = matches + 1;
                }
                counter++;
            }
            if(matches == 0){  // find the number of times that you won nothing
                noMatch = noMatch +1;
            }
            if(matches >= 3){  // find the number of times you profited
                profitCount = profitCount +1;
            }
            totalWin = totalWin + matches;
            counter = 0;  // reset the counter
            matches = 0;  // reset the number of matches
            simCounter++;
        }
        int total = totalWin*36;  // calculate the total profit
        aveWin = (totalWin/1000);
        System.out.println("Your number is: " +uNum);
        System.out.println("Your total profit is: " +total);
        System.out.println("The number of times you won nothing is: " +noMatch);
        System.out.println("The number of times you walked away with profit is: " +profitCount);
    }
}