package com.xja2.www;

import org.junit.Assert;

public class candoittest {

    public void addtest() {
        candoit ca = new candoit();
        int df = ca.add(3, 4);
        Assert.assertEquals(df, 6);

    }
}
