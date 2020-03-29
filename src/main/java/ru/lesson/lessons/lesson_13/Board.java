package ru.lesson.lessons.lesson_13;

//import javafx.scene.control.Cell;

public interface Board {

    /**
     *рисует доску исходя из входящего массива ячеек
     * @param cells массив ячеек
     */
    void drawBoard(Cell[][] cells);

    /**
     *рисует ячейку
     * @param x позиция по горизонтали
     * @param y позиция по вертикали
     */
    void drawCell(int x, int y);

    /**
     *рисует взрыв всех бомб
     */
    void drawBang();

    /**
     * рисует поздравлеине когда игра выйграна
     */
    void drawCongratulate();

}
