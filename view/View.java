package MVC-pattern-realization-master.view;

import MVC-pattern-realization-master.controller.Controller;
import MVC-pattern-realization-master.model.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
