package messanger;

public class Client {
    private static int id = 0;
    private static String fullName = null;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Client.id = id;
    }

    public static String getFullName() {
        return fullName;
    }

    public static void setFullName(String fullName) {
        Client.fullName = fullName;
    }
}
