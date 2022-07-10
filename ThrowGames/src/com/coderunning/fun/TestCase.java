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
        Game game = new Game();
        game.add(5);
        assertEquals(5, game.score());
        assertEquals(1, game.getCurrentFrame());
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
        game.add(3);
        game.add(1);
        assertEquals(20, game.score());
        assertEquals(9, game.scoreForFrame(1));
        assertEquals(20, game.scoreForFrame(2));
        assertEquals(3, game.getCurrentFrame());

    }

    @Test
    public void testSimpleSpare() {
        game.add(10);
        game.add(3);
        game.add(6);
        assertEquals(19, game.scoreForFrame(1));
        assertEquals(28, game.score());
    }

    @Test
    public void testAllThrow() {
        for (int i = 0; i < 9; i++) {
            game.add(0);
            game.add(0);
        }
        game.add(8);
        game.add(2);
        game.add(10);
        assertEquals(20, game.score());
//        assertEquals(11, game.getCurrentFrame());

    }

    @Test
    public void testHeartBreak() {
        for (int i = 0; i < 9; i++) {
            game.add(10);
        }
        game.add(9);
        game.add(1);
        game.add(1);
        assertEquals(270, game.score());

    }
}
