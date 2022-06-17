package bowling_game;

public class Frame {
    //?Pratik Sherdiwala (Codelytics)

    private int rollOnePinKnockDown;
    private int rollTwoPinKnockDown;
    private int rollThreePinKnockDown;

    private int absoluteScoreOfGame;
    private int totalScoreOfGame;
    private int cumulativeScore;

    private boolean isFrameStrike;
    private boolean isFrameSpare;

    private boolean isLastStrikeFrame;

    private boolean isFirstUpdated;
    private boolean isSecondUpdated;

    public int getRollOnePinKnockDown() {
        return rollOnePinKnockDown;
    }

    public void setRollOnePinKnockDown(int rollOnePinKnockDown) {
        this.rollOnePinKnockDown = rollOnePinKnockDown;
    }

    public int getRollTwoPinKnockDown() {
        return rollTwoPinKnockDown;
    }

    public void setRollTwoPinKnockDown(int rollTwoPinKnockDown) {
        this.rollTwoPinKnockDown = rollTwoPinKnockDown;
    }

    public int getRollThreePinKnockDown() {
        return rollThreePinKnockDown;
    }

    public void setRollThreePinKnockDown(int rollThreePinKnockDown) {
        this.rollThreePinKnockDown = rollThreePinKnockDown;
    }

    public int getAbsoluteScoreOfGame() {
        return absoluteScoreOfGame;
    }

    public void setAbsoluteScoreOfGame(int absoluteScoreOfGame) {
        this.absoluteScoreOfGame = absoluteScoreOfGame;
    }

    public int getTotalScoreOfGame() {
        return totalScoreOfGame;
    }

    public void setTotalScoreOfGame(int totalScoreOfGame) {
        this.totalScoreOfGame = totalScoreOfGame;
    }

    public int getCumulativeScore() {
        return cumulativeScore;
    }

    public void setCumulativeScore(int cumulativeScore) {
        this.cumulativeScore = cumulativeScore;
    }

    public boolean isFrameStrike() {
        return isFrameStrike;
    }

    public void setFrameStrike(boolean frameStrike) {
        isFrameStrike = frameStrike;
    }

    public boolean isFrameSpare() {
        return isFrameSpare;
    }

    public void setFrameSpare(boolean frameSpare) {
        isFrameSpare = frameSpare;
    }

    public boolean isLastStrikeFrame() {
        return isLastStrikeFrame;
    }

    public void setLastStrikeFrame(boolean lastStrikeFrame) {
        isLastStrikeFrame = lastStrikeFrame;
    }

    public boolean isFirstUpdated() {
        return isFirstUpdated;
    }

    public void setFirstUpdated(boolean firstUpdated) {
        isFirstUpdated = firstUpdated;
    }

    public boolean isSecondUpdated() {
        return isSecondUpdated;
    }

    public void setSecondUpdated(boolean secondUpdated) {
        isSecondUpdated = secondUpdated;
    }
}
