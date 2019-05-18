package me.moocar.logbackgelf.udp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GraylogClientMain {


    public static void main(String[] args) throws IOException, InterruptedException {

        Logger logger = LoggerFactory.getLogger(GraylogClientMain.class);

        for (; ; ) {

            TimeUnit.SECONDS.sleep(1);
            logger.error("test", new NullPointerException("123"));

        }

    }

}
