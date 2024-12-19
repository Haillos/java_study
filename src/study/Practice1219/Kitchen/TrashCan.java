package study.Practice1219.Kitchen;

public class TrashCan {
	int liter;
	String color;
	int percent;
	boolean isCoverOpened;
	
	public void openCover() {
		isCoverOpened = true;
	}
	
	public void closeCover() {
		isCoverOpened = false;
	}
	
	public void cleanTrashCan() {
		percent = 0;
	}
	
	public void insertTrash(int percent) {//20%
		this.percent += percent;
	}
	
	public void insertTrashLiter(int Liter) {//3L
		percent = percent + (liter/this.liter *100);
	}
	// 10 + (3L/10L) * 100
	
}
