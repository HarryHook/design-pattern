package com.coderunning.fun;

public class Game {

    private int itsScore;
    private int[] itsThrows = new int[21];
    private int itsCurrentThrow = 0;

    private int itsCurrentFrame = 1;

    private Boolean firstThrow = true;


    public int score() {
        return scoreForFrame(getCurrentFrame()-1);
    }

    public void add(int pins) {
        itsThrows[itsCurrentThrow++] = pins;
        this.itsScore += pins;
        adjustCurrentFrame(pins);
    }


    public int scoreForFrame(int frame) {
        int score = 0;
        int ball = 0;
        for (int currentFrame = 0; currentFrame < frame; currentFrame++) {
            int firstThrow = itsThrows[ball++];
            if (firstThrow == 10) {
                int secondThrow = itsThrows[ball];
                score += 10 + secondThrow + itsThrows[ball+1];
            } else {
                int secondThrow = itsThrows[ball++];
                int frameScore = firstThrow + secondThrow;
                if(frameScore == 10) {
                    score += frameScore + itsThrows[ball];
                } else {
                    score += frameScore;
                }
            }
        }
        return score;
    }

    public int getCurrentFrame() {
        return this.itsCurrentFrame;
    }

    private void adjustCurrentFrame(int pins) {
        if (firstThrow) {
            if(pins == 10) {
                itsCurrentFrame++;
            } else {
                firstThrow = false;
            }
        } else {
            firstThrow = true;
            itsCurrentFrame++;
        }
        //
        itsCurrentFrame = Math.min(itsCurrentFrame, 11);
    }


}
