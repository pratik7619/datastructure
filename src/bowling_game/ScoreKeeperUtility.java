package bowling_game;

import java.util.Scanner;

public class ScoreKeeperUtility {
    //?Pratik Sherdiwala (Codelytics)

    private Game game = new Game();

    void startGame() {
        System.out.println("Welcome to Bowling Game");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            Frame frame = new Frame();

            int firstHit = 0;
            int secondHit = 0;
            int thirdHit = 0;

            System.out.println("\n\nYour " + (i + 1) + " frame is started");
            System.out.println("Please enter the number of pins knocked down in First Roll of the " + (i + 1) + "(th) Frame ");

            firstHit = sc.nextInt();
            frame.setRollOnePinKnockDown(firstHit);
            update(i, firstHit);

            if (firstHit == 10 && i != 9) {
                System.out.println("This is s STRIKE !! Your " + (i + 1) + "(th) Frame ends.");
                frame.setFrameStrike(true);
                frame.setTotalScoreOfGame(-99);
            } else {
                System.out.println("Please enter the number of pins knocked down in Second Roll of the " + (i + 1) + "(th) Frame ");
                secondHit = sc.nextInt();
                frame.setRollTwoPinKnockDown(secondHit);
                update(i, secondHit);
            }

            if (firstHit < 10 && secondHit < 10 && (firstHit + secondHit) == 10) {

                frame.setFrameSpare(true);
                System.out.println("Your " + (i + 1) + "(th) Frame is a SPARE !!");
                frame.setTotalScoreOfGame(-88);
            }

            if (firstHit == 10 && i == 9) {
                System.out.println("You hit a STRIKE in the last frame.You get an extra roll.");
                System.out.println("Please enter the number of pins knocked down in Third Roll of the 10(th) Frame ");
                thirdHit = sc.nextInt();
                frame.setRollThreePinKnockDown(thirdHit);
            }

            if ((firstHit + secondHit) == 10 && i == 9) {
                System.out.println("You hit a SPARE in the last frame.You get an extra roll.");
                System.out.println("Please enter the number of pins knocked down in Third Roll of the 10(th) Frame ");
                thirdHit = sc.nextInt();
                frame.setRollThreePinKnockDown(thirdHit);
            }
        }
    }

    private void update(int index, int pinsHit) {
        for (int i = index - 1; index >= 0; index--) {

            Frame currentFrame = game.getFrames()[i];

            if (currentFrame.isFrameStrike() && currentFrame.getTotalScoreOfGame() == -99) {
                currentFrame.setFirstUpdated(true);
                currentFrame.setAbsoluteScoreOfGame(pinsHit + 10);
            }
        }
    }
}
