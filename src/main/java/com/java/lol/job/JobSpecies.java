package com.java.lol.job;

import com.java.lol.common.JobEnum;

import java.util.HashSet;
import java.util.Set;

/**
 * ְҵ����
 */
public abstract class JobSpecies {

    /**
     * ��������
     */
    protected int triggerCount;
    /**
     * �����������׶�
     */
    protected int triggerCount2;
    /**
     * ��������
     */
    protected int triggerMaxCount;
    /**
     * ְҵ��������
     */
    protected String name;
    /**
     * ְҵ�������
     */
    protected String number;
    /**
     * ��������
     */
    protected HashSet pieceSet;
    /**
     * ��������
     */
    protected int piecesCount;
    /**
     * ��������
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
