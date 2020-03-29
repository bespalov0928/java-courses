package ru.lesson.lessons.lesson_13.gui;

import ru.lesson.lessons.lesson_13.*;


import javax.swing.*;
import java.awt.*;

public class GUIBoard extends JPanel implements Board {

    public static final int PADDING = 50;
    public Cell<Graphics>[][] cells;

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if (this.cells != null) {
            for (int x = 0; x != cells.length; x++) {
                for (int y = 0; y != cells[0].length; y++) {
                    graphics.setColor(Color.BLACK);
                    cells[x][y].draw(graphics, false);
                    graphics.drawRect(x * PADDING, y * PADDING, PADDING, PADDING);
                }
            }
        }
    }

    /**
     * рисует доску исходя из входящего массива ячеек
     *
     * @param cells массив ячеек
     */
    public void drawBoard(Cell[][] cells) {
        this.cells = cells;
        this.repaint();
    }

    /**
     * рисует ячейку
     *
     * @param x позиция по горизонтали
     * @param y позиция по вертикали
     */
    @Override
    public void drawCell(int x, int y) {
        this.repaint();
    }

    /**
     * рисует взрыв всех бомб
     */
    @Override
    public void drawBang() {
        this.repaint();

    }

    /**
     * рисует поздравлеине когда игра выйграна
     */
    @Override
    public void drawCongratulate() {

    }


}
