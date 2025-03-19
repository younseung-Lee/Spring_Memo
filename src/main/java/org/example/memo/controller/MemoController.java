package org.example.memo.controller;

import org.example.memo.dto.MemoRequestDto;
import org.example.memo.dto.MemoResponseDto;
import org.example.memo.entity.Memo;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/memos")
public class MemoController {
    private final Map<Long, Memo> memoList = new HashMap<>();

    //생성
    @PostMapping
    public MemoResponseDto createMemo(@RequestBody MemoRequestDto dto) {
        // 식별자가 1씩 증가 하도록 만듦
        Long memoId =  memoList.isEmpty() ? 1 : Collections.max(memoList.keySet()) + 1;

        // 요청받은 데이터로 Memo 객체 생성
        Memo memo = new Memo(memoId, dto.getTitle(), dto.getContents());
        // Inmemory DB에 Memo 메모
        memoList.put(memoId,memo);

        return new MemoResponseDto(memo);
    }
    //조회
    @GetMapping("/{id}")
    public MemoResponseDto findMemoById(@PathVariable Long id) {
        Memo memo = memoList.get(id);

        return new MemoResponseDto(memo);
    }

    // 수정
    @PutMapping("/{id}")
    public MemoResponseDto updateMemoById(
            @PathVariable Long id,
            @RequestBody MemoRequestDto dto
            ) {
        Memo memo = memoList.get(id);
        memo.update(dto);
        return new MemoResponseDto(memo);

    }

    // 삭제
    @DeleteMapping("/{id}")
    public void deleteMemo(@PathVariable Long id){
        memoList.remove(id);

    }


}
