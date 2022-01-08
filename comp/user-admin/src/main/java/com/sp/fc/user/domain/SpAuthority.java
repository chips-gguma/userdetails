package com.sp.fc.user.domain;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity // db에 저장해야 함
public class SpAuthority implements GrantedAuthority {

    private Long userId;
    private String authority;

}
