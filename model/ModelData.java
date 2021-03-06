package MVC-pattern-realization-master.model;

import MVC-pattern-realization-master.bean.User;

import java.util.*;

public class ModelData {
    private User activeUser;
    private boolean displayDeletedUserList;

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User acticeUser) {
        this.activeUser = acticeUser;
    }

    private List<User> users = new LinkedList<User>();


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}
