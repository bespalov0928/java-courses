package ru.lesson.lessons.lesson_13.console;

//import javafx.scene.control.Cell;
import ru.lesson.lessons.lesson_13.Board;
import ru.lesson.lessons.lesson_13.Cell;

public class ConsoleBoard implements Board {

    private Cell[][] cells;

    /**
     * русуем карту
     * @param cells массив ячеек
     */
    public void drawBoard(Cell[][] cells) {
        this.cells = cells;
        this.redraw(false);
    }

    /**
     * рисум ячеку
     * @param x позиция по горизонтали
     * @param y позиция по вертикали
     */
    public void drawCell(int x, int y) {
        System.out.println("*****SELECT*****");
        this.redraw(false);
    }

    /**
     * русуем взрыв
     */
    public void drawBang() {
        System.out.println("******BANG*********");
    }

    /**
     * рисуем строчку поздравление
     */
    public void drawCongratulate() {
        System.out.println("**********CONGLATURETION*********");
    }

    private void redraw(boolean real) {
        for (Cell[] row : cells) {
            for (Cell cell : row) {
                cell.draw(System.out, real);
            }
            System.out.println();
        }
        System.out.println();
    }

}
