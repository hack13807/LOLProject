package com.java.lol.common;

public enum JobEnum {

    Yodel("com.java.lol.job.Yodel","Լ�¶���",1),
    Gunners("com.java.lol.job.Gunners","ǹ��",5),
    Noble("com.java.lol.job.Noble","����",2),
    Magician("com.java.lol.job.Magician","��ʦ",1),
    Pirate("com.java.lol.job.Pirate","����",3),
    ShapeChanger("com.java.lol.job.ShapeChanger","����ʦ",2),
    Swordsman("com.java.lol.job.Swordsman","��ʿ",6),
    Fighter("com.java.lol.job.Fighter","��ʿ",1),
    Wildness("com.java.lol.job.Wildness","��Ұ",4),
    Ninja("com.java.lol.job.Ninja","����",2),
    Empire("com.java.lol.job.Empire","�۹�",1),
    Devil("com.java.lol.job.Devil","��ħ",1),
    Rogue("com.java.lol.job.Rogue","����",1),
    Poles("com.java.lol.job.Poles","����",1);

    private final String name;

    private final String number;

    private final int piecesCount;



    private JobEnum(String number,String name,int piecesCount)
    {
        this.number = number;
        this.name = name;
        this.piecesCount = piecesCount;
    }

    public String getName() {
        return name;
    }

    public int getPiecesCount() {
        return piecesCount;
    }

    public String getNumber() {
        return number;
    }
    public static String getJobEnumByName(String name){
        for(JobEnum jobEnum : JobEnum.values()){
            if(name.equals(jobEnum.getName())){
                return jobEnum.getNumber();
            }
        }
        return null;
    }

    public static int getPiecesCountEnumByName(String number){
        for(JobEnum jobEnum : JobEnum.values()){
            if(number.equals(jobEnum.getNumber())){
                return jobEnum.getPiecesCount();
            }
        }
        return 0;
    }
}