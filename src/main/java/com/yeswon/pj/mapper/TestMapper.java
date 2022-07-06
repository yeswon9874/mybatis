package com.yeswon.pj.mapper;

import com.yeswon.pj.domain.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
//    List<Map<String, Object>> selectTest();
//
//    Map<String, Object> getData(Map<String, Object> map);
//
//    void insertData(Map<String, Object> map);
//
//    void updateData(Map<String, Object> map);

//
//        public BoardDto selectBoardDetail(Long seq);
//
//        public int updateBoard(BoardDto params);
//
//        public int deleteBoard(Long idx);

        List<BoardDto> selectBoardList() throws Exception;

        List<BoardDto> selectBoardList(BoardDto board) throws Exception;

        void insertBoard(BoardDto board) throws Exception;

        void updateMember(BoardDto board);
}
