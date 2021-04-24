package test;

import org.springframework.stereotype.Service;

/**
 * @author jiangwenjie
 * @date 2021/4/24
 */
@Service
public class UserServiceImpl implements UserService {
	@Override
	public String speak(Long id) {
		return "speak "+id ;
	}
}
