package finalCelalEmreYesiltepe.SpringBootRestApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@RequestMapping("/hasta")
public class HastaRestApi {

	public  static List<String> hastalar = new ArrayList<>();
		
		@GetMapping("/listele")
		public List<String>listele(){
				return hastalar;
		}
		
		@PostMapping("/ekle")
		public String ekle(@RequestBody String ad) {
				hastalar.add(ad);
				return ad;
		}
		
		@DeleteMapping("/sil")
		public String sil(@RequestBody String ad) {
				hastalar.remove(ad);
				return ad;
		}
		
	}	


