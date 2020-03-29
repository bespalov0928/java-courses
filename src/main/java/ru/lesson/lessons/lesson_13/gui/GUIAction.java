package ru.lesson.lessons.lesson_13.gui;

import ru.lesson.lessons.lesson_13.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUIAction implements ActionListener, MouseListener, UserAction {

    private final GeneratorBoard generator;
    private GUIBoard board;
    private final SuperLogic logic;

    public GUIAction(SuperLogic logic, GUIBoard board, GeneratorBoard generator) {
        //super(logic, board, generator);
        this.board = board;
        this.board.addMouseListener(this);
        this.generator = generator;
        this.logic = logic;
    }


    @Override
    public void initGames() {
        final Cell[][] cells = generator.generate();
        this.board.drawBoard(cells);
        this.logic.loadBoard(cells);
    }

    @Override
    public void select(int x, int y, boolean bomb) {
        //предположение пользователя
        this.logic.suggest(x, y, bomb);

        //рисуем ячейку
        board.drawCell(x, y);

        //проверяем нужно ли бахнуть?
        if (this.logic.shouldBang(x, y)) {
            //взрываем
            this.board.drawBang();
        }
        this.board.drawBang();
        //проверяем разгадал ли пользователь все поле.
        if (this.logic.finish()) {
            //поздравляем
            board.drawCongratulate();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.initGames();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        board.repaint();
        //обработка выбора пооьзователя
        this.select(e.getX() / 50, e.getY() / 50, false);
        //System.out.println("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}