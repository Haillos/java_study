package study.Practice;

public class ProfessorDTO {
	int pNo;
	String pName;
	int pId;
	String pPosition;
	int pPay;
	int pDeptno;
	
	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpPosition() {
		return pPosition;
	}

	public void setpPosition(String pPosition) {
		this.pPosition = pPosition;
	}

	public int getpPay() {
		return pPay;
	}

	public void setpPay(int pPay) {
		this.pPay = pPay;
	}

	public int getpDeptno() {
		return pDeptno;
	}

	public void setpDeptno(int pDeptno) {
		this.pDeptno = pDeptno;
	}

	public ProfessorDTO() {
		
	}
	
	public ProfessorDTO(int pNo, String pName, int pId, String pPosition, int pPay, int pDeptno  ) {
		this.pNo = pNo;
		this.pName = pName;
		this.pId = pId;
		this.pPosition = pPosition;
		this.pPay = pPay;
		this.pDeptno = pDeptno;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "professorDTO [
	}
}
