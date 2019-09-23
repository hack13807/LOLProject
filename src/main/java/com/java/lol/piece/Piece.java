package com.java.lol.piece;

import com.java.lol.common.JobEnum;
import com.java.lol.job.JobSpecies;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * 棋子父类
 */
public abstract class Piece {
    /**
     * 名称
     */
    protected String name;
    /**
     * 职业种族
     */
    protected  Set<JobSpecies> jobs = new HashSet<JobSpecies>();

    public Piece(String name,String[] jobName)  {
        for (String job:jobName
             ) {
            try {
                String className = JobEnum.getJobEnumByName(job);
                Class<?> jobClass = Class.forName(className);
                Method method = jobClass.getMethod("getInstance");
                Object jobSpecies = method.invoke(JobSpecies.class);
                jobs.add((JobSpecies) jobSpecies);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<JobSpecies> getJobs() {
        return jobs;
    }

    public void addJob(JobSpecies job) {
        this.jobs.add(job);
    }
}
