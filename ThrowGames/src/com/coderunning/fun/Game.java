package com.coderunning.fun;

public class Game {

    private int itsScore;
    private int[] itsThrows = new int[21];
    private int itsCurrentThrow = 0;

    private int itsCurrentFrame = 0;

    private Boolean firstThrow = true;


    public int score() {
        return itsScore;
    }

    public void add(int pins) {
        itsThrows[itsCurrentThrow++] = pins;
        this.itsScore += pins;
        adjustCurrentFrame();
    }


    public int scoreForFrame(int frame) {
        int score = 0;
        int ball = 0;
        for (int currentFrame = 0; currentFrame < frame; currentFrame++) {
            int firstThrow = itsThrows[ball++];
            int secondThrow = itsThrows[ball++];
            int fraeScore = firstThrow + secondThrow;
            if (fraeScore == 10) {
                score += fraeScore + itsThrows[ball++];
            } else {
                score += fraeScore;
            }
        }
        return score;
    }

    public int getCurrentFrame() {
        return itsCurrentFrame;
    }

    private void adjustCurrentFrame() {
        if (firstThrow) {
            firstThrow = false;
            itsCurrentFrame++;
        } else {
            firstThrow = true;
        }
    }


}
