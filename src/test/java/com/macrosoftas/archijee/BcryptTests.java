package com.macrosoftas.archijee;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.autoconfigure.orm.jpa.*;
import com.macrosoftas.archijee.repository.UserRepository;
import com.macrosoftas.archijee.model.User;
import com.macrosoftas.archijee.ArchiJEEApplication;
import static org.assertj.core.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.List;

@RunWith(SpringRunner.class)
public class BcryptTests {

	@Test
	public void testExample() throws Exception {
		BCryptPasswordEncoder bCryptPasswordEncoderLocal = new BCryptPasswordEncoder();
		String encodepwd2017 = bCryptPasswordEncoderLocal.encode("admin2017");
		String encodepwd2018 = bCryptPasswordEncoderLocal.encode("admin2018");
		System.out.println("encodepwd2017 ="+ encodepwd2017);
		System.out.println("encodepwd2018 ="+ encodepwd2018);
		assertThat(encodepwd2017).isNotEqualTo(encodepwd2018);
	}

	@Test
	public void testExample2() throws Exception {
		BCryptPasswordEncoder bCryptPasswordEncoderLocal = new BCryptPasswordEncoder();
		String encodepwd2017 = bCryptPasswordEncoderLocal.encode("admin2017");
		String encodepwd2017bis = bCryptPasswordEncoderLocal.encode("admin2017");
		System.out.println("encodepwd2017 ="+ encodepwd2017);
		System.out.println("encodepwd2017bis ="+ encodepwd2017bis);

		assertThat(encodepwd2017).isNotEqualTo(encodepwd2017bis);
	}
}
