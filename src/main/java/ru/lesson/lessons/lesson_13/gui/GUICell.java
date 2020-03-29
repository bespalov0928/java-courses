package ru.lesson.lessons.lesson_13.gui;

import ru.lesson.lessons.lesson_13.Cell;

import java.awt.*;

public class GUICell implements Cell<Graphics> {

    private boolean bomb;
    private boolean suggestBomb = false;
    private boolean suggestEmpty = false;

    public GUICell(boolean bomb) {
        this.bomb = bomb;

    }

    /**
     * является ли это бомба
     *
     * @return
     */
    @Override
    public boolean isBomb() {
        return false;
    }

    /**
     * пользователь предположил что это бомба
     *
     * @return
     */
    @Override
    public boolean isSuggestBomb() {
        return false;
    }

    /**
     * пользователь предположил что это пустая клетка
     *
     * @return
     */
    @Override
    public boolean isSuggestEmpty() {
        return false;
    }

    /**
     * устанавливает пустое значение
     */
    @Override
    public void suggestEmpty() {
        this.suggestEmpty = true;
    }

    /**
     * устанавливает значение бомба
     */
    @Override
    public void suggestBomb() {
        this.suggestBomb = true;
    }

    /**
     * рисование значения
     *
     * @param paint
     * @param real
     */
    @Override
    public void draw(Graphics paint, boolean real) {
        //paint.drawRect(1, 1, 10, 10);
        //paint.drawOval(25,25,10,10);
        if (real) {
            if (this.isBomb()) {
                paint.drawOval(25, 25,10,10);
                //paint.paint("[*] ");
            } else {
                paint.drawOval(25, 25,20,20);
                //paint.paint("[ ] ");
            }
        } else {
            if (this.suggestBomb) {
                //paint.paint("[?] ");
            }else if (this.suggestEmpty){
                //paint.paint("[ ] ");
            }else {
                //paint.paint("[X] ");
            }
        }

    }
}
