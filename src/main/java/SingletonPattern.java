import java.io.*;

/**
 * Created by saoprb on 11/28/2016.
 */
public class SingletonPattern {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonSerializedThreadSafe instance1 = SingletonSerializedThreadSafe.getInstance();
        SingletonSerializedThreadSafe instance2 = SingletonSerializedThreadSafe.getInstance();

        System.out.format("instance1 %s: %s%n",instance1.getClass().getName(), instance1.getClass().hashCode());
        System.out.format("instance2 %s: %s%n",instance2.getClass().getName(), instance2.getClass().hashCode());

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SingletonSerializedThreadSafe.ser"));
        out.writeObject(instance1);
        out.close();

        ObjectInput input = new ObjectInputStream(new FileInputStream("SingletonSerializedThreadSafe.ser"));
        SingletonSerializedThreadSafe instance3 = (SingletonSerializedThreadSafe) input.readObject();
        input.close();

        System.out.format("instance1 %s: %s%n",instance1.getClass().getName(), instance1.getClass().hashCode());
        System.out.format("instance3 %s: %s%n",instance3.getClass().getName(), instance3.getClass().hashCode());

        new File("SingletonSerializedThreadSafe.ser").delete();

        SingletonDoubleLockCheck instanceDLC1 = SingletonDoubleLockCheck.getInstance();
        SingletonDoubleLockCheck instanceDLC2 = SingletonDoubleLockCheck.getInstance();

        System.out.format("instanceDLC1 %s: %s%n",instanceDLC1.getClass().getName(), instanceDLC1.getClass().hashCode());
        System.out.format("instanceDLC2 %s: %s%n",instanceDLC2.getClass().getName(), instanceDLC2.getClass().hashCode());
    }
}
