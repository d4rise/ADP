package module_02.practise_work;

public class Test {
    public static void main (String[] args) {
        UserManager manager = new UserManager();

        manager.addUser(new User("Darkhan", "darkhanalmighty@gmail.com", "User"));
        manager.addUser(new User("Yerza", "belovedmypillow@gmail.com", "Admin"));

        manager.updateUser("belovedmypillow@gmail.com", "Yerazamat T", "Admin");
        manager.removeUser("adarkhanalmightylice@gmail.com");
    }

}
