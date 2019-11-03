package com.helixleisure.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * The Class BookingBossApplicationTests.
 * 
 * @author munikumarchallagulla
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookingBossApplication.class)
public class BookingBossApplicationTests {

    /**
     * Context loads.
     */
    @Test
    public void contextLoads() {
    }
    
    /**
     * Main.
     */
    @Test
    public void main() {
    	BookingBossApplication.main(new String[] {});
    }
}