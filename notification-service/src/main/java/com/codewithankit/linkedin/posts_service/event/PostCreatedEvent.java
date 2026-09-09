package com.codewithankit.linkedin.posts_service.event;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostCreatedEvent {
    Long creatorId;
    String content;
    Long postId;
}
