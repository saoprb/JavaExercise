import java.io.Serializable;

/**
 * Created by saoprb on 11/28/2016.
 */
public class SingletonSerializedThreadSafe implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SingletonSerializedThreadSafe() {}

    private static class SingletonSerializedThreadSafeHelper {
        private static final SingletonSerializedThreadSafe instance = new SingletonSerializedThreadSafe();
    }

    public static SingletonSerializedThreadSafe getInstance() {
        return SingletonSerializedThreadSafeHelper.instance;
    }
}
