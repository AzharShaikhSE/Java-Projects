import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;


import com.sbi.dao.DropdownList;
import com.sbi.servlet.DropdownServlet;


public class testdb {

	public static void main(String[] args) throws SQLException, ServletException, IOException {
		//DropdownList dl=new DropdownList();
		
		DropdownServlet d=new DropdownServlet();
		d.doGet(null,null);
	
		
	
		
	}
}

