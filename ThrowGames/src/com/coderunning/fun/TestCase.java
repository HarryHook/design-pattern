package com.coderunning.fun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {

    Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testAddOneThrow() {
        Frame frame = new Frame();
        frame.add(5);
        assertEquals(5, frame.getScore());
    }

    @Test
    public void testTwoThrowNoMark() {
        game.add(5);
        game.add(4);
        assertEquals(9, game.score());
        assertEquals(2, game.getCurrentFrame());
    }

    @Test
    public void testForThrowNoMark() {
        game.add(5);
        game.add(4);
        game.add(7);
        game.add(2);
        assertEquals(18, game.score());
        assertEquals(9, game.scoreForFrame(1));
        assertEquals(18, game.scoreForFrame(2));
        assertEquals(2, game.getCurrentFrame());

    }

    @Test
    public void testSimpleSpare() {
        game.add(5);
        game.add(5);
        game.add(3);
        game.add(3);
        assertEquals(13, game.scoreForFrame(1));
        assertEquals(16, game.score());
    }
}
