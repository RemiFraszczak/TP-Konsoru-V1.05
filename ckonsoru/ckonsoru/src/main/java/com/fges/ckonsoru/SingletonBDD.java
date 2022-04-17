import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class SingletonBDD {
    private static Connection uniqueInstance;
    private SingletonBDD() {}

    public static Connection getInstanceBdd() {
        if (uniqueInstance == null) {
            try{
                ConfigLoader cf = new ConfigLoader();
                Properties properties = cf.getProperties();
                String dbConnUrl = properties.getProperty("bdd.url");
                String dbUserName = properties.getProperty("bdd.login");
                String dbPassword = properties.getProperty("bdd.mdp");

                if(!"".equals(dbConnUrl)) {
                    Class.forName("org.postgresql.Driver");
                    Connection dbConn = DriverManager.getConnection(dbConnUrl, dbUserName, dbPassword);
                    uniqueInstance = dbConn;
                    return uniqueInstance;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

}
