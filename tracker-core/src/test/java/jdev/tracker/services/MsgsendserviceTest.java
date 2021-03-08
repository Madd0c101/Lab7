package jdev.tracker.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class MsgsendserviceTest {

    @Test
    public void sendtest() throws Exception {
        Msgsendservice msgsendservice = new Msgsendservice();
msgsendservice.send();
        assertEquals("Msgsendservice", msgsendservice.getClass().getSimpleName());
        assertEquals("connection lost", Msgsendservice.request.getCoord());

    }

}