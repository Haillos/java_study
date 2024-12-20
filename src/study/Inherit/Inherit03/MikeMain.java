package study.Inherit.Inherit03;

import java.util.ArrayList;

public class MikeMain {
	public static void main(String[] args) {
		
		BluetoothMike m1 = new BluetoothMike();
		m1.volumeUp();
		m1.volumeUp("sdfa");
		
		WirelessMike m2 = new WirelessMike();
		m2.volumeUp();
		
		Mike m3 = new Mike();
		m3.volumeUp();
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		WirelessMike m4 = m2;
		Mike m5 = m1;
		Mike m6 = m2;
		
		Mike m7 =new BluetoothMike();
		Mike m8 = new WirelessMike();
		
		int[] arri = {1,2,3,4,6};
		Mike[] arr = {new Mike(), new BluetoothMike(), new WirelessMike()};
		
		
		Mike temp = null;
		BluetoothMike temp2 = m1;
		WirelessMike temp3 = null;
		
		Mike temp4 = null;
		ArrayList<Mike> list = new ArrayList<Mike>();
		list.add(new Mike());
		list.add(new BluetoothMike());
		list.add(new WirelessMike());
		
		
	}
}
