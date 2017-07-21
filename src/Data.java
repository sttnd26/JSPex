import java.util.ArrayList;

public class Data {
    private static ArrayList<User> users=new ArrayList<User>();
    private static Data ourInstance = new Data();

    public static Data getInstance() {
        return ourInstance;
    }

    public static void addUser(User user){
        users.add(user);
    }
    public static User getUser(String name,String pswd){
        for (int i = 0; i <users.size() ; i++) {
            if(users.get(i).getName().equals(name))
                if (users.get(i).getPswd().equals(pswd)) {
                    return users.get(i);
                }
        }
        return null;
    }
    private Data() {
    }
}
