package by.home.controller;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class DataReaderTest {

    private final static String TEST_FILE_PATH = "./src/test/resources/testFile.txt";
    private final static List<String>  expectedLines = Arrays.asList("2,2,5" , "5,10,-10" , "0,0,2" , "-8,8,5");

    @Test
    public void testReadShouldReturnLinesListWhenFileExists() throws DataException {
        // given

        DataReader reader = new DataReader();

        // when
        List<String> lines = reader.read(TEST_FILE_PATH);

        // then
        assertEquals(expectedLines, lines);

    }




    @Test (expected = DataException.class) //then
    public void testReadShouldReturnExceptiobWhenFileNotExists() throws  DataException {

        // given
        DataReader reader = new DataReader();

        // when
        List<String> lines = reader.read("Error file");

    }

}
