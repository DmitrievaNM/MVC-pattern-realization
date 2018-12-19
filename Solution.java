package MVC-pattern-realization-master;

import MVC-pattern-realization-master.controller.Controller;
import MVC-pattern-realization-master.model.MainModel;
import MVC-pattern-realization-master.model.Model;
import MVC-pattern-realization-master.view.EditUserView;
import MVC-pattern-realization-master.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();
        EditUserView editUserView = new EditUserView();

        usersView.setController(controller);
        editUserView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("Sidorov", 126, 2);
        usersView.fireEventShowDeletedUsers();
    }
}
