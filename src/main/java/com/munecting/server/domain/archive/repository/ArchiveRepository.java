package com.munecting.server.domain.archive.repository;

import com.munecting.server.domain.archive.dto.get.ArchivePlusRes;
import com.munecting.server.domain.archive.entity.Archive;
import com.munecting.server.domain.music.dto.post.UploadMusicReq;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ArchiveRepository {
    private final EntityManager em;
    //아카이브 상세 페이지 조회
    public ArchivePlusRes getArchivePlus(Long id){
        return em.createQuery("select new com.munecting.server.domain.archive.dto.get.ArchivePlusRes(a.musicId.name, a.memberId.nickname,a.createAt,a.musicId.coverImg)" +
                        " from Archive a" +
                        " where a.id = :id ", ArchivePlusRes.class)
                .setParameter("id",id)
                .getSingleResult();
    }
    //음악 upload-archiveEntity
    public void postArchive(Archive archive){
        em.persist(archive);
    }


}
