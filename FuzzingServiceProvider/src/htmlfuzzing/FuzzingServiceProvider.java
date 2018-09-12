package htmlfuzzing;

import htmlfuzzing.spi.HtmlFuzzer;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author ghoshabhi on 9/12/18
 * @project cs603-hw2-v4
 */
public class FuzzingServiceProvider {
    private ServiceLoader<HtmlFuzzer> serviceLoader;
    private static FuzzingServiceProvider provider;

    public FuzzingServiceProvider() {
        serviceLoader = ServiceLoader.load(HtmlFuzzer.class);
        serviceLoader.forEach(System.out::println);
    }

    public static FuzzingServiceProvider getServiceProvider() {
        if(provider == null) {
           provider = new FuzzingServiceProvider();
        }
        return provider;
    }

    public String getFuzzedString(String htmlString) {
        Iterator<HtmlFuzzer> fuzzerIterator = serviceLoader.iterator();

        System.out.println("hasNext: " + fuzzerIterator.hasNext());

        while(fuzzerIterator.hasNext()) {
            System.out.println("next(): " + fuzzerIterator.next());
        }

        return htmlString;
    }
}
