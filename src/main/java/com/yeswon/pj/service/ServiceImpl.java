package com.yeswon.pj.service;

import com.yeswon.pj.domain.BoardDto;
import com.yeswon.pj.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements BoardService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<BoardDto> selectBoardList() throws Exception {
        return testMapper.selectBoardList();
    }

    @Override
    public BoardDto selectBoardList(BoardDto board) throws Exception {
        return testMapper.selectBoardList(board);
    }

    @Override
    public void insertBoard(BoardDto board) throws Exception {
        testMapper.insertBoard(board);
    }

    @Override
    public void updateMember(BoardDto board){
        testMapper.updateMember(board);
    }
}
