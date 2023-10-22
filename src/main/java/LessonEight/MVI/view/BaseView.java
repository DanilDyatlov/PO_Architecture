package LessonEight.MVI.view;

import LessonEight.MVI.model.ViewState;
import LessonEight.MVI.model.*;

/**
 * BaseView - базовый интерфейс для всех видов.
 */
public interface BaseView {
    void render(ViewState state);
}
