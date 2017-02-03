package io.muic.ooc.Commands;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karn806 on 2/4/17.
 */
public class CommandParserTest {
    @Test
    public void getCommand() throws Exception {
        assertEquals(CommandParser.getCommand("quit").getClass(), new ExitCommand().getClass());
        assertEquals(CommandParser.getCommand("go").getClass(), new WalkCommand().getClass());
        assertEquals(CommandParser.getCommand("take").getClass(), new TakeCommand().getClass());
        assertEquals(CommandParser.getCommand("use").getClass(), new UseCommand().getClass());
        assertEquals(CommandParser.getCommand("info").getClass(), new InfoCommand().getClass());
        assertEquals(CommandParser.getCommand("help").getClass(), new HelpCommand().getClass());
    }

}