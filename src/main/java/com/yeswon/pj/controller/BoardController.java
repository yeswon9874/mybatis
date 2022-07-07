package com.yeswon.pj.controller;

import com.yeswon.pj.domain.BoardDto;
import com.yeswon.pj.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

//    @GetMapping("/list")
//    public String list() {
//        return "list";
//    }

    @GetMapping("/board/openBoardList.do") //노테이션의 값으로 주소 지정
    public List<BoardDto> selectBoardList() throws Exception{
        //templates 폴더 아래있는 /boardList.html을 의미함. Thymeleaf와 같은 템플릿엔진을 사용할 경우 스프링 부트의 자동 설정 기능으로 '.html'과 같은 접미사 생략 가능
        ModelAndView mv = new ModelAndView("/boardList");
        //게시글 목록을 조회하기 위해 ServiceImpl 클래스의 selectBoardList 메서드 호출
        List<BoardDto> list = boardService.selectBoardList();

        return list;

    }

    @GetMapping("/board/openBoardListSeq.do") //노테이션의 값으로 주소 지정
    public BoardDto selectBoardListSeq(@ModelAttribute BoardDto board) throws Exception{
        //templates 폴더 아래있는 /boardList.html을 의미함. Thymeleaf와 같은 템플릿엔진을 사용할 경우 스프링 부트의 자동 설정 기능으로 '.html'과 같은 접미사 생략 가능
        ModelAndView mv = new ModelAndView("/boardList");
        System.out.println("boardDTD :: " + board);
        //게시글 목록을 조회하기 위해 ServiceImpl 클래스의 selectBoardList 메서드 호출
        BoardDto dto = (BoardDto) boardService.selectBoardList(board);
        return dto;

    }

    @RequestMapping("/board/boardWrite.do")		//게시글 작성 화면 호출
    public String openBoardWrite() throws Exception{
        return "/boardWrite";
    }

    @RequestMapping("/board/insertBoard.do")		//작성된 게시글 등록 기능 메소드, html의 form 태그 action에서 입력한 주소
    public String insertBoard(@ModelAttribute BoardDto board) throws Exception{
        boardService.insertBoard(board);
        return "success";	//게시글 리스트로 이동
    }

    // 수정페이지
    @RequestMapping("/board/updateBoard.do")
    public String updateMember(@ModelAttribute BoardDto board) throws Exception{
        boardService.updateMember(board);
        System.out.println("boardDTD :: " + board);
        return "overlab";	// 수정페이지
    }
}
