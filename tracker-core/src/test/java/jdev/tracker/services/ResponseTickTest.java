package jdev.tracker.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class ResponseTickTest {

    @Test
    public void resptest() throws Exception{
        ResponseTick responseTick=new ResponseTick();
        responseTick.run();
        assertEquals("ResponseTick", responseTick.getClass().getSimpleName());
    }
}