package com.wells.lol.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_jobspecies")
public class JobSpecies {
    @Id
    private Long fid;

    /**
     * 触发数量
     */
    @Column(name = "ftriggerCount")
    private int triggerCount;

    /**
     * 触发数量二阶段
     */
    @Column(name = "ftriggerCount2")
    private int triggerCount2;

    /**
     * 触发数量三阶段
     */
    @Column(name = "ftriggerCount3")
    private int triggerCount3;

    /**
     * 触发上限
     */
    @Column(name = "ftriggerMaxCount")
    private int triggerMaxCount;

    /**
     * 职业种族名称
     */
    @Column(name = "fname")
    private String name;

    /**
     * 职业种族编码
     */
    @Column(name = "fnumber")
    private String number;
}
