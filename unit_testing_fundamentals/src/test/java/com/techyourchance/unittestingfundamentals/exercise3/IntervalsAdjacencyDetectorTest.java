package com.techyourchance.unittestingfundamentals.exercise3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

import com.techyourchance.unittestingfundamentals.example3.Interval;

public class IntervalsAdjacencyDetectorTest {

    IntervalsAdjacencyDetector SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new IntervalsAdjacencyDetector();
    }

    //int2 before int1, no adjacency nor overlapping
    @Test
    public void isAdjacent_int2BeforeInt1NoAdjacency_falseReturned() {
        Interval interval2 = new Interval(-2,4);
        Interval interval1 = new Interval(6,10);
        boolean result  = SUT.isAdjacent(interval1,interval2);
        Assert.assertThat(result, is(false));
    }

    //int1 before int2, adjacent
    @Test
    public void isAdjacent_int1BeforeInt2_trueReturned() {
        Interval interval1 = new Interval(-1,3);
        Interval interval2 = new Interval(3,6);
        boolean result  = SUT.isAdjacent(interval1,interval2);
        Assert.assertThat(result, is(true));
    }

    //int1 and int2 overlap on start
    @Test
    public void isAdjacent_int1OverlapsInt2End_falseReturned() {
        Interval interval1 = new Interval(-1,3);
        Interval interval2 = new Interval(2,6);
        boolean result  = SUT.isAdjacent(interval1,interval2);
        Assert.assertThat(result, is(false));
    }

    //int2 within int1, adjacency on end
    @Test
    public void isAdjacent_int1ContainsInt2EndAdjacency_falseReturned() {
        Interval interval1 = new Interval(-2,4);
        Interval interval2 = new Interval(0,4);
        boolean result  = SUT.isAdjacent(interval1,interval2);
        Assert.assertThat(result, is(false));
    }

    //int1 = int2
    @Test
    public void isAdjacent_int1SameAsInt2_falseReturned() {
        Interval interval1 = new Interval(-1,3);
        Interval interval2 = new Interval(-1,3);
        boolean result  = SUT.isAdjacent(interval1,interval2);
        Assert.assertThat(result, is(false));
    }



    //int2 before int1, adjacent
    @Test
    public void isAdjacent_int2BeforeInt1_trueReturned() {
        Interval interval2 = new Interval(-1,5);
        Interval interval1 = new Interval(5,10);
        boolean result  = SUT.isAdjacent(interval1,interval2);
        Assert.assertThat(result, is(true));
    }



    //int2 and int1 overlap on start
    @Test
    public void isAdjacent_int2OverlapsInt1Start_falseReturned() {
        Interval interval2 = new Interval(-1,5);
        Interval interval1 = new Interval(3,6);
        boolean result  = SUT.isAdjacent(interval1,interval2);
        Assert.assertThat(result, is(false));
    }

    //int2 within int1, no adjacent boundaries
    @Test
    public void isAdjacent_int1ContainsInt2NoAdjacency_falseReturned() {
        Interval interval1 = new Interval(-2,4);
        Interval interval2 = new Interval(0,1);
        boolean result  = SUT.isAdjacent(interval1,interval2);
        Assert.assertThat(result, is(false));
    }

    //int2 within int1, adjacency on start
    @Test
    public void isAdjacent_int1ContainsInt2StartAdjacency_falseReturned() {
        Interval interval1 = new Interval(-2,4);
        Interval interval2 = new Interval(-2,1);
        boolean result  = SUT.isAdjacent(interval1,interval2);
        Assert.assertThat(result, is(false));
    }



    //int1 before int2, no adjacency nor overlapping
    @Test
    public void isAdjacent_int1BeforeInt2NoAdjacency_falseReturned() {
        Interval interval1 = new Interval(-2,4);
        Interval interval2 = new Interval(6,10);
        boolean result  = SUT.isAdjacent(interval1,interval2);
        Assert.assertThat(result, is(false));
    }

    //int1 after int2, no adjacency nor overlapping
    @Test
    public void isAdjacent_int1AfterInt2NoAdjacency_falseReturned() {
        Interval interval1 = new Interval(12,14);
        Interval interval2 = new Interval(6,10);
        boolean result  = SUT.isAdjacent(interval1,interval2);
        Assert.assertThat(result, is(false));
    }


}