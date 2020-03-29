package ru.lesson.lessons.lesson_13;

public interface Cell<T> {

    /**
     * является ли это бомба
     * @return
     */
    boolean isBomb();

    /**
     * пользователь предположил что это бомба
     * @return
     */
    boolean isSuggestBomb();

    /**
     * пользователь предположил что это пустая клетка
     * @return
     */
    boolean isSuggestEmpty();

    /**
     * устанавливает пустое значение
     */
    void suggestEmpty();

    /**
     * устанавливает значение бомба
     */
    void suggestBomb();

    /**
     * рисование значения
     * @param paint
     * @param real
     */
    void draw(T paint, boolean real);

}
