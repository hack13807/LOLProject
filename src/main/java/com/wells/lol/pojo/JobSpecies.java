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
     * ��������
     */
    @Column(name = "ftriggerCount")
    private int triggerCount;

    /**
     * �����������׶�
     */
    @Column(name = "ftriggerCount2")
    private int triggerCount2;

    /**
     * �����������׶�
     */
    @Column(name = "ftriggerCount3")
    private int triggerCount3;

    /**
     * ��������
     */
    @Column(name = "ftriggerMaxCount")
    private int triggerMaxCount;

    /**
     * ְҵ��������
     */
    @Column(name = "fname")
    private String name;

    /**
     * ְҵ�������
     */
    @Column(name = "fnumber")
    private String number;
}
