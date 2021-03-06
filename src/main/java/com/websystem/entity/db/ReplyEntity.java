package com.websystem.entity.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reply")
public class ReplyEntity {

  @Id
  @Column(name = "reply_id")
  private String replyId;

  @Column(name = "note_id")
  private String noteId;

  @Column(name = "body")
  private String body;

  @Column(name = "created_day")
  private String createdDay;

  public String getReplyId() {
    return replyId;
  }

  public void setReplyId(String replyId) {
    this.replyId = replyId;
  }

  public String getNoteId() {
    return noteId;
  }

  public void setNoteId(String noteId) {
    this.noteId = noteId;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getCreatedDay() {
    return createdDay;
  }

  public void setCreatedDay(String createdDay) {
    this.createdDay = createdDay;
  }
}
