package com.eternal.web.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER")
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity extends AbstractEntity {

    /** ユーザー名 */
    private String userName;

    /** アイコンパス */
    private String iconPath;

    /** 作成日時 */
    private LocalDateTime createDatetime;

    public static UserEntity of(String userName) {
        UserEntity entity = new UserEntity();
        entity.userName = userName;
        // TODO: アイコンの設定
        entity.createDatetime = LocalDateTime.now();
        return entity;
    }
}