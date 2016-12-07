import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

/**
 * Created by saoprb on 12/7/2016.
 */
public class JavaOnePointEightFeatures {

    public void MapFilterReduceParallelArrays () {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        //ParallelArray students = new ParallelArray<forkJoinPool, >

        Stream.generate(() -> Math.random());
        Stream.iterate(1, i -> i + 1);
    }
}
