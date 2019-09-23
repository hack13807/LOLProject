package com.wells.lol.pojo;

import org.apache.ibatis.annotations.Results;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class Piece implements Serializable {
    @Id
    private Long id;

    /**
     * 棋子名称
     */
    @Column(name = "fname")
    private String name;

    /**
     * 棋子编码
     */
    @Column(name = "fnumber")
    private String number;

    /**
     * 攻击力
     */
    @Column(name = "fattack")
    private int attack;

    /**
     * 法术强度
     */
    @Column(name = "fmagic")
    private int magic;
    /**
     * 护甲
     */
    @Column(name = "farmor")
    private int armor;

    /**
     * 法术抗性
     */
    @Column(name = "fresistance")
    private int resistance;


    /**
     * 攻击距离
     */
    @Column(name = "fattack_distance")
    private int attack_distance;

    /**
     * 攻击速度
     */
    @Column(name = "fattack_speed")
    private float attack_speed;

    /**
     * 暴击率
     */
    @Column(name = "fcrit")
    private int crit;

    /**
     * 技能
     */
    @Column(name = "fskills")
    private int skills;

    public Long getFid() {
        return id;
    }

    public void setFid(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getAttack_distance() {
        return attack_distance;
    }

    public void setAttack_distance(int attack_distance) {
        this.attack_distance = attack_distance;
    }

    public float getAttack_speed() {
        return attack_speed;
    }

    public void setAttack_speed(float attack_speed) {
        this.attack_speed = attack_speed;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getSkills() {
        return skills;
    }

    public void setSkills(int skills) {
        this.skills = skills;
    }
}
