package htmlfuzzing;

import htmlfuzzing.spi.HtmlFuzzer;

/**
 * @author ghoshabhi on 9/12/18
 * @project cs603-hw2-v4
 */
public class TagReplacer implements HtmlFuzzer {
    @Override
    public String fuzz(String htmlString) {
        System.out.println("Hi from Tag Replacer");
        return htmlString;
    }
}
