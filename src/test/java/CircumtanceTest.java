import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.nexsoft.Function;

public class CircumtanceTest {

	Function func;
	
	@BeforeEach
	public void init() {
		func = new Function();
	}
	
	@DisplayName("Circumtance Data Normal")
	@ParameterizedTest
	@CsvFileSource(resources = "/data_circumtances.csv", numLinesToSkip = 1)
	public void circumtanceWithTrueData(String no, double panjang, double lebar, double tinggi, int hasil) {
		assertEquals(hasil, func.circumtancePool(panjang, lebar, tinggi));
	}
	
	@DisplayName("Circumtance Data Negatif")
	@ParameterizedTest
	@CsvFileSource(resources = "/data_circumtances.csv", numLinesToSkip = 1)
	public void circumtanceWithNegatifData(String no, double panjang, double lebar, double tinggi, int hasil) {
		panjang *= -1;
		lebar *= -1;
		tinggi *= -1;
		assertEquals(hasil, func.circumtancePool(panjang, lebar, tinggi));
	}

}
