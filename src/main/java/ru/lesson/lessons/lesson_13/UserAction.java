package ru.lesson.lessons.lesson_13;

public interface UserAction {

    /**
     * инициализация игры
     */
    void initGames();

    /**
     * пользователь выбрал ячейку в которой он предполает есть бомба или нет бомбы
     * @param x
     * @param y
     * @param bomb
     */
    void select(int x, int y, boolean bomb);

}
