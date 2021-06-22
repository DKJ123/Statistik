package GUI;

import File.File;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.table.*;


public class GUI extends JFrame {
    public GUI() {
        initComponents();
    }

    private void importFileButtonActionPerformed(ActionEvent e) {
        File file = new File();
        String fileName = "test.txt";
        file.load(fileName);
    }

    private void dateFromButtonActionPerformed(ActionEvent e) {
        window1.setLocation(dateFromButton.getLocation());
        window1.setVisible(true);
        
    }

    private void dateToButtonActionPerformed(ActionEvent e) {
        window1.setLocation(dateToButton.getLocation());
        window1.setVisible(true);
    }

    private void generateNewButtonActionPerformed(ActionEvent e) {
        File file = new File();
        String fileName = "textSave.txt";
        file.load(fileName);
    }

    private void newFileSortMenuItemStateChanged(ItemEvent e) {
        // TODO add your code here, model.sort??
    }

    private void newFileSortOrderMenuItemStateChanged(ItemEvent e) {
        // TODO add your code here, model.sort??
    }

    private void newFileSaveSortingStateChanged(ChangeEvent e) {
        // TODO add your code here
    }

    private void newFileSaveButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void saveNewFileCheckStateChanged(ChangeEvent e) {
        // TODO add your code here
    }

