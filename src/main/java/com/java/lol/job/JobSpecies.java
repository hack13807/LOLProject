package com.java.lol.job;

import com.java.lol.common.JobEnum;

import java.util.HashSet;
import java.util.Set;

/**
 * 职业种族
 */
public abstract class JobSpecies {

    /**
     * 触发数量
     */
    protected int triggerCount;
    /**
     * 触发数量二阶段
     */
    protected int triggerCount2;
    /**
     * 触发上限
     */
    protected int triggerMaxCount;
    /**
     * 职业种族名称
     */
    protected String name;
    /**
     * 职业种族编码
     */
    protected String number;
    /**
     * 包含棋子
     */
    protected HashSet pieceSet;
    /**
     * 棋子数量
     */
    protected int piecesCount;
    /**
     * 能力描述
     */
    protected String power;

    public JobSpecies(String name, String number, String power) {
        this.name = name;
        this.number = number;
        this.power = power;
        this.piecesCount = (int) JobEnum.getPiecesCountEnumByName(number);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPieceSet(HashSet allPieces) {
        this.pieceSet = allPieces;
    }

    public void setPiecesCount(int piecesCount) {
        this.piecesCount = piecesCount;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getTriggerMaxCount() {
        return triggerMaxCount;
    }

    public void setTriggerMaxCount(int triggerMaxCount) {
        this.triggerMaxCount = triggerMaxCount;
    }

    public String getName() {
        return name;
    }

    public HashSet getPieceSet() {
        return pieceSet;
    }

    public int getTriggerCount() { return triggerCount; }

    public void setTriggerCount(int triggerCount) {
        this.triggerCount = triggerCount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPiecesCount() {
        return piecesCount;
    }

    public int getTriggerCount2() { return triggerCount2; }

    public String getPower() {
        return power;
    }

    public Set addPiece(String pieceName) throws ClassNotFoundException {
        pieceSet.add(pieceName);
        return pieceSet;
    }

    public abstract String isPower(int count);

}
