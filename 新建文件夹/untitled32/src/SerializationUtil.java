import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SerializationUtil {

    public static void writeUsersToFile(List<User> users, String filePath) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(filePath)))) {
            out.writeObject(users);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<User> readUsersFromFile(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(filePath)))) {
            return (List<User>) in.readObject();
        }
    }
}