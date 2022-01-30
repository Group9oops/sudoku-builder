package nl.elridge.sudoku.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import nl.elridge.sudoku.model.Game;


public class ButtonController implements ActionListener {
    private Game game;

    /**
     * Constructor, sets game.
     *
     * @group9 game  Game to be set.
     */
    public ButtonController(Game game) {
        this.game = game;
    }

    /**
     * Performs action after user pressed button.
     *
     * @group9 e ActionEvent.
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("New"))
            game.newGame();
        else if (e.getActionCommand().equals("Check"))
            game.checkGame();
        else if (e.getActionCommand().equals("Exit"))
            System.exit(0);
        else if (e.getActionCommand().equals("Help on"))
            game.setHelp(((JCheckBox)e.getSource()).isSelected());
        else
            game.setSelectedNumber(Integer.parseInt(e.getActionCommand()));
    }
}