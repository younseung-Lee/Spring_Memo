package org.example.memo.dto;

import lombok.Getter;
import org.example.memo.entity.Memo;

@Getter
public class MemoResponseDto {
    private Long id;
    private String title;
    private String contents;

    public MemoResponseDto(Memo memo){
        this.id = memo.getId();
        this.title = memo.getTitle();
        this.contents = memo.getContents();
    }
}
