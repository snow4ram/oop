package deomspringshop.shop;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class ShopApplicationTests {

	@Test
	void contextLoads()throws Exception{
		LocalDate localDateTime = LocalDate.parse("2023-01-19", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		Assertions.assertThat(localDateTime).isEqualTo(LocalDate.of(2023,1,19));


	}

}
