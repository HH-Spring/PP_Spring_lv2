package org.sparta.hh_lv2.inter;

import java.time.LocalDateTime;

public interface BookDetailView {
    Long getbook_id();
    Long getuser_id();
    String getTitle();
    String getAuthor();
    String getLanguage();
    String getPublisher();
    LocalDateTime getCreated_at();
    LocalDateTime getModified_at();
    String getLoan_status();
}
