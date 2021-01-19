package chapte6review;

import java.util.Random;
// from https://github.com/EricCharnesky/CIS1500-Fall2020-TT/blob/master/Project3/src/project3/PowerBallTicket.java
        
public class PowerBallTicket {
    private int[] whiteBalls;
    private int redBall;
    
    public PowerBallTicket()
    {
        Random random = new Random();
        whiteBalls = new int[] {0,0,0,0,0};
        
        whiteBalls[0] = random.nextInt(69) + 1;

        do {
            whiteBalls[1] = random.nextInt(69) + 1;
        } while (whiteBalls[1] == whiteBalls[0]);

        do {
            whiteBalls[2] = random.nextInt(69) + 1;
        } while (whiteBalls[2] == whiteBalls[0] || whiteBalls[2] == whiteBalls[1]);

        do {
            whiteBalls[3] = random.nextInt(69) + 1;
        } while (whiteBalls[3] == whiteBalls[0] || whiteBalls[3] == whiteBalls[1]
                || whiteBalls[3] == whiteBalls[2]);

        do {
            whiteBalls[4] = random.nextInt(69) + 1;
        } while (whiteBalls[4] == whiteBalls[0] || whiteBalls[4] == whiteBalls[1]
                || whiteBalls[4] == whiteBalls[2] || whiteBalls[4] == whiteBalls[3]);
        
        redBall= random.nextInt(26) + 1;
    }
    
    public PowerBallTicket(int[] whiteBalls, int redBall)
    {
        this.whiteBalls = whiteBalls;
        this.redBall = redBall;
    }
    
    public int getWinnings(PowerBallTicket winningTicket)
    {
        int numberOfWhiteMatches = 0;
        
        for ( int myWhiteBallIndex = 0; myWhiteBallIndex < whiteBalls.length; myWhiteBallIndex++)
        {
            for ( int winningWhiteBallIndex = 0; winningWhiteBallIndex < whiteBalls.length; winningWhiteBallIndex++)
            {
                if ( whiteBalls[myWhiteBallIndex] == winningTicket.whiteBalls[winningWhiteBallIndex])
                {
                    numberOfWhiteMatches++;
                }
            }
        }
        
        boolean redMatches = redBall == winningTicket.redBall;
        
        if (numberOfWhiteMatches == 5 && redMatches) {
            return 1_000_000_000;
        }
        if (numberOfWhiteMatches == 5) {
            return 1_000_000;
        }
        if (numberOfWhiteMatches == 4 && redMatches) {
            return 50_000;
        }
        if (numberOfWhiteMatches == 4) {
            return 100;
        }
        if (numberOfWhiteMatches == 3 && redMatches) {
            return 100;
        }
        if (numberOfWhiteMatches == 3) {
            return 7;
        }
        if (numberOfWhiteMatches == 2 && redMatches) {
            return 7;
        }

        // don't bother checking if numberOfWhiteMatches == 1 && redMatches
        if (redMatches) {
            return 4;
        }

        return 0;
    }
}
