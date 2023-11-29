package genericutilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
public class DBUtils {
	Connection con;
	Statement state;
	public void getConnectionDB() throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(IPathConstants.DB_PATH,IPathConstants.DB_UN,IPathConstants.DB_PW);
		state=con.createStatement();
	}
	
	public boolean isDataPresent(String query, String searchData,int searchColumn) throws SQLException {
		ResultSet result=state.executeQuery(query);
		boolean flag=false;
		while(result.next()) 
			if(searchData.equalsIgnoreCase(result.getString(searchColumn))) {
				flag=true;
				break;
			}
				
		if(flag) {
			System.out.println("Data is present");
			return flag;
		}
		else {
			System.out.println("Data is not present");
			return flag;
		}
		
	}
	
	
	public void writeDataDB(String writeDataQuery) throws SQLException {
		int writeDataDBR=state.executeUpdate(writeDataQuery);
		System.out.println("Updata success and return value: "+writeDataDBR );
	}
	public void closeDBConn() throws SQLException {
		con.close();
	}
}
