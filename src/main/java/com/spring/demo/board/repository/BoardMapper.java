package com.spring.demo.board.repository;

import com.spring.demo.board.domain.Board;
import com.spring.demo.common.paging.Page;
import com.spring.demo.common.search.Search;
import com.spring.demo.member.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    // 게시글 쓰기 기능
    boolean save(Board board);

    // 게시글 전체 조회
    List<Board> findAll();

    // 게시글 전체 조회 with paging
    List<Board> findAll(Page page);
    // 게시글 전체 조회 with searching
    List<Board> findAll2(Search search);

    // 게시글 상세 조회
    Board findOne(Long boardNo);

    // 게시글 삭제
    boolean remove(Long boardNo);

    // 게시글 수정
    boolean modify(Board board);

    // 전체 게시물 수 조회
    int getTotalCount();
    int getTotalCount2(Search search);

    // 조회수 상승 처리
    void upViewCount(Long boardNo);


}
