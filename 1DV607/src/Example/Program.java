package Example;

import Example.Controller.Player;
import Example.Model.DiceGame;
import Example.View.Console;

import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        Console view = new Console();
        Player controller = new Player(view);

        controller.playGame(game);
    }
}
