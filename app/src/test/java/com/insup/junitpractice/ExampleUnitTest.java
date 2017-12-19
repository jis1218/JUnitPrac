package com.insup.junitpractice;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainActivity mainActivity;
    @Before
    public void init(){
        mainActivity = new MainActivity();
    }

    @Test
    public void addition_isCorrect() throws Exception {
//        assertEquals(4, 2 + 2);
        List<Integer> data = mainActivity.getData();
        assertEquals(99, data.size());
    }
}