package ru.lesson.lessons.lesson_13.logics;

import ru.lesson.lessons.lesson_13.Cell;
import ru.lesson.lessons.lesson_13.SuperLogic;

public class Easy implements SuperLogic {

    private Cell[][] cells;

    /**
     * загружакем поле по которому делаем вычисление
     * @param cells
     */
    @Override
    public void loadBoard(Cell[][] cells) {
        this.cells = cells;
    }

    /**
     * проверяеп нужно ди бахнуть?
     * передам клетку и вычисляем что нужно  сней сделать
     * @param x
     * @param y
     * @return
     */
    @Override
    public boolean shouldBang(int x, int y) {
        final Cell selected = this.cells[x][y];
        return selected.isBomb() && !selected.isSuggestBomb();
    }

    /**
     * проверяем разгадал ли пользователь все поле.
     * если разгадал то поздравляем его
     * @return
     */
    @Override
    public boolean finish() {
        boolean finish = false;
        for (Cell[] row:cells) {
            for (Cell cell: row) {
                finish = ((cell.isSuggestBomb() && cell.isBomb()) ||
                        (cell.isSuggestEmpty() && !cell.isBomb()));
            }
        }
        return finish;
    }

    /**
     * предположение пользователя
     * @param x
     * @param y
     * @param bomb
     */
    @Override
    public void suggest(int x, int y, boolean bomb) {
        if (bomb){
            this.cells[x][y].suggestBomb();
        }else {
            this.cells[x][y].suggestEmpty();
        }
    }
}
