import java.io.*;
/*
PREPCODE

METHOD String checkYourself(String userGuess)
    GET the user guess as a String parameter
    CONVERT the user guess to an int
    REPEAT with each of the location cells in the int array
        COMPARE the user guess to the location cell
        IF the user guess matches
            INCREMENT number of hits
            FIND OUT if it was the last location cell
            IF number of hits is 3, RETURN "Kill" as the result
            ELSE it was not a kill, so RETURN "Hit"
            END IF
        ELSE the user guess didn't match, so RETURN "Miss"
        END IF
    END REPEAT
END METHOD
*/

// TEST CODE
public class SimpleDotComTestDrive
{
    public static void main (String[] args)
    {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        // String userGuess = "2";
        // String result = dot.checkYourself(userGuess);
        // String testResult = "failed";

        // if(result.equals("hit"))
        // {
        //     testResult = "passed";
        // }

        // System.out.println(testResult);

        while(isAlive == true)
        {
            String guess = helper.getUserInput("Enter a number: ");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;

            if(result.equals("kill"))
            {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}


class SimpleDotCom
{
    int[] locationCells;
    int numOfHits = 0;

        public void setLocationCells(int[] locs)
        {
            locationCells = locs;
        }

        public String checkYourself(String stringGuess)
        {
            int guess = Integer.parseInt(stringGuess);
            String result = "miss";

            for(int cell : locationCells)
            {
                if(guess == cell)
                {
                    result = "hit";
                    numOfHits++;
                    break;
                }
            }

            if(numOfHits == locationCells.length)
            {
                result = "kill";
            }

            System.out.println(result);
            return result;
        }
}

class GameHelper
{
    public String getUserInput(String prompt)
    {
        String inputLine  = null;
        System.out.print(prompt + " ");
        try
        {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            
            if(inputLine.length() == 0) return null;
        } 
        catch (IOException e)
        {
            System.out.println("IOException: " + e);
        }

        return inputLine;
    }
}