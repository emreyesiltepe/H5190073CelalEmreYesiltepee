package finalCelalEmreYesiltepe.SpringBootRestApi;

import static org.junit.Assert.*;

import org.junit.Test;



public class HastaRestApiTest {

	@Test
	public void testListele() {
		if(HastaRestApi.hastalar.size()<=0) {
			System.out.println("Veri Yoktur");
		}
		else {
			System.out.println("Veri Bulunmaktadır");
		}
	}
	@Test
	public void testEkle() {
		for(int i=0;i<HastaRestApi.hastalar.size();i++){
			if(HastaRestApi.hastalar.get(i).equals("")) {
				System.out.println("Aranılan Değer Vardır");
			}
		    System.out.println(HastaRestApi.hastalar.get(i));
		}
	}
	@Test
	public void testSil() {
		for(int i=0;i<HastaRestApi.hastalar.size();i++){
			if(HastaRestApi.hastalar.get(i).equals("")) {
				System.out.println("Aranılan Değer Listede Bulunamamıştır");
			}
		   
		}
	}
	
}
