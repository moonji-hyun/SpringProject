package com.happytable.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.happytable.domain.RestaurantVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class RestaurantMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private RestaurantMapper mapper;
	
	
	//restaurantMapper
	@Test
	public void testMapper(){
		log.info(mapper);
	}
	
	@Test
	public void testInsert() {
		RestaurantVO vo = new RestaurantVO();
		vo.setResID("test3");
		vo.setResPW("test3");
		vo.setResName("test3");
		vo.setResAddr("test3");
		vo.setCo_Num("test3");
		vo.setSummary("test3");
		vo.setResPhone("test3");
		vo.setCertify("test3");
		
		int result = mapper.insert(vo);
		log.info("등록결과 : "+result); //등록결과 : 1
	}
	
	@Test
	public void testReadnum() {
		log.info("레스토랑 정보-10000002tes"+mapper.readByResnum("10000002tes"));
		//RestaurantVO(resID=test, resPW=test, resNum=10000002tes, resName=테스트식당, resAddr=수원시 권선구, co_Num=111-11-11111, certify=위생인증, summary=테스트용식당, 맛은 보장 못하는데요., regDate=2024-09-02)
	}
	
	@Test
	public void testUpdate() {
		RestaurantVO vo = mapper.readByResnum("10000002tes");
		vo.setResName("테스트식당 수정");
		int rst = mapper.update(vo);
		log.info("수정결과:" + rst); //수정결과:1
		}
	
	@Test
	public void testList() {
		log.info("=============");
		List<RestaurantVO> list = mapper.resList();
		list.forEach(rests->log.info(rests));
	}
	
	@Test
	public void testDelete() {
		log.info("삭제개수 : "+mapper.delete("10000003tes")); //삭제개수 : 1
	}
	
	@Test
	public void testlogin() {
		RestaurantVO vo= mapper.login("test", "test");
		log.info("로그인 매장 : " + vo.getResName());//로그인 매장 : 테스트식당 수정
	}
	

}
