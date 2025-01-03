package study.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.sample.v1.Dept;
 
public class Quiz0103 {
	public static void main(String[] args) {
		List<ProfessorDTO> list = findProfessorListByDeptno(0); 
	}

	public static ProfessorDTO findProfessorListByDeptno(int deptno) { // 단일 조회
		
		
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
		
		List<ProfessorDTO> professorList = new ArrayList<ProfessorDTO>;
		
		// 쿼리 준비
		String sqlQuery = "select * from professor where deptno = ? ";
		
		try {// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			

			while(rs.next()) {
				ProfessorDTO p = new ProfessorDTO();
				
				p.setpNo(rs.getInt("profno"));
				p.setpName(rs.getString("name"));
				p.setpId(rs.getInt("id"));
				p.setpPosition(rs.getString("position"));
				p.setpPay(rs.getInt("pay"));
				p.setpDeptno(rs.getInt("deptno"));
			}
			
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
