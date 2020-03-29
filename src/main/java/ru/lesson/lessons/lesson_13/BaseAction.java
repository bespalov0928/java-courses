package ru.lesson.lessons.lesson_13;

//import javafx.scene.control.Cell;

public class BaseAction implements UserAction {

    private final GeneratorBoard generator;
    private final Board board;
    private final SuperLogic logic;

    public BaseAction(final SuperLogic logic, final Board board, final GeneratorBoard generator) {
        this.generator = generator;
        this.board = board;
        this.logic = logic;
    }

    /**
     * инициализация игры
     */
    public void initGames(){
        final Cell[][] cells = generator.generate();
        this.board.drawBoard(cells);
        this.logic.loadBoard(cells);
    }

    /**
     * пользователь выбрал ячейку в которой он предполает есть бомба или нет бомбы
     * @param x
     * @param y
     * @param bomb
     */
    public void select(int x, int y, boolean bomb){
        //предположение пользователя
        this.logic.suggest(x,y,bomb);

        //рисуем ячейку
        board.drawCell(x,y);

        //проверяем нужно ли бахнуть?
        if (this.logic.shouldBang(x,y)){
            //взрываем
            this.board.drawBang();
        }

        //проверяем разгадал ли пользователь все поле.
        if (this.logic.finish()){
            //поздравляем
            board.drawCongratulate();
        }
    }

}
