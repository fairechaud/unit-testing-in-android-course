package com.techyourchance.unittestingfundamentals.exercise1;

import com.techyourchance.unittestingfundamentals.example1.PositiveNumberValidator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class NegativeNumberValidatorTest {

    NegativeNumberValidator SUT;

    @Before
    public void setUp()  { SUT = new NegativeNumberValidator(); }

    @Test
    public void negative_zero_returnsFalse() {
        boolean result = SUT.isNegative(0);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void negative_positive_returnsFalse() {
        boolean result = SUT.isNegative(1);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void negative_negative_returnsTrue() {
        boolean result = SUT.isNegative(-1);
        Assert.assertThat(result, is(true));
    }
}