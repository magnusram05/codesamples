package blogs.medium.magnusram05;

public class App 
{
    /* Reader Thread */
    public static void main( String[] args )
    {
        Clock clock = new Clock();
        clock.start();
        System.out.println(clock.getCurrentTime());
        while(true){
            System.out.println(clock.getCurrentTime());
            try {
                Thread.sleep(1000); //Read time every 1 second
            } catch (InterruptedException ex){
                System.out.println("Reader thread interrupted" + ex.getMessage());
            }
        }
    }
}
