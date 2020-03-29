package ru.lesson.lessons.lesson_13;

public interface SuperLogic {

    /**
     * загружакем поле по которому делаем вычисление
     * @param cells
     */
    void loadBoard(Cell[][] cells);

    /**
     * проверяеп нужно ди бахну?
     * передам клетку и вычисляем что нужно  сней сделать
     * @param x
     * @param y
     * @return
     */
    boolean shouldBang(int x, int y);

    /**
     * проверяем разгадали аользователь все поле.
     * если разгадал то поздравляем еого
     * @return
     */
    boolean finish();

    /**
     * предположение пользователя
     * @param x
     * @param y
     * @param bomb
     */
    void suggest(int x, int y, boolean bomb);
}
