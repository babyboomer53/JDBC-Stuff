import javax.swing.*;
import java.sql.*;

public class TheView extends javax.swing.JFrame {

    /**
     * Creates new form TheView
     */
    public TheView() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Top 100 Movies of All Time");

        jLabel1.setLabelFor(jTextField1);
        jLabel1.setText("Ranking");

        jLabel2.setLabelFor(jTextField2);
        jLabel2.setText("Title");

        jLabel3.setLabelFor(jTextField3);
        jLabel3.setText("Released");

        jLabel4.setLabelFor(jTextField4);
        jLabel4.setText("Actor");

        jLabel5.setLabelFor(jTextField5);
        jLabel5.setText("Director");

        jLabel6.setLabelFor(jTextField6);
        jLabel6.setText("Rating");

        jTextField1.setColumns(5);
        jTextField1.setToolTipText("Enter a rank for this movie. THIS NUMBER MUST BE UNIQUE!");
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });

        jTextField2.setToolTipText("Enter the movie's title.");
        jTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField2CaretUpdate(evt);
            }
        });

        jTextField3.setColumns(5);
        jTextField3.setToolTipText("In what year was the movie released?");
        jTextField3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField3CaretUpdate(evt);
            }
        });

        jTextField4.setToolTipText("Who was the lead actor or actress?");
        jTextField4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField4CaretUpdate(evt);
            }
        });

        jTextField5.setToolTipText("Who was the director?");
        jTextField5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField5CaretUpdate(evt);
            }
        });

        jTextField6.setToolTipText("What is the IMDb (unofficial) rating?");
        jTextField6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField6CaretUpdate(evt);
            }
        });

        jButton1.setText("Insert");
        jButton1.setToolTipText("Click this button to add a row to the database containing the information entered above.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });

        jButton2.setText("Delete");
        jButton2.setToolTipText("Click this button to delete the row from the database that contains the information entered above.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });

        jButton3.setText("Clear fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        //jTextField7.setText("Enter custom query here");
        jTextField7.setToolTipText("Use this field to enter custom SQL.");
        jTextField7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField7CaretUpdate(evt);
            }
        });

        jButton4.setText("Execute query");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton4ActionPerformed(evt);
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });

        jButton5.setText("Clear query");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Restore table");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton6ActionPerformed(evt);
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton7.setText("Commit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton7ActionPerformed(evt);
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });

        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField7)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addGap(0, 48, Short.MAX_VALUE))
                                                        .addComponent(jTextField6)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton3))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton7)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton5)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton6)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4)
                                        .addComponent(jButton5)
                                        .addComponent(jButton6)
                                        .addComponent(jButton7))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = TheController.connection.prepareStatement(TheModel.getInsertString());
            preparedStatement.setInt(1, Integer.parseInt(jTextField1.getText()));
            preparedStatement.setString(2, jTextField2.getText());
            preparedStatement.setInt(3, Integer.parseInt(jTextField3.getText()));
            preparedStatement.setString(4, jTextField4.getText());
            preparedStatement.setString(5, jTextField5.getText());
            preparedStatement.setDouble(6, Double.parseDouble(jTextField6.getText()));
            preparedStatement.execute();
            jButton7.setEnabled(true);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = TheController.connection.prepareStatement(TheModel.getDeleteString());
            preparedStatement.setInt(1, Integer.parseInt(jTextField1.getText()));
            preparedStatement.setString(2, jTextField2.getText());
            preparedStatement.setInt(3, Integer.parseInt(jTextField3.getText()));
            preparedStatement.setString(4, jTextField4.getText());
            preparedStatement.setString(5, jTextField5.getText());
            preparedStatement.setDouble(6, Double.parseDouble(jTextField6.getText()));
            preparedStatement.execute();
            jButton7.setEnabled(true);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        turnOnFirstThreeButtons(false);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        Statement statement = null;
        try {
            statement = TheController.connection.createStatement();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        statement.execute(jTextField7.getText());
        ResultSet resultSet = statement.getResultSet();
        getjTable1().setModel(TheModel.buildTableModel(resultSet));
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField7.setText("");
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        // TODO add your handling code here:
    }

    private void jTextField5CaretUpdate(javax.swing.event.CaretEvent evt) {
        if (!jTextField5.getText().isBlank()) {
            jButton3.setEnabled(true);
        }
        if (allSixFieldsArePopulated()) {
            turnOnFirstThreeButtons(true);
        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        }
    }

    private void jTextField6CaretUpdate(javax.swing.event.CaretEvent evt) {
        if (!jTextField6.getText().isBlank()) {
            jButton3.setEnabled(true);
        }
        if (allSixFieldsArePopulated()) {
            turnOnFirstThreeButtons(true);
        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        }
    }

    private boolean allSixFieldsArePopulated() {
        return !jTextField1.getText().isBlank() &&
                !jTextField2.getText().isBlank() &&
                !jTextField3.getText().isBlank() &&
                !jTextField4.getText().isBlank() &&
                !jTextField5.getText().isBlank() &&
                !jTextField6.getText().isBlank();
    }

    private void turnOnFirstThreeButtons(boolean enable) {
        jButton1.setEnabled(enable);
        jButton2.setEnabled(enable);
        jButton3.setEnabled(enable);
    }

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {
        if (!jTextField1.getText().isBlank()) {
            jButton3.setEnabled(true);
        }
        if (allSixFieldsArePopulated()) {
            turnOnFirstThreeButtons(true);
        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        }
    }

    private void jTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {
        if (!jTextField2.getText().isBlank()) {
            jButton3.setEnabled(true);
        }
        if (allSixFieldsArePopulated()) {
            turnOnFirstThreeButtons(true);
        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        }
    }

    private void jTextField3CaretUpdate(javax.swing.event.CaretEvent evt) {
        if (!jTextField3.getText().isBlank()) {
            jButton3.setEnabled(true);
        }
        if (allSixFieldsArePopulated()) {
            turnOnFirstThreeButtons(true);
        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        }
    }

    private void jTextField4CaretUpdate(javax.swing.event.CaretEvent evt) {
        if (!jTextField4.getText().isBlank()) {
            jButton3.setEnabled(true);
        }
        if (allSixFieldsArePopulated()) {
            turnOnFirstThreeButtons(true);
        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        }
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        Connection connection = TheController.connection;
        Statement statement = connection.createStatement();
        connection.commit();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Movies");
        jTable1.setModel(TheModel.buildTableModel(resultSet));
        jButton7.setEnabled(false);
    }

    private void jTextField7CaretUpdate(javax.swing.event.CaretEvent evt) {
        if (!jTextField7.getText().isBlank()) {
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton7.setEnabled(true);
        } else {
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton7.setEnabled(false);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;

    public JTable getjTable1() {
        return jTable1;
    }
    // End of variables declaration
}
