package htmlfuzzing.spi;

/**
 * @author ghoshabhi on 9/12/18
 * @project cs603-hw2-v4
 */
public interface HtmlFuzzer {
    String fuzz(String htmlString);
}
