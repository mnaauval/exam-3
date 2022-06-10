import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.nexsoft.Function;

public class Temperature {

	Function func;

	@BeforeEach
	public void init() {
		func = new Function();
	}

	@DisplayName("Suhu Data Normal")
	@ParameterizedTest
	@CsvFileSource(resources = "/data_suhu.csv", numLinesToSkip = 1)
	public void volumeWithTrueData(String no, double fahn, double hasil) {
		assertEquals(hasil, func.fahToCel(fahn));
	}
	
	@DisplayName("Suhu Data Negatif")
	@ParameterizedTest
	@CsvFileSource(resources = "/data_suhu.csv", numLinesToSkip = 1)
	public void volumeWithNegatifData(String no, double fahn, double hasil) {
		fahn *= -1;
		assertEquals(hasil, func.fahToCel(fahn));
	}
}
