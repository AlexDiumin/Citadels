package com.game.citadels.view;

import net.miginfocom.swing.MigLayout;

import java.awt.Button;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class GameLobby {

    private static void addComponentsToPane(Container pane) {

        // anchor - расположение (компонент меньше своей области отображения)
        // fill - растягивание (область отображения компонента больше, чем запрошенный размер компонента)
        // gridheight - высота (в ячейках)
        // gridwidth - ширина (в ячейках)
        // gridx - ячейка переднего края компонента
        // gridy - ячейка верхней части компонента
        // insets - внешние отступы
        // ipadx - внутренний отступ (по х)
        // ipady - внутренний отступ (по у)
        // weightx - пространство между компонентами по горизонтале
        // weighty - пространство между компонентами по вертикале

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(2, 2, 2, 2);

        Label citadelsLabel = new Label("Citadels");
        citadelsLabel.setFont(new Font(citadelsLabel.getName(), Font.ITALIC, 30));
        c.anchor = GridBagConstraints.LINE_START; // расположение
        c.fill = GridBagConstraints.NONE;               // растягивание
        c.gridheight = 1;                               // высота
        c.gridwidth = 2;                                // ширина
        c.gridx = 0;                                    // позиция по х
        c.gridy = 0;                                    // позиция по у
        c.weightx = 0.0;                                // пространство между по х
        c.weighty = 0.0;                                // пространство между по у
        pane.add(citadelsLabel, c);

        JButton btnSound = new JButton();
        btnSound.setPreferredSize(new Dimension(26, 26));
        Image imgSound = new ImageIcon("E:/Android/Citadels/android/assets/sound.png").getImage();
        btnSound.setIcon(new ImageIcon(imgSound.getScaledInstance(16, 16, Image.SCALE_SMOOTH)));
        c.anchor = GridBagConstraints.LINE_START; // расположение
        c.fill = GridBagConstraints.NONE;         // растягивание
        c.gridheight = 1;                         // высота
        c.gridwidth = 1;                          // ширина
        c.gridx = 2;                              // позиция по х
        c.gridy = 0;                              // позиция по у
        c.weightx = 1.0;                          // пространство между по х
        c.weighty = 0.0;                          // пространство между по у
        pane.add(btnSound, c);

        JButton btnCreateGame = new JButton("Создать игру");
        c.anchor = GridBagConstraints.LINE_START; // расположение
        c.fill = GridBagConstraints.NONE;         // растягивание
        c.gridheight = 1;                         // высота
        c.gridwidth = 1;                          // ширина
        c.gridx = 3;                              // позиция по х
        c.gridy = 0;                              // позиция по у
        c.weightx = 1.0;                          // пространство между по х
        c.weighty = 0.0;                          // пространство между по у
        pane.add(btnCreateGame, c);

        JButton btnAuthorization = new JButton("Вход");
        c.anchor = GridBagConstraints.LINE_END; // расположение
        c.fill = GridBagConstraints.NONE;         // растягивание
        c.gridheight = 1;                         // высота
        c.gridwidth = 1;                          // ширина
        c.gridx = 4;                              // позиция по х
        c.gridy = 0;                              // позиция по у
        c.weightx = 0.0;                          // пространство между по х
        c.weighty = 0.0;                          // пространство между по у
        pane.add(btnAuthorization, c);

        JButton btnRegistration = new JButton("Регистрация");
        c.anchor = GridBagConstraints.LINE_END; // расположение
        c.fill = GridBagConstraints.NONE;             // растягивание
        c.gridheight = 1;                             // высота
        c.gridwidth = 1;                              // ширина
        c.gridx = 5;                                  // позиция по х
        c.gridy = 0;                                  // позиция по у
        c.weightx = 0.0;                              // пространство между по х
        c.weighty = 0.0;                              // пространство между по у
        pane.add(btnRegistration, c);

        JTabbedPane gamesTabbedPane = new JTabbedPane();
        JTable tableUSA = new JTable();
        gamesTabbedPane.addTab("USA", tableUSA);
        JTable tableEurope = new JTable();
        gamesTabbedPane.addTab("Europe", tableEurope);
        JTable tableUkraine = new JTable();
        gamesTabbedPane.addTab("Ukraine", tableUkraine);
        JTable tableRussia = new JTable();
        gamesTabbedPane.addTab("Russia", tableRussia);
        c.anchor = GridBagConstraints.CENTER; // расположение
        c.fill = GridBagConstraints.BOTH;     // растягивание
        c.gridheight = 1;                     // высота
        c.gridwidth = 6;                      // ширина
        c.gridx = 0;                          // позиция по х
        c.gridy = 1;                          // позиция по у
        c.weightx = 0.0;                      // пространство между по х
        c.weighty = 1.0;                      // пространство между по у
        pane.add(gamesTabbedPane, c);

        JButton btnHelp = new JButton();
        btnHelp.setPreferredSize(new Dimension(26, 26));
        Image imgHelp = new ImageIcon("E:/Android/Citadels/android/assets/question.png").getImage();
        btnHelp.setIcon(new ImageIcon(imgHelp.getScaledInstance(16, 16, Image.SCALE_SMOOTH)));
        c.anchor = GridBagConstraints.LINE_START; // расположение
        c.fill = GridBagConstraints.NONE;         // растягивание
        c.gridheight = 1;                         // высота
        c.gridwidth = 1;                          // ширина
        c.gridx = 0;                              // позиция по х
        c.gridy = 2;                              // позиция по у
        c.weightx = 0.0;                          // пространство между по х
        c.weighty = 0.0;                          // пространство между по у
        pane.add(btnHelp, c);

        JButton btnRules = new JButton("Правила");
        c.anchor = GridBagConstraints.LINE_START; // расположение
        c.fill = GridBagConstraints.NONE;       // растягивание
        c.gridheight = 1;                       // высота
        c.gridwidth = 1;                        // ширина
        c.gridx = 1;                            // позиция по х
        c.gridy = 2;                            // позиция по у
        c.weightx = 0.0;                        // пространство между по х
        c.weighty = 0.0;                        // пространство между по у
        pane.add(btnRules, c);

        JButton btnStart = new JButton("Играть");
        c.anchor = GridBagConstraints.LINE_END; // расположение
        c.fill = GridBagConstraints.NONE;       // растягивание
        c.gridheight = 1;                       // высота
        c.gridwidth = 3;                        // ширина
        c.gridx = 3;                            // позиция по х
        c.gridy = 2;                            // позиция по у
        c.weightx = 1.0;                        // пространство между по х
        c.weighty = 0.0;                        // пространство между по у
        pane.add(btnStart, c);
    }

    public static void createAndShowGUI() {
        // Создание окна
        JFrame frame = new JFrame("Game lobby");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 200, 200);

        // Установить панель содержания
        addComponentsToPane(frame.getContentPane());

        // Показать окно
        frame.pack();
        frame.setVisible(true);
    }
}
