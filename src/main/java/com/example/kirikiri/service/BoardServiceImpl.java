package com.example.kirikiri.service;

import com.example.kirikiri.domain.BoardVO;
import com.example.kirikiri.repository.BoardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("board") @Primary
public class BoardServiceImpl implements BoardService {
    private final BoardDAO boardDAO;

    @Override
    public List<BoardVO> getListAll() {
        return boardDAO.getListAll();
    }
    @Override
    public List<BoardVO> getListByCategory(String categoryName) {
        return boardDAO.getListByCategory(categoryName);
    }

    @Override
    public List<BoardVO> getListByDetailCategory(String detailCategoryName) {
        return boardDAO.getListByDetailCategory(detailCategoryName);
    }

    @Override
    public void add(BoardVO boardVO) {
        boardDAO.add(boardVO);
    }

    @Override
    public void delete(Long boardId) {
        boardDAO.delete(boardId);
    }

    @Override
    public void edit(BoardVO boardVO) {
        boardDAO.setBoardVO(boardVO);
    }

    @Override
    public BoardVO getBoard(Long boardId) {
        return boardDAO.findById(boardId);
    }
    @Override
    public List<BoardVO> getWrittenBoard(String userId, Integer page) {
        return boardDAO.WrittenBoard(userId, page);
    }
}
