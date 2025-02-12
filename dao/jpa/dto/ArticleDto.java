package com.sismics.reader.core.dao.jpa.dto;

import java.util.Date;

public class ArticleDto {
    private String id;
    private String feedId;
    
    // Metadata fields
    private String url;
    private String baseUri;
    private String guid;
    
    // Content fields
    private String title;
    private String creator;
    private String description;
    
    // Comment fields
    private String commentUrl;
    private Integer commentCount;
    
    // Enclosure fields
    private String enclosureUrl;
    private Integer enclosureLength;
    private String enclosureType;
    
    // Date fields
    private Date publicationDate;
    private Date createDate;

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFeedId() { return feedId; }
    public void setFeedId(String feedId) { this.feedId = feedId; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getBaseUri() { return baseUri; }
    public void setBaseUri(String baseUri) { this.baseUri = baseUri; }

    public String getGuid() { return guid; }
    public void setGuid(String guid) { this.guid = guid; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCreator() { return creator; }
    public void setCreator(String creator) { this.creator = creator; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCommentUrl() { return commentUrl; }
    public void setCommentUrl(String commentUrl) { this.commentUrl = commentUrl; }

    public Integer getCommentCount() { return commentCount; }
    public void setCommentCount(Integer commentCount) { this.commentCount = commentCount; }

    public String getEnclosureUrl() { return enclosureUrl; }
    public void setEnclosureUrl(String enclosureUrl) { this.enclosureUrl = enclosureUrl; }

    public Integer getEnclosureLength() { return enclosureLength; }
    public void setEnclosureLength(Integer enclosureLength) { this.enclosureLength = enclosureLength; }

    public String getEnclosureType() { return enclosureType; }
    public void setEnclosureType(String enclosureType) { this.enclosureType = enclosureType; }

    public Date getPublicationDate() { return publicationDate; }
    public void setPublicationDate(Date publicationDate) { this.publicationDate = publicationDate; }

    public Date getCreateDate() { return createDate; }
    public void setCreateDate(Date createDate) { this.createDate = createDate; }
}