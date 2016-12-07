import org.junit.Test;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by saoprb on 12/7/2016.
 */
public class JavaOnePointEightFeaturesTest {

    @Test
    public void streamIterateForEachTest() {
        Consumer<Integer> total = t -> { t += t; System.out.print(t); };

        Stream.iterate(1, i -> i + 1).limit(20).forEach(System.out::print);
        System.out.println("");
        System.out.println("Done: streamIterateForEachTest");

        Stream.iterate(1, i -> i + 1).limit(5).forEach(total);
        System.out.println("");
        System.out.println("Done: streamIterateForEachTest");

        Stream.iterate(1, i -> i + 1).limit(5).forEach(t -> { t += t; System.out.print(t); });
        System.out.println("");
        System.out.println("Done: streamIterateForEachTest");

    }
}
