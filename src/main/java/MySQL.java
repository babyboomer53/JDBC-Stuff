import java.sql.*;

public class MySQL {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/example";

    //  Database credentials
    static final String USERNAME = "babyboomer";
    static final String PASSWORD = "Tl8L2^7GwIoo";

    public static void main(String[] arguments) {
        Connection connection = null;
        Statement statement = null;
        try {
            //STEP 2: Register JDBC driver
            //Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = connection.createStatement();
            String sql;
            boolean status;
            ResultSet resultSet;
            sql = "CREATE TABLE IF NOT EXISTS movies (Ranking INTEGER PRIMARY KEY, Title VARCHAR(255), Released " +
                    "INTEGER, Actor " +
                    "VARCHAR(255), Director VARCHAR(255), Rating DECIMAL(3,1))";
            status = statement.execute(sql);
            sql = "INSERT IGNORE INTO movies (Ranking, Title, Released, Actor, Director, Rating) VALUES " +
                    "(1,'CITIZEN KANE',1941,'Orson Welles','Orson Welles',8.3)," +
                    "(2,'CASABLANCA',1942,'Humphrey Bogart','Michael Curtiz',8.5)," +
                    "(3,'GODFATHER, THE',1972,'Marlon Brando','Francis Ford Coppola',9.2)," +
                    "(4,'GONE WITH THE WIND',1939,'Clark Gable','Victor Fleming',8.1)," +
                    "(5,'LAWRENCE OF ARABIA',1962,'Peter O'' Toole','David Lean', 8.3)," +
                    "(6,'WIZARD OF OZ, THE',1939,'Judy Garland',' Victor Fleming',8.1)," +
                    "(7,'GRADUATE, THE',1967,'Dustin Hoffman','Mike Nichols', 8.0)," +
                    "(8,'ON THE WATERFRONT',1954,'Marlon Brando','Elia Kazan', 8.1)," +
                    "(9,'SCHINDLER''S LIST',1993,' Liam Neeson',' Steven Spielberg', 8.9)," +
                    "(10,'SINGIN'' IN THE RAIN',1952,'Gene Kelly','Stanley Donen',8.3)," +
                    "(11,'IT''S A WONDERFUL LIFE',1946,'James Stewart','Frank Capra',8.6)," +
                    "(12,'SUNSET BOULEVARD',1950,'William Holden','Billy Wilder', 8.4)," +
                    "(13,'BRIDGE ON THE RIVER KWAI, THE',1957,'William Holden','David Lean', 8.1)," +
                    "(14,'SOME LIKE IT HOT',1959,'Marilyn Monroe','Billy Wilder', 8.2)," +
                    "(15,'STAR WARS',1977,'Mark Hamill','George Lucas', 8.6)," +
                    "(16,'ALL ABOUT EVE',1950,'Bette Davis','Joseph L Mankiewicz', 8.2)," +
                    "(17,'AFRICAN QUEEN, THE',1951,'Humphrey Bogart','John Huston', 7.7)," +
                    "(18,'PSYCHO',1960,'Anthony Perkins','Alfred Hitchcock', 8.1)," +
                    "(19,'CHINATOWN',1974,' Jack Nicholson',' Roman Polanski', 8.1)," +
                    "(20,'ONE FLEW OVER THE CUCKOO''S NEST',1975,'Jack Nicholson','Milos Forman', 8.7)," +
                    "(21,'GRAPES OF WRATH, THE',1940,'Henry Fonda','John Ford', 8.0)," +
                    "(22,'2001: A SPACE ODYSSEY',1968,'Keir Dullea','Stanley Kubrick', 8.3)," +
                    "(23,'MALTESE FALCON, THE',1941,' Humphrey Bogart',' John Huston', 8.0)," +
                    "(24,'RAGING BULL',1980,'Robert De Niro','Martin Scorsese', 8.2)," +
                    "(25,'E.T. THE EXTRA-TERRESTRIAL',1982,'Henry Thomas','Steven Spielberg', 7.8)," +
                    "(26,'DR. STRANGELOVE',1964,'Peter Sellers','Stanley Kubrick', 8.4)," +
                    "(27,'BONNIE & CLYDE',1967,'Warren Beatty','Arthur Penn', 7.8)," +
                    "(28,'APOCALYPSE NOW',1979,'Martin Sheen','Francis Ford Coppola', 8.4)," +
                    "(29,'MR. SMITH GOES TO WASHINGTON',1939,'James Stewart','Frank Capra', 8.1)," +
                    "(30,'TREASURE OF THE SIERRA MADRE, THE',1948,'Humphrey Bogart','John Huston', 8.2)," +
                    "(31,'ANNIE HALL',1977,'Woody Allen','Woody Allen', 8.0)," +
                    "(32,'GODFATHER PART II, THE',1974,'Al Pacino','Francis Ford Coppola', 9.0)," +
                    "(33,'HIGH NOON',1952,' Gary Cooper',' Fred Zinnermann', 7.9)," +
                    "(34,'TO KILL A MOCKINGBIRD',1962,'Gregory Peck','Robert Mulligan', 8.2)," +
                    "(35,'IT HAPPENED ONE NIGHT',1934,'Clark Gable','Frank Capra', 8.1)," +
                    "(36,'MIDNIGHT COWBOY',1969,'Dustin Hoffman','John Schlesinger', 7.8)," +
                    "(37,'BEST YEARS OF OUR LIVES, THE',1946,'Myrna Loy','William Wyler', 8.0)," +
                    "(38,'DOUBLE INDEMNITY',1944,'Fred McMurray','Billy Wilder', 8.3)," +
                    "(39,'DOCTOR ZHIVAGO',1965,'Omar Sharif','David Lean', 8.0)," +
                    "(40,'NORTH BY NORTHWEST',1959,'Cary Grant','Alfred Hitchcock', 8.3)," +
                    "(41,'WEST SIDE STORY',1961,'Natalie Wood','Jerome Robbins', 7.5)," +
                    "(42,'REAR WINDOW',1954,'James Stewart','Alfred Hitchcock', 8.4)," +
                    "(43,'KING KONG',1933,'Fay Wray','Merian C. Cooper', 7.9)," +
                    "(44,'BIRTH OF A NATION, THE',1915,'Lillian Gish','JW Griffith', 6.3)," +
                    "(45,'STREETCAR NAMED DESIRE, A',1951,'Vivian Leigh','Elia Kazan', 8.0)," +
                    "(46,'CLOCKWORK ORANGE, A',1971,'Malcolm McDowell','Stanley Kubrick', 8.3)," +
                    "(47,'TAXI DRIVER',1976,'Robert De Niro','Martin Scorsese', 8.3)," +
                    "(48,'JAWS',1975,'Roy Scheider','Steven Spielberg', 8.0)," +
                    "(49,'SNOW WHITE & THE SEVEN DWARFS',1937,'Adriana Caselotti','William Cottrell', 7.6)," +
                    "(50,'BUTCH CASSIDY & THE SUNDANCE KID',1969,'Paul Newman','George Roy Hill', 8.0)," +
                    "(51,'PHILADELPHIA STORY, THE',1940,'Cary Grant','George Cukor', 7.9)," +
                    "(52,'FROM HERE TO ETERNITY',1953,' Burt Lancaster',' Fred Zinnermann', 7.6)," +
                    "(53,'AMADEUS',1984,'F Murray Abraham','Milos Forman', 8.3)," +
                    "(54,'ALL QUIET ON THE WESTERN FRONT',1930,'Lew Ayers','Lewis Milestone', 8.0)," +
                    "(55,'SOUND OF MUSIC, THE',1965,'Julie Andrews','Robert Wise', 8.0)," +
                    "(56,'M*A*S*H',1970,'Donald Sutherland','Robert Altman', 7.4)," +
                    "(57,'THIRD MAN, THE',1949,'Orson Welles','Carol Reed', 8.1)," +
                    "(58,'FANTASIA',1940,'Leopold Stokowski','James Algar', 7.7)," +
                    "(59,'REBEL WITHOUT A CAUSE',1955,'James Dean','Nicholas Ray', 7.7)," +
                    "(60,'RAIDERS OF THE LOST ARK',1981,'Harrison Ford','Steven Spielberg', 8.4)," +
                    "(61,'VERTIGO',1958,'James Stewart','Alfred Hitchcock', 8.3)," +
                    "(62,'TOOTSIE',1982,'Dustin Hoffman','Sydney Pollack', 7.4)," +
                    "(63,'STAGECOACH',1939,'John Wayne','John Ford', 7.8)," +
                    "(64,'CLOSE ENCOUNTERS OF THE THIRD KIND',1977,'Richard Dreyfus','Steven Spielberg', 7.6)," +
                    "(65,'SILENCE OF THE LAMBS, THE',1991,'Jodie Foster','Jonathan Demme', 8.6)," +
                    "(66,'NETWORK',1976,'Faye Dunaway','Sydney Lumet', 8.1)," +
                    "(67,'MANCHURIAN CANDIDATE, THE',1962,'Frank Sinatra','John Frankenheimer', 7.9)," +
                    "(68,'AMERICAN IN PARIS, AN',1951,'Gene Kelly','Vincente Minnelli', 7.2)," +
                    "(69,'SHANE',1953,'Alan Ladd','George Stevens', 7.6)," +
                    "(70,'FRENCH CONNECTION, THE',1971,'Gene Hackman','William Friedkin', 7.7)," +
                    "(71,'FORREST GUMP',1994,'Tom Hanks','Robert Zemeckis', 8.8)," +
                    "(72,'BEN-HUR',1959,'Charlton Heston','William Wyler', 8.1)," +
                    "(73,'WUTHERING HEIGHTS',1939,'Merle Oberon','William Wyler', 7.6)," +
                    "(74,'GOLD RUSH, THE',1925,'Charles Chaplin','Charles Chaplin', 8.2)," +
                    "(75,'DANCES WITH WOLVES',1990,'Kevin Costner','Kevin Costner', 8.0)," +
                    "(76,'CITY LIGHTS',1931,'Charles Chaplin','Charles Chaplin', 8.5)," +
                    "(77,'AMERICAN GRAFFITI',1973,'Richard Dreyfus','George Lucas', 7.4)," +
                    "(78,'ROCKY',1976,'Sylvester Stallone','John G Avildsen', 8.1)," +
                    "(79,'DEER HUNTER, THE',1978,'Robert De Niro','Michael Cimino', 8.1)," +
                    "(80,'WILD BUNCH, THE',1969,'William Holden','Sam Peckinpah', 7.9)," +
                    "(81,'MODERN TIMES',1936,'Charles Chaplin','Charles Chaplin', 8.5)," +
                    "(82,'GIANT',1956,'Elizabeth Taylor','George Stevens', 7.6)," +
                    "(83,'PLATOON',1986,'Charlie Sheen','Oliver Stone', 8.1)," +
                    "(84,'FARGO',1996,'William H Macy','Joel Coen', 8.1)," +
                    "(85,'DUCK SOUP',1933,'Groucho Marx','Leo McCarey', 7.8)," +
                    "(86,'MUTINY ON THE BOUNTY',1935,'Charles Laughton','Frank Lloyd', 7.7)," +
                    "(87,'FRANKENSTEIN',1931,'Colin Clive','James Whale', 7.8)," +
                    "(88,'EASY RIDER',1969,'Peter Fonda','Dennis Hopper', 7.3)," +
                    "(89,'PATTON',1970,'George C Scott','Franklin J Schaffner', 7.9)," +
                    "(90,'JAZZ SINGER, THE',1927,'Al Jolson','Alan Crosland', 6.5)," +
                    "(91,'MY FAIR LADY',1964,'Audrey Hepburn','George Cukor', 7.8)," +
                    "(92,'PLACE IN THE SUN, A',1951,'Montgomery Clift','George Stevens', 7.8)," +
                    "(93,'APARTMENT, THE',1960,'Jack Lemmon','Billy Wilder', 8.3)," +
                    "(94,'GOODFELLAS',1990,'Robert De Niro','Martin Scorsese', 8.7)," +
                    "(95,'PULP FICTION',1994,'John Travolta','Quentin Tarantino', 8.9)," +
                    "(96,'SEARCHERS, THE',1956,'John Wayne','Jon Ford', 7.9)," +
                    "(97,'BRINGING UP BABY',1938,'Katherine Hepburn','Howard Hawks', 7.9)," +
                    "(98,'UNFORGIVEN',1992,'Clint Eastwood','Clint Eastwood', 8.2)," +
                    "(99,'GUESS WHO''S COMING TO DINNER',1967,'Spencer Tracy','Stanley Kramer', 7.8)," +
                    "(100,'YANKEE DOODLE DANDY',1942,'James Cagney','Michael Curtiz', 7.7)";

            status = statement.execute(sql);
            sql = "SELECT Ranking, Title, Released, Actor, Director, Rating  FROM movies";

            resultSet = statement.executeQuery(sql);

            // Prepared Statement stuff
            String updateString = "SELECT * FROM movies WHERE Actor LIKE ? ORDER BY ? ASC";

            PreparedStatement updateTable = connection.prepareStatement(updateString);
            updateTable.setString(1,"%Robert%");
            updateTable.setString(2,"Ranking");
            resultSet = updateTable.executeQuery();

            //STEP 5: Extract data from result set
            while (resultSet.next()) {
                //Retrieve by column name
                int ranking = resultSet.getInt("Ranking");
                String title = resultSet.getString("Title");
                int released = resultSet.getInt("Released");
                String actor = resultSet.getString("Actor");
                String director = resultSet.getString("Director");
                double rating = resultSet.getDouble("Rating");

                //Display values
                System.out.print("Ranking: " + ranking);
                System.out.print(", Title: " + title);
                System.out.print(", Released: " + released);
                System.out.print(", Actor: " + actor);
                System.out.print(", Director: " + director);
                System.out.print(", Rating: " + rating);
                System.out.println();
            }
            //STEP 6: Clean-up environment
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException sqlException) {
            //Handle errors for JDBC
            sqlException.printStackTrace();
        } catch (Exception exception) {
            //Handle errors for Class.forName
            exception.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end MySQL
