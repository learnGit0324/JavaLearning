package com.adam.csvFileOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.adam.modler.NewModel;

/**
 * Hello world!
 *
 */
public class App {
	
	 private static final String DRIVER_CLASS_NAME = "oracle.jdbc.driver.OracleDriver";
	 private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	 private static final String USER = "scott";
	 private static final String PASSWORD = "tiger";
	
	public static void main(String[] list) {
		String readPath = "C:\\Users\\badpc\\Desktop\\t.csv";
		CSVUtils csvUtils = new CSVUtils();
		List<NewModel> listData = csvUtils.readCsv(readPath);
		Object[][] params = new Object[listData.size()][];

		Iterator<NewModel> iterator = listData.iterator();
		while (iterator.hasNext()) {
			NewModel newModel= iterator.next();
			String str1 = newModel.getColumn_A();
			String str2 = newModel.getColumn_B();
			System.out.println("str1: "+str1+" str2: "+str2);
		}
		
		for (int i = 0; i < listData.size(); i++) {
			String str1 = listData.get(i).getColumn_A();
			String str2 = listData.get(i).getColumn_B();
			params[i] = new Object[] {str1, str2};   
		}
		batch(params);
//		csvUtils.writeCSV(listData);
	}
	
	public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(DRIVER_CLASS_NAME);
            conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            return conn;
        } catch (Exception e) {
            return null;
        }
    }
 
    public static void batch(Object[][] params) {
        QueryRunner queryRunner = new QueryRunner(true);
        String sql = "INSERT INTO scott.test_a_b (column_A,column_B) VALUES (?,?)";
        try {
            queryRunner.batch(getConnection(), sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
