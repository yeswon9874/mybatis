package com.yeswon.pj.service;

import com.yeswon.pj.domain.BoardDto;
import java.util.List;

public interface BoardService {
   public List<BoardDto> selectBoardList() throws Exception;

   public BoardDto selectBoardList(BoardDto board) throws Exception;
   public void insertBoard(BoardDto board) throws Exception;

   public void updateMember(BoardDto board);
}
