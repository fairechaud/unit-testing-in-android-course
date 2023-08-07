package com.techyourchance.unittestingfundamentals.exercise2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_singleCharacter_doubleA() {
        String result = SUT.duplicate("a");
        Assert.assertThat(result, is("aa"));
    }

    @Test
    public void duplicate_blank_blank() {
        String result = SUT.duplicate("");
        Assert.assertThat(result, is(""));
    }

    @Test
    public void duplicate_name_doubledName() {
        String result = SUT.duplicate("Fernando Rodriguez");
        Assert.assertThat(result, is("Fernando RodriguezFernando Rodriguez"));
    }

}