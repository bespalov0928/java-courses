package ru.lesson.lessons.lesson_13.console;

import ru.lesson.lessons.lesson_13.Cell;

import java.io.PrintStream;

public class ConsoleCell implements Cell<PrintStream> {

    private boolean bomb;
    private boolean suggestBomb = false;
    private boolean suggestEmpty = false;

    public ConsoleCell(boolean bomb) {
        this.bomb = bomb;
    }

    /**
     * является ли это бомба
     * @return
     */
    @Override
    public boolean isBomb() {
        return this.bomb;
    }

    /**
     * пользователь предположил что это бомба
     * @return
     */
    @Override
    public boolean isSuggestBomb() {
        return this.suggestBomb;
    }

    /**
     * пользователь предположил что это пустая клетка
     * @return
     */
    @Override
    public boolean isSuggestEmpty() {
        return this.suggestEmpty;
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
     * @param paint
     * @param real
     */
    @Override
    public void draw(PrintStream paint, boolean real) {
        if (real) {
            if (this.isBomb()) {
                paint.print("[*] ");
            } else {
                paint.print("[ ] ");
            }
        } else {
            if (this.suggestBomb) {
                paint.print("[?] ");
            }else if (this.suggestEmpty){
                paint.print("[ ] ");
            }else {
                paint.print("[X] ");
            }
        }
    }
}
