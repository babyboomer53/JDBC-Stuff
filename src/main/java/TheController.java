import java.sql.Connection;
import java.sql.SQLException;

public class TheController {
    public static Connection connection;
    public static void main(String[] args) throws SQLException {
        TheModel theModel = new TheModel();
        connection = theModel.createDatabase();
        TheView theView = new TheView();
        theView.getjTable1().setModel(theModel.buildTableModel(theModel.getResultSet("SELECT * FROM Movies")));
        theView.setResizable(false);
        theView.setLocationRelativeTo(null);
        theView.setVisible(true);
    }
}
