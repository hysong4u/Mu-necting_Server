package com.munecting.server.domain.archive.dto.get;

import com.munecting.server.domain.music.entity.MusicGenre;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArchiveRes {
    private String name;
    private String coverImg;
    private MusicGenre genre;
    private String musicPre;
    private String musicPull;
    private int replyCnt;
    private Long archiveId;
}