    private void okButtonActionPerformed(ActionEvent e) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        warningMessage.setText("Are you sure you want to exit without saving?");
        warningDialog.setVisible(true);
    }

    private void prevMonthButtonActionPerformed(ActionEvent e) {
        // TODO add your code here, FIxa funktioner som returnerar rätt månad från en lista
    }

    private void nextMonthButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void dateDayTableMouseClicked(MouseEvent e) {
        window1.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        mainFrame = new JFrame();
        menuBar = new JMenuBar();
        fileMenuBar = new JMenu();
        helpMenuBar = new JMenu();
        helpImportFiles = new JMenuItem();
        helpNewFile = new JMenuItem();
        helpAbout = new JMenuItem();
        helpEmailSup = new JMenuItem();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        currentFilePanel = new JPanel();
        currentFileScrollPane = new JScrollPane();
        currentFileTable = new JTable();
        currentFileLabel = new JLabel();
        importFileButton = new JButton();
        currentFileSeparator = new JSeparator();
        filePathField = new JTextField();
        generateNewButton = new JButton();
        weekLabelPre = new JLabel();
        weekLabelCur = new JLabel();
        weekMenuPre = new JComboBox<>();
        weekMenuCur = new JComboBox<>();
        dateFromButton = new JButton();
        dateFromField = new JTextField();
        dateToButton = new JButton();
        dateToField = new JTextField();
        currentFilePanel2 = new JPanel();
        currentFileScrollPane2 = new JScrollPane();
        currentFileTable2 = new JTable();
        currentFileLabel2 = new JLabel();
        currentFileSeparator2 = new JSeparator();
        warningDialog = new JDialog();
        warningMessage = new JLabel();
        warningOkButton = new JButton();
        warningCancelButton = new JButton();
        window1 = new JWindow();
        dateHeader = new JPanel();
        prevMonthButton = new JButton();
        nextMonthButton = new JButton();
        monthLabel = new JLabel();
        dateSelectScrollPane = new JScrollPane();
        dateDayTable = new JTable();
        yearDropDownMenu = new JComboBox<>();

        //======== mainFrame ========
        {
            var mainFrameContentPane = mainFrame.getContentPane();

            //======== menuBar ========
            {
                menuBar.setBackground(Color.lightGray);

                //======== fileMenuBar ========
                {
                    fileMenuBar.setText("File");
                }
                menuBar.add(fileMenuBar);

                //======== helpMenuBar ========
                {
                    helpMenuBar.setText("Help");

                    //---- helpImportFiles ----
                    helpImportFiles.setText("Import files");
                    helpMenuBar.add(helpImportFiles);

                    //---- helpNewFile ----
                    helpNewFile.setText("New file");
                    helpMenuBar.add(helpNewFile);

                    //---- helpAbout ----
                    helpAbout.setText("About");
                    helpMenuBar.add(helpAbout);

                    //---- helpEmailSup ----
                    helpEmailSup.setText("Email support");
                    helpMenuBar.add(helpEmailSup);
                }
                menuBar.add(helpMenuBar);
            }
            mainFrame.setJMenuBar(menuBar);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, Color.black, Color.black));
                buttonBar.setBackground(new Color(189, 192, 198));
                buttonBar.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder
                ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border
                .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
                . Color .red ) ,buttonBar. getBorder () ) ); buttonBar. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void
                propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
                ;} } );
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("Confirm");
                okButton.addActionListener(e -> okButtonActionPerformed(e));
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("Exit");
                cancelButton.addActionListener(e -> cancelButtonActionPerformed(e));
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }

            //======== currentFilePanel ========
            {
                currentFilePanel.setBackground(new Color(214, 217, 223));
                currentFilePanel.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));

                //======== currentFileScrollPane ========
                {

                    //---- currentFileTable ----
                    currentFileTable.setModel(new DefaultTableModel(
                        new Object[][] {
                        },
                        new String[] {
                            "RESTAURANG", "V.24", "V.25", "F\u00d6RB\u00c4TTRING", "PROCENT"
                        }
                    ) {
                        Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, String.class, String.class, String.class
                        };
                        boolean[] columnEditable = new boolean[] {
                            false, false, false, false, false
                        };
                        @Override
                        public Class<?> getColumnClass(int columnIndex) {
                            return columnTypes[columnIndex];
                        }
                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return columnEditable[columnIndex];
                        }
                    });
                    {
                        TableColumnModel cm = currentFileTable.getColumnModel();
                        cm.getColumn(0).setResizable(false);
                        cm.getColumn(0).setMinWidth(50);
                        cm.getColumn(0).setMaxWidth(300);
                        cm.getColumn(0).setPreferredWidth(150);
                        cm.getColumn(1).setResizable(false);
                        cm.getColumn(1).setMinWidth(50);
                        cm.getColumn(1).setMaxWidth(50);
                        cm.getColumn(1).setPreferredWidth(50);
                        cm.getColumn(2).setResizable(false);
                        cm.getColumn(2).setMinWidth(50);
                        cm.getColumn(2).setMaxWidth(50);
                        cm.getColumn(2).setPreferredWidth(50);
                        cm.getColumn(3).setResizable(false);
                        cm.getColumn(3).setMinWidth(100);
                        cm.getColumn(3).setMaxWidth(100);
                        cm.getColumn(3).setPreferredWidth(100);
                        cm.getColumn(4).setResizable(false);
                        cm.getColumn(4).setMinWidth(70);
                        cm.getColumn(4).setMaxWidth(70);
                        cm.getColumn(4).setPreferredWidth(70);
                    }
                    currentFileTable.setShowVerticalLines(true);
                    currentFileTable.setShowHorizontalLines(true);
                    currentFileTable.setBorder(new LineBorder(Color.black, 1, true));
                    currentFileScrollPane.setViewportView(currentFileTable);
                }

                //---- currentFileLabel ----
                currentFileLabel.setHorizontalAlignment(SwingConstants.CENTER);
                currentFileLabel.setFont(currentFileLabel.getFont().deriveFont(currentFileLabel.getFont().getSize() + 6f));
                currentFileLabel.setText("View of current file");

                //---- importFileButton ----
                importFileButton.setText("Import file");
                importFileButton.addActionListener(e -> importFileButtonActionPerformed(e));

                //---- generateNewButton ----
                generateNewButton.setText("Generate new file");
                generateNewButton.addActionListener(e -> generateNewButtonActionPerformed(e));

                //---- weekLabelPre ----
                weekLabelPre.setText("Select new previous week:");
                weekLabelPre.setFont(weekLabelPre.getFont().deriveFont(weekLabelPre.getFont().getSize() + 1f));

                //---- weekLabelCur ----
                weekLabelCur.setText("Select new current week:");
                weekLabelCur.setFont(weekLabelCur.getFont().deriveFont(weekLabelCur.getFont().getSize() + 1f));

                //---- weekMenuPre ----
                weekMenuPre.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Week",
                    "V.1",
                    "V.2",
                    "V.3",
                    "V.4",
                    "V.5",
                    "V.6",
                    "V.7",
                    "V.8",
                    "V.9",
                    "V.10",
                    "V.11",
                    "V.12",
                    "V.13",
                    "V.14",
                    "V.15",
                    "V.16",
                    "V.17",
                    "V.18",
                    "V.19",
                    "V.20",
                    "V.21",
                    "V.22",
                    "V.23",
                    "V.24",
                    "V.25",
                    "V.26",
                    "V.27",
                    "V.28",
                    "V.29",
                    "V.30",
                    "V.31",
                    "V.32",
                    "V.33",
                    "V.34",
                    "V.35",
                    "V.36",
                    "V.37",
                    "V.38",
                    "V.39",
                    "V.40",
                    "V.41",
                    "V.42",
                    "V.43",
                    "V.44",
                    "V.45",
                    "V.46",
                    "V.47",
                    "V.48",
                    "V.49",
                    "V.50",
                    "V.51",
                    "V.52"
                }));

                //---- weekMenuCur ----
                weekMenuCur.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Week",
                    "V.1",
                    "V.2",
                    "V.3",
                    "V.4",
                    "V.5",
                    "V.6",
                    "V.7",
                    "V.8",
                    "V.9",
                    "V.10",
                    "V.11",
                    "V.12",
                    "V.13",
                    "V.14",
                    "V.15",
                    "V.16",
                    "V.17",
                    "V.18",
                    "V.19",
                    "V.20",
                    "V.21",
                    "V.22",
                    "V.23",
                    "V.24",
                    "V.25",
                    "V.26",
                    "V.27",
                    "V.28",
                    "V.29",
                    "V.30",
                    "V.31",
                    "V.32",
                    "V.33",
                    "V.34",
                    "V.35",
                    "V.36",
                    "V.37",
                    "V.38",
                    "V.39",
                    "V.40",
                    "V.41",
                    "V.42",
                    "V.43",
                    "V.44",
                    "V.45",
                    "V.46",
                    "V.47",
                    "V.48",
                    "V.49",
                    "V.50",
                    "V.51",
                    "V.52"
                }));

                //---- dateFromButton ----
                dateFromButton.setText("From:");
                dateFromButton.setInheritsPopupMenu(true);
                dateFromButton.addActionListener(e -> dateFromButtonActionPerformed(e));

                //---- dateFromField ----
                dateFromField.setText("2021-06-12");

                //---- dateToButton ----
                dateToButton.setText("To:");
                dateToButton.setInheritsPopupMenu(true);
                dateToButton.addActionListener(e -> dateToButtonActionPerformed(e));

                //---- dateToField ----
                dateToField.setText("2021-06-18");

                GroupLayout currentFilePanelLayout = new GroupLayout(currentFilePanel);
                currentFilePanel.setLayout(currentFilePanelLayout);
                currentFilePanelLayout.setHorizontalGroup(
                    currentFilePanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, currentFilePanelLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(currentFilePanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, currentFilePanelLayout.createSequentialGroup()
                                    .addComponent(filePathField, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(importFileButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24))
                                .addGroup(GroupLayout.Alignment.TRAILING, currentFilePanelLayout.createSequentialGroup()
                                    .addComponent(generateNewButton, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())))
                        .addComponent(currentFileSeparator, GroupLayout.Alignment.TRAILING)
                        .addGroup(currentFilePanelLayout.createSequentialGroup()
                            .addGroup(currentFilePanelLayout.createParallelGroup()
                                .addGroup(currentFilePanelLayout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(currentFileLabel, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE))
                                .addGroup(currentFilePanelLayout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(currentFilePanelLayout.createParallelGroup()
                                        .addGroup(currentFilePanelLayout.createSequentialGroup()
                                            .addComponent(weekLabelPre)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(weekMenuPre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(weekLabelCur)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(weekMenuCur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(currentFilePanelLayout.createSequentialGroup()
                                            .addComponent(dateFromButton)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dateFromField, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dateToButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dateToField, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)))))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(currentFileScrollPane, GroupLayout.Alignment.TRAILING)
                );
                currentFilePanelLayout.setVerticalGroup(
                    currentFilePanelLayout.createParallelGroup()
                        .addGroup(currentFilePanelLayout.createSequentialGroup()
                            .addComponent(currentFileLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(currentFileScrollPane, GroupLayout.PREFERRED_SIZE, 441, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(currentFilePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(importFileButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addComponent(filePathField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(currentFileSeparator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(currentFilePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(weekLabelPre)
                                .addComponent(weekMenuPre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(weekLabelCur)
                                .addComponent(weekMenuCur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addGroup(currentFilePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(dateFromButton)
                                .addComponent(dateFromField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateToButton)
                                .addComponent(dateToField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addComponent(generateNewButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                );
            }

            //======== currentFilePanel2 ========
            {
                currentFilePanel2.setBackground(new Color(214, 217, 223));
                currentFilePanel2.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));

                //======== currentFileScrollPane2 ========
                {

                    //---- currentFileTable2 ----
                    currentFileTable2.setModel(new DefaultTableModel(
                        new Object[][] {
                        },
                        new String[] {
                            "RESTAURANG", "V.25", "V.26", "F\u00d6RB\u00c4TTRING", "PROCENT"
                        }
                    ) {
                        Class<?>[] columnTypes = new Class<?>[] {
                            String.class, String.class, String.class, String.class, String.class
                        };
                        boolean[] columnEditable = new boolean[] {
                            false, false, false, false, false
                        };
                        @Override
                        public Class<?> getColumnClass(int columnIndex) {
                            return columnTypes[columnIndex];
                        }
                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return columnEditable[columnIndex];
                        }
                    });
                    {
                        TableColumnModel cm = currentFileTable2.getColumnModel();
                        cm.getColumn(0).setResizable(false);
                        cm.getColumn(0).setMinWidth(50);
                        cm.getColumn(0).setMaxWidth(300);
                        cm.getColumn(0).setPreferredWidth(150);
                        cm.getColumn(1).setResizable(false);
                        cm.getColumn(1).setMinWidth(50);
                        cm.getColumn(1).setMaxWidth(50);
                        cm.getColumn(1).setPreferredWidth(50);
                        cm.getColumn(2).setResizable(false);
                        cm.getColumn(2).setMinWidth(50);
                        cm.getColumn(2).setMaxWidth(50);
                        cm.getColumn(2).setPreferredWidth(50);
                        cm.getColumn(3).setResizable(false);
                        cm.getColumn(3).setMinWidth(100);
                        cm.getColumn(3).setMaxWidth(100);
                        cm.getColumn(3).setPreferredWidth(100);
                        cm.getColumn(4).setResizable(false);
                        cm.getColumn(4).setMinWidth(70);
                        cm.getColumn(4).setMaxWidth(70);
                        cm.getColumn(4).setPreferredWidth(70);
                    }
                    currentFileTable2.setShowVerticalLines(true);
                    currentFileTable2.setShowHorizontalLines(true);
                    currentFileTable2.setBorder(new LineBorder(Color.black, 1, true));
                    currentFileScrollPane2.setViewportView(currentFileTable2);
                }

                //---- currentFileLabel2 ----
                currentFileLabel2.setHorizontalAlignment(SwingConstants.CENTER);
                currentFileLabel2.setFont(currentFileLabel2.getFont().deriveFont(currentFileLabel2.getFont().getSize() + 6f));
                currentFileLabel2.setText("Preview of new file");

                GroupLayout currentFilePanel2Layout = new GroupLayout(currentFilePanel2);
                currentFilePanel2.setLayout(currentFilePanel2Layout);
                currentFilePanel2Layout.setHorizontalGroup(
                    currentFilePanel2Layout.createParallelGroup()
                        .addComponent(currentFileSeparator2, GroupLayout.Alignment.TRAILING)
                        .addComponent(currentFileScrollPane2, GroupLayout.Alignment.TRAILING)
                        .addGroup(currentFilePanel2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(currentFileLabel2, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                currentFilePanel2Layout.setVerticalGroup(
                    currentFilePanel2Layout.createParallelGroup()
                        .addGroup(currentFilePanel2Layout.createSequentialGroup()
                            .addComponent(currentFileLabel2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(currentFileScrollPane2, GroupLayout.PREFERRED_SIZE, 441, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(currentFileSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(165, 165, 165))
                );
            }

            GroupLayout mainFrameContentPaneLayout = new GroupLayout(mainFrameContentPane);
            mainFrameContentPane.setLayout(mainFrameContentPaneLayout);
            mainFrameContentPaneLayout.setHorizontalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addGroup(mainFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainFrameContentPaneLayout.createParallelGroup()
                            .addGroup(mainFrameContentPaneLayout.createSequentialGroup()
                                .addComponent(buttonBar, GroupLayout.PREFERRED_SIZE, 979, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(48, Short.MAX_VALUE))
                            .addGroup(mainFrameContentPaneLayout.createSequentialGroup()
                                .addComponent(currentFilePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currentFilePanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
            );
            mainFrameContentPaneLayout.setVerticalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, mainFrameContentPaneLayout.createSequentialGroup()
                        .addGroup(mainFrameContentPaneLayout.createParallelGroup()
                            .addComponent(currentFilePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(currentFilePanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(mainFrame.getOwner());
        }

        //======== warningDialog ========
        {
            warningDialog.setTitle("WARNING");
            var warningDialogContentPane = warningDialog.getContentPane();

            //---- warningMessage ----
            warningMessage.setText("SOME KIND OF WARNING IF NECESSARY");
            warningMessage.setHorizontalAlignment(SwingConstants.CENTER);

            //---- warningOkButton ----
            warningOkButton.setText("OK");

            //---- warningCancelButton ----
            warningCancelButton.setText("CANCEL");

            GroupLayout warningDialogContentPaneLayout = new GroupLayout(warningDialogContentPane);
            warningDialogContentPane.setLayout(warningDialogContentPaneLayout);
            warningDialogContentPaneLayout.setHorizontalGroup(
                warningDialogContentPaneLayout.createParallelGroup()
                    .addGroup(warningDialogContentPaneLayout.createSequentialGroup()
                        .addGroup(warningDialogContentPaneLayout.createParallelGroup()
                            .addGroup(warningDialogContentPaneLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(warningMessage, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
                            .addGroup(warningDialogContentPaneLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(warningOkButton, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(warningCancelButton)))
                        .addContainerGap(35, Short.MAX_VALUE))
            );
            warningDialogContentPaneLayout.setVerticalGroup(
                warningDialogContentPaneLayout.createParallelGroup()
                    .addGroup(warningDialogContentPaneLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(warningMessage, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(warningDialogContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(warningCancelButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addComponent(warningOkButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(11, Short.MAX_VALUE))
            );
            warningDialog.pack();
            warningDialog.setLocationRelativeTo(warningDialog.getOwner());
        }

        //======== window1 ========
        {
            var window1ContentPane = window1.getContentPane();

            //======== dateHeader ========
            {
                dateHeader.setBackground(new Color(158, 173, 191));
                dateHeader.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
                dateHeader.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
                . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax
                . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
                12 ), java. awt. Color. red) ,dateHeader. getBorder( )) ); dateHeader. addPropertyChangeListener (new java. beans
                . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .
                getPropertyName () )) throw new RuntimeException( ); }} );

                //---- prevMonthButton ----
                prevMonthButton.setText("Prev");
                prevMonthButton.addActionListener(e -> prevMonthButtonActionPerformed(e));

                //---- nextMonthButton ----
                nextMonthButton.setText("Next");
                nextMonthButton.addActionListener(e -> nextMonthButtonActionPerformed(e));

                //---- monthLabel ----
                monthLabel.setText("January");
                monthLabel.setFont(monthLabel.getFont().deriveFont(monthLabel.getFont().getSize() + 4f));

                GroupLayout dateHeaderLayout = new GroupLayout(dateHeader);
                dateHeader.setLayout(dateHeaderLayout);
                dateHeaderLayout.setHorizontalGroup(
                    dateHeaderLayout.createParallelGroup()
                        .addGroup(dateHeaderLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(prevMonthButton)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                            .addComponent(monthLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(nextMonthButton)
                            .addContainerGap())
                );
                dateHeaderLayout.setVerticalGroup(
                    dateHeaderLayout.createParallelGroup()
                        .addGroup(dateHeaderLayout.createSequentialGroup()
                            .addGroup(dateHeaderLayout.createParallelGroup()
                                .addGroup(dateHeaderLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(nextMonthButton)
                                    .addComponent(monthLabel))
                                .addComponent(prevMonthButton))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            //======== dateSelectScrollPane ========
            {

                //---- dateDayTable ----
                dateDayTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {1, 2, 3, 4, 5, 6},
                        {7, 8, 9, 10, 11, 12},
                        {13, 14, 15, 16, 17, 18},
                        {19, 20, 21, 22, 23, 24},
                        {25, 26, 27, 28, 29, 30},
                        {31, null, null, null, null, null},
                    },
                    new String[] {
                        " ", " ", " ", " ", " ", " "
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, false, false
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                });
                {
                    TableColumnModel cm = dateDayTable.getColumnModel();
                    cm.getColumn(0).setResizable(false);
                    cm.getColumn(1).setResizable(false);
                    cm.getColumn(2).setResizable(false);
                    cm.getColumn(3).setResizable(false);
                    cm.getColumn(4).setResizable(false);
                    cm.getColumn(5).setResizable(false);
                }
                dateDayTable.setShowVerticalLines(true);
                dateDayTable.setShowHorizontalLines(true);
                dateDayTable.setAutoscrolls(false);
                dateDayTable.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        dateDayTableMouseClicked(e);
                    }
                });
                dateSelectScrollPane.setViewportView(dateDayTable);
            }

            //---- yearDropDownMenu ----
            yearDropDownMenu.setModel(new DefaultComboBoxModel<>(new String[] {
                "Year",
                "2021",
                "2020",
                "2019",
                "2018",
                "2017",
                "2016",
                "2015",
                "2014",
                "2013",
                "2012",
                "2011",
                "2010",
                "2009",
                "2008",
                "2007",
                "2006",
                "2005",
                "2004",
                "2003",
                "2002",
                "2001",
                "2000"
            }));
            yearDropDownMenu.setSelectedIndex(1);

            GroupLayout window1ContentPaneLayout = new GroupLayout(window1ContentPane);
            window1ContentPane.setLayout(window1ContentPaneLayout);
            window1ContentPaneLayout.setHorizontalGroup(
                window1ContentPaneLayout.createParallelGroup()
                    .addComponent(dateHeader, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateSelectScrollPane, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, window1ContentPaneLayout.createSequentialGroup()
                        .addContainerGap(243, Short.MAX_VALUE)
                        .addComponent(yearDropDownMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            window1ContentPaneLayout.setVerticalGroup(
                window1ContentPaneLayout.createParallelGroup()
                    .addGroup(window1ContentPaneLayout.createSequentialGroup()
                        .addComponent(dateHeader, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateSelectScrollPane, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearDropDownMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
            );
            window1.pack();
            window1.setLocationRelativeTo(window1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame mainFrame;
    private JMenuBar menuBar;
    private JMenu fileMenuBar;
    private JMenu helpMenuBar;
    private JMenuItem helpImportFiles;
    private JMenuItem helpNewFile;
    private JMenuItem helpAbout;
    private JMenuItem helpEmailSup;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel currentFilePanel;
    private JScrollPane currentFileScrollPane;
    private JTable currentFileTable;
    private JLabel currentFileLabel;
    private JButton importFileButton;
    private JSeparator currentFileSeparator;
    private JTextField filePathField;
    private JButton generateNewButton;
    private JLabel weekLabelPre;
    private JLabel weekLabelCur;
    private JComboBox<String> weekMenuPre;
    private JComboBox<String> weekMenuCur;
    private JButton dateFromButton;
    private JTextField dateFromField;
    private JButton dateToButton;
    private JTextField dateToField;
    private JPanel currentFilePanel2;
    private JScrollPane currentFileScrollPane2;
    private JTable currentFileTable2;
    private JLabel currentFileLabel2;
    private JSeparator currentFileSeparator2;
    private JDialog warningDialog;
    private JLabel warningMessage;
    private JButton warningOkButton;
    private JButton warningCancelButton;
    private JWindow window1;
    private JPanel dateHeader;
    private JButton prevMonthButton;
    private JButton nextMonthButton;
    private JLabel monthLabel;
    private JScrollPane dateSelectScrollPane;
    private JTable dateDayTable;
    private JComboBox<String> yearDropDownMenu;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
