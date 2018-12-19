package MVC-pattern-realization-master.view;

import MVC-pattern-realization-master.controller.Controller;
import MVC-pattern-realization-master.model.ModelData;
import MVC-pattern-realization-master.bean.User;

import java.util.List;

public class UsersView implements View {
    private Controller controller;

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void refresh(ModelData modelData) {
        if (modelData.isDisplayDeletedUserList())
            System.out.println("All deleted users:");
        else
            System.out.println("All users:");

        List<User> users = modelData.getUsers();

        for (User user : users) {
            System.out.println("\t"+user);
        }

        System.out.println("===================================================");
    }

    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() { controller.onShowAllDeletedUsers(); }

    public void fireEventOpenUserEditForm(long id) { controller.onOpenUserEditForm(id); }
}
