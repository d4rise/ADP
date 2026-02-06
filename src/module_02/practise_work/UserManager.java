package module_02.practise_work;
import java.util.ArrayList;
import java.util.List;

class UserManager {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                users.remove(user);
                break;
            }
        }
    }

    public void updateUser(String email, String newName, String newRole) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                user.setName(newName);
                user.setRole(newRole);
                break;
            }
        }
    }
}
