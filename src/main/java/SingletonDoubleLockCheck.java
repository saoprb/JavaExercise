/**
 * Created by saoprb on 11/28/2016.
 */
public class SingletonDoubleLockCheck {

    private SingletonDoubleLockCheck() {}

    private static SingletonDoubleLockCheck instance = null;

    public static SingletonDoubleLockCheck getInstance() {
        if (null == instance) {
            synchronized (SingletonDoubleLockCheck.class) {
                if (null == instance) {
                    instance = new SingletonDoubleLockCheck();
                }
            }
        }
        return instance;
    }
}
