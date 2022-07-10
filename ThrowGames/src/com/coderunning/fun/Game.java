package com.coderunning.fun;

public class Game {

    private int itsCurrentFrame = 1;

    private Score iteratorScore = new Score();
    private Boolean firstThrowInFrame = true;


    public int score() {
        return scoreForFrame(itsCurrentFrame);
    }

    public void add(int pins) {
        iteratorScore.addThrow(pins);
        adjustCurrentFrame(pins);
    }

    private void adjustCurrentFrame(int pins) {
        if (lastBallInFrame(pins)) {
            advanceFrame();
        } else {
            firstThrowInFrame = false;
        }
    }

    private boolean lastBallInFrame(int pins) {
        return strike(pins) || !firstThrowInFrame;
    }

    private boolean strike(int pins) {
        return firstThrowInFrame && pins == 10;
    }

    private void advanceFrame() {
        itsCurrentFrame = Math.min(itsCurrentFrame + 1, 10);
    }

    public int scoreForFrame(int frame) {

        return iteratorScore.scoreForFrame(frame);
    }



}
