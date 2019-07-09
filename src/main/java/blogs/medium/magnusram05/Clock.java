package blogs.medium.magnusram05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock extends Thread {
    private volatile String currentTime;
    private static DateTimeFormatter ISO_DATE_TIME_FORMAT = DateTimeFormatter.ISO_DATE_TIME;

    public Clock(){
        currentTime = ISO_DATE_TIME_FORMAT.format(LocalDateTime.now());
    }

    public String getCurrentTime() {
        return currentTime;
    }

    /* Writer Thread */
    @Override
    public void run(){
        while(true){
            this.currentTime = ISO_DATE_TIME_FORMAT.format(LocalDateTime.now());
        }
    }
}
