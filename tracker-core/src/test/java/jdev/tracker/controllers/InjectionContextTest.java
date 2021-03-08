package jdev.tracker.controllers;

import jdev.tracker.services.GPSservice;
import jdev.tracker.services.Msgqueueservice;
import jdev.tracker.services.Msgsendservice;
import jdev.tracker.services.ResponseTick;
import org.junit.Test;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@TestConfiguration
public class InjectionContextTest {

    @Test
    public void gpstest() throws Exception {
        GPSservice gpservice = new GPSservice();
        assertEquals("GPSservice",gpservice.getClass().getSimpleName().toString());
    }

    @Test
    public void queuetest() throws Exception {
        Msgqueueservice queue = new Msgqueueservice();
        assertEquals("Msgqueueservice",queue.getClass().getSimpleName().toString());
    }

    @Test
    public void sendtest() throws Exception {
        Msgsendservice send = new Msgsendservice();
        assertEquals("Msgsendservice",send.getClass().getSimpleName().toString());
    }

    @Test
    public void resptest() throws Exception {
        ResponseTick resp = new ResponseTick();
        assertEquals("ResponseTick",resp.getClass().getSimpleName().toString());
    }

    @Test
    public void schedtest() throws Exception {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        assertEquals("ThreadPoolTaskScheduler",scheduler.getClass().getSimpleName().toString());
    }


}