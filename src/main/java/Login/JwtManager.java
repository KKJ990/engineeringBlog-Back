package Login;

import org.springframework.stereotype.Component;

@Component
public class JwtManager {
	
	private final String securityKey = "hello world"; // TODO 민감정보는 따로 분리하는 것이 좋다
	 private final Long expiredTime = 1000 * 60L * 60L * 3L; // 유효시간 3시간


}
