package com.mco.playground.employee.common;

/**
 * create on 2023/10/31.
 * create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 *
 * @author Gibyoung Chae (keepbang)
 * @version 1.0
 * @since 1.0
 */
public abstract class Person {

  private String name;

  private String phoneNumber;

  public Person(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }
}
