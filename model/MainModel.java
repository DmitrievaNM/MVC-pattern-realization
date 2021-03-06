package MVC-pattern-realization-master.model;

import MVC-pattern-realization-master.bean.User;
import MVC-pattern-realization-master.model.service.UserService;
import MVC-pattern-realization-master.model.service.UserServiceImpl;

import java.util.*;

public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    public ModelData getModelData() { return modelData; }

    public void loadUsers() {
        List<User> users = getAllUsers();
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(false);
    }

    public void loadDeletedUsers() {
        List<User> users = userService.getAllDeletedUsers();
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(true);
    }

    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        modelData.setActiveUser(user);
    }

    public void deleteUserById(long userId) {
        userService.deleteUser(userId);
        modelData.setUsers(getAllUsers());
    }

    private List<User> getAllUsers() {
        List<User> users = userService.getUsersBetweenLevels(1, 100);
        return userService.filterOnlyActiveUsers(users);
    }

    public void changeUserData(String name, long id, int level) {
        User user = userService.createOrUpdateUser(name, id, level);
        modelData.setUsers(getAllUsers());
    }
}
