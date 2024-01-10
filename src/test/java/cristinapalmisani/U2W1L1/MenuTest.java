package cristinapalmisani.U2W1L1;

import ch.qos.logback.classic.spi.ILoggingEvent;
import cristinapalmisani.U2W1L1.entities.AlcolicDrink;
import cristinapalmisani.U2W1L1.entities.Drinks;
import cristinapalmisani.U2W1L1.entities.Menu;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MenuTest {
private static AnnotationConfigApplicationContext ctx;
private Menu menu;
	@BeforeAll
	static void beforeAll() {
		ctx = new AnnotationConfigApplicationContext(U2W1L1Application.class);
	}
	@Test
	void testDrinkPrice() {
		Drinks water = ctx.getBean("water", Drinks.class);
		AlcolicDrink beer = ctx.getBean("beer", AlcolicDrink.class);
		double tot = (water.getPrice() + beer.getPrice());
		assertEquals(5, tot);

	}

}
