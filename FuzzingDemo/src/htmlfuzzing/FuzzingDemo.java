package htmlfuzzing;

/**
 * @author ghoshabhi on 9/12/18
 * @project cs603-hw2-v4
 */
public class FuzzingDemo {
    public static void main(String[] args) {
        FuzzingServiceProvider serviceProvider = FuzzingServiceProvider.getServiceProvider();
        String testString = "<html><body><div>Hi There!</div></body></html>";
        serviceProvider.getFuzzedString(testString);
    }
}
