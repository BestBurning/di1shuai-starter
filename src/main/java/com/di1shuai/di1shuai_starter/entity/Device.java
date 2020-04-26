package com.di1shuai.di1shuai_starter.entity;

import com.di1shuai.di1shuai_starter.enums.Platform;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * @author: Bruce
 * @date: 2020-04-20
 * @description:
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Device {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long accountId;

    private String deviceName;

    private String deviceId;

    @Enumerated(EnumType.STRING)
    private Platform platform;

    private Boolean open;

    private String time;


}
