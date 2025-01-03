package study.db.sample.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
public class ProductDAO {
	public List<Product> findProductList() {

		Connection conn = null; // db 연결
		// Statement stmt = null; // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String sqlQuery = "select * from product";
		List<Product> productList = new ArrayList<Product>;
		try {
			// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다
				productList.add(new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
	}

	// readDept findDept findDeptList
	public static void selectDept() {

		Connection conn = null; // db 연결
		// Statement stmt = null; // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String sqlQuery = "select * from dept";
		try {
			// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다
				// System.out.println(rs.getInt(1));
				// System.out.println(rs.getString(2));
				// System.out.println(rs.getString(3));

				System.out.println(rs.getString("dname"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
	}
}
