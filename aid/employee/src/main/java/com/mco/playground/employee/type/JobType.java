package com.mco.playground.employee.type;

import com.mco.playground.employee.common.Person;
import com.mco.playground.employee.job.Cleaner;
import com.mco.playground.employee.job.Zookeeper;

/**
 * create on 2023/11/01.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public enum JobType {
  ZOOKEEPER, CLEANER;

  public static Person getJobPerson(JobType type, String name, String phoneNumber) {
    if (JobType.ZOOKEEPER == type) {
      return new Zookeeper(name, phoneNumber);
    }

    if (JobType.CLEANER == type) {
      return new Cleaner(name, phoneNumber);
    }

    throw new IllegalArgumentException("해당 직업은 아직 채용하지 않습니다.");
  }
}
