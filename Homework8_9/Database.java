package Homework8_9;

public class Database {

    User[] users;

    public Database(int usersAmount) {
        if (usersAmount <= 10) {
            this.users = new User[usersAmount];
        }

    }

    public User[] getUsers() {
        return users;

    }

    public boolean checkIfUserExists(String user){
        for(int i = 0; i <= users.length; i++){
            if(users[i] == null){
                return false;
            }

        }

        return  true;
    }
}
