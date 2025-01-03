package study.Practice.Prac0102;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbPrac {

	public static void main(String[] args) {
		ProductDTO pd = findProfessorListByDeptno(int deptno);
		if(pd != null) {
			System.out.println("%d %s %d\n", pd.getpCode(), pd.getpName(), pd.getpPrice());
		}
	}

	public static void findProfessorListByDeptno(int deptno) { // 단일 조회
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		// Statement stmt = null; // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 select 결과 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		List<ProductDTO> productList = new ArrayList<ProductDTO>;
		
		// 쿼리 준비
		String sqlQuery = "select * from professor where deptno = ? ";
		
		try {// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			if (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다
				// System.out.println(rs.getInt(1));
				// System.out.println(rs.getString(2));
				// System.out.println(rs.getString(3));
				pi = new ProfessorDTO();
				
				pd.setpNo(rs.getInt("p_code"));
				pd.setpName(rs.getString("p_name"));
				pd.setpID(rs.getInt("p_price"));
				pd.
//while(rs.next()) {
//	ProductDTO pd = new ProductDTO(rs.getInt("p_code"),rs.getString("p_name"), rs.getInt("p_price"));
//}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	}

	public static List<ProductDTO> findProductList() {// 복수(리스트) 조회
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
