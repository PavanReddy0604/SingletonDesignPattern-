package com.singleton;

//eager loading
public class DBConnection {

	public static DBConnection dbConnection = new DBConnection();

	private DBConnection() {

	}

	public static DBConnection getInstance() {
		return dbConnection;
	}

}

//Lazy loading
class DBConnection2 {

	public static DBConnection2 dbConnection;

	private DBConnection2() {

	}

	public static DBConnection2 getInstance() {
		if (dbConnection == null) {
			dbConnection = new DBConnection2();
		}
		return dbConnection;
	}

}

//not suitable for multithreaded environments
class DBConnection3 {
	
	public static DBConnection3 dbConnection;

	private DBConnection3() {

	}

	public static synchronized DBConnection3 getInstance() {
		if (dbConnection == null) {
			dbConnection = new DBConnection3();
		}
		return dbConnection;
	}
}


//Double Checked Locking
class DBConnection4 {
	
	public static DBConnection4 dbConnection;
	
	private DBConnection4() {

	}

	public static  DBConnection4 getInstance() {
		if (dbConnection == null) {
			synchronized (DBConnection4.class) {
				dbConnection = new DBConnection4();
			}

		}
		return dbConnection;
	}
}
