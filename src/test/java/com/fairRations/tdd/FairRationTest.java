package com.fairRations.tdd;

import org.junit.Assert;
import org.junit.Test;

public class FairRationTest {

    @Test
    public void testFiveDistributionReturn4() throws Exception {
        FairRation ration = new FairRation();

        int people = 5;
        int[] distribution = {2, 3, 4, 5, 6};

        Assert.assertEquals("4", ration.generate(distribution, people));
    }

    @Test
    public void testTwoDistributionReturnNo() throws Exception {
        FairRation ration = new FairRation();

        int people = 2;
        int[] distribution = {1, 2};

        Assert.assertEquals("NO", ration.generate(distribution, people));
    }

    @Test
    public void testThreeDistributionReturnFour() throws Exception {
        FairRation ration = new FairRation();

        int breads = 3;
        int[] distribution = {1, 2, 3};

        Assert.assertEquals("4", ration.generate(distribution, breads));
    }

    @Test
    public void testSevenReturnEight() throws Exception {

        FairRation ration = new FairRation();
        int breads = 7;
        int[] distribution = {1, 2, 3, 4, 5, 6, 7};

        Assert.assertEquals("8", ration.generate(distribution, breads));
    }
}
