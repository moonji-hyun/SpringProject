package com.happytable.mapper;

import java.util.List;

import com.happytable.domain.MemberVO;

public interface MemberMapper {

	// 멤버 회원가입
	public int insert(MemberVO memberVO);

	// 멤버의 로그인
	public MemberVO select(MemberVO memberVO);
	
	// 멤버 객체가지고 수정
	public int update(MemberVO memberVO);

	// 멤버 번호로 삭제
	public int delete(Long mno);

	// 전체 회원 리스트 (관리자에서 아마 사용할듯)
	public List<MemberVO> allSelect();
	
	// 정보 조회용
	public MemberVO read(Long mno);
	
	//아이디 중복 처리용(미구현)
	public MemberVO checkEm(String email);
	
	//닉네임 중복 처리용(미구현) 
	public MemberVO checkNn(String nickName);
	
	//id찾기
	public MemberVO findID(MemberVO memberVO);
	
	//pw찾기
	public MemberVO findPW(MemberVO memberVO);

}
