package module_02.practise_work;

class User {
    public String name;
    public String email;
    public String role;

    public User (String name, String email, String role) {
        this.name= name;
        this.email= email;
        this.role= role;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
