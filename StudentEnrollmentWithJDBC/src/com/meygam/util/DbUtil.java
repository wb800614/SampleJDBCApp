package com.meygam.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbUtil {
	private static Connection dbConnection = null;

	public static Connection getConnection() {
		if (dbConnection != null) {
			return dbConnection;
		} else {
			try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
					String conn = "jdbc:sqlserver://sql7005.site4now.net;" +  
							   "databaseName=DB_A4A3D0_soar;user=DB_A4A3D0_soar_admin;password=1234TTTT;";
					dbConnection = DriverManager.getConnection(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return dbConnection;
		}
	}
}
