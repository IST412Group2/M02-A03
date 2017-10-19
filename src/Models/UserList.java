/* TODO
 * 
 * ADD IMPLEMENTATION FOR SERIALIZATION
 */

package Models;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;
    
    public UserList() {
        users = new ArrayList<User>();
        populateUsers();
    }

    public boolean addUser(User newUser) {
        // check if user already exists
        if (getUser(newUser.getName()) == null){
            users.add(newUser);
            return true;
        } else return false;
    }
    public User getUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equalsIgnoreCase(name)) return users.get(i);
        }
        return null;
    }
    public boolean removeUser(String name) {
        if (getUser(name) == null) return false;
        else return users.remove(getUser(name));
    }
    /* 
     * REWRITE CODE TO USE SERIALIZATION
    */
    private void populateUsers() {
        users.add(new User("Michael Heuzey", "mheuzey", "mheuzey"));
        users.add(new User("Matt Abazia", "mabazia", "mabazia"));
        users.add(new User("Erik Galloway", "egalloway", "egalloway"));
    }
}
