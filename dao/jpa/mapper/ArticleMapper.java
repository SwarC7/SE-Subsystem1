package com.sismics.reader.core.dao.jpa.mapper;

import com.sismics.reader.core.dao.jpa.dto.ArticleDto;
import com.sismics.util.jpa.ResultMapper;

public class ArticleMapper extends ResultMapper<ArticleDto> {
    @Override
    public ArticleDto map(Object[] o) {
        int i = 0;
        ArticleDto dto = new ArticleDto();
        
        // Core fields
        dto.setId(stringValue(o[i++]));
        dto.setFeedId(stringValue(o[i++]));
        
        // Metadata fields
        dto.setUrl(stringValue(o[i++]));
        dto.setBaseUri(stringValue(o[i++]));
        dto.setGuid(stringValue(o[i++]));
        
        // Content fields
        dto.setTitle(stringValue(o[i++]));
        dto.setCreator(stringValue(o[i++]));
        dto.setDescription(stringValue(o[i++]));
        
        // Comment fields
        dto.setCommentUrl(stringValue(o[i++]));
        dto.setCommentCount(intValue(o[i++]));
        
        // Enclosure fields
        dto.setEnclosureUrl(stringValue(o[i++]));
        dto.setEnclosureLength(intValue(o[i++]));
        dto.setEnclosureType(stringValue(o[i++]));
        
        // Date fields
        dto.setPublicationDate(dateValue(o[i++]));
        dto.setCreateDate(dateValue(o[i]));

        return dto;
    }
}