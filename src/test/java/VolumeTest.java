import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.nexsoft.Function;

public class VolumeTest {

	Function func;

	@BeforeEach
	public void init() {
		func = new Function();
	}

	@DisplayName("Volume Data Normal")
	@ParameterizedTest
	@CsvFileSource(resources = "/data_volume.csv", numLinesToSkip = 1)
	public void volumeWithTrueData(String no, double panjang, double lebar, double tinggi, int hasil) {
		assertEquals(hasil, func.volumePool(panjang, lebar, tinggi));
	}
	
	@DisplayName("Volume Data Negatif")
	@ParameterizedTest
	@CsvFileSource(resources = "/data_volume.csv", numLinesToSkip = 1)
	public void volumeWithNegatifeData(String no, double panjang, double lebar, double tinggi, int hasil) {
		panjang *= -1;
		lebar *= -1;
		tinggi *= -1;
		assertEquals(hasil, func.volumePool(panjang, lebar, tinggi));
	}
}
