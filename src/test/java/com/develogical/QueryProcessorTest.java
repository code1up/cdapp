package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.StringContains.containsString;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutProgramming() throws Exception {
        assertThat(queryProcessor.process("programming"), containsString("computing"));
    }

    // what%20is%2018%20plus%205

    @Test
    // public void returnsLargestNumberInQuery() throws Exception {
    //     assertThat(queryProcessor.process("a963738dskjhdkjd: -- which of the following numbers -- 875  sds ,93  ds  s,  ds d 27,223"), is("875"));
    // }

    @Test
    public void returnsSumOfTwoNumbers() throws Exception {
        assertThat(queryProcessor.process("a963738dskjhdkjd: -- what is -- 875  sds ,93  ds  s,  ds d 27,223"), is("1218"));
    }
}
