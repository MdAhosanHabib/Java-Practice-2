package chapter4;

public class Level1_5 {
    public static void main(String[] args)
    {
        PairOfDice die;          // A variable that will refer to the dice.
           int rollCount;    // Number of times the dice have been rolled.
     
           die = new PairOfDice();  // Create the PairOfDice object.
           rollCount = 0;
           
           /* Roll the dice until they come up snake eyes. */
           
           do {
               die.roll();
               System.out.println("The dice come up " + die.getDie1() 
                                                + " and " + die.getDie2());
               rollCount++;
           } while (die.getTotal() != 2);
           
           /* Report the number of rolls. */
           
           System.out.println("\nIt took " + rollCount + " rolls to get a 2.");
           
    }
    
}
