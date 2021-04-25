package test;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author jiangwenjie
 * @date 2021/4/24
 */
@Service
public class GoodsService {
	public String list(){
		System.out.println("商品列表：{[\"name\":\"apple\",\"price\":2999],[\"name\":\"apple\",\"price\":2999]}");
		return "商品列表：{[\"name\":\"apple\",\"price\":2999],[\"name\":\"apple\",\"price\":2999]}";
	}

	@Transactional(value = Transactional.TxType.REQUIRES_NEW)
	public Boolean saveGood(){
		System.out.println("插入。。。。。。");
		return Boolean.TRUE;
	}
}
