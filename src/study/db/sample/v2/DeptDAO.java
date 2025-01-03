package study.db.sample.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO = Data Access Object
public class DeptDAO {
	
	public  List<Dept> findDeptList() {

		Connection conn; // db 연결
		PreparedStatement psmt;
		ResultSet rs; // sql 실행 select 결과 저장하는 객체

		//insert update delete -> 실행 후 적용된 행의 갯수
//		public int saveDept(int deptno, String dname, String loc) {
		public int saveDept(Dept dept) {
			conn = DBConnectionManager.connectDB();	
			int result = 0;
		}

		List<Dept> deptList = new ArrayList<Dept>();

		// 쿼리 준비
		String sqlQuery = "insert into dept (deptno, dname, loc) values (?, ?, ?)";
		try {
			// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			//파라미터 셋팅
			psmt.setInt(1, dept.getDeptno());
			psmt.setString(2, dept.getDname());
			psmt.setString(3, dept.getLoc());
			
			// select -> executeQuery
			// insert, update, delete -> executeUpdate
			result = psmt.executeUpdate();
			
			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다
				// System.out.println(rs.getInt(1));
				// System.out.println(rs.getString(2));
				// System.out.println(rs.getString(3));
//				if(deptList == null)
//					deptList = new ArrayList<Dept>();

				Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				deptList.add(dept);

//				System.out.println(rs.getString("dname"));
//				System.out.println(rs.getInt("deptno"));
//				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return deptList;
	}
}
