/*
 * Copyright (C) 2023-2023 MCorporation(https://mcorpor.com/) - All Rights Reserved.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 *
 * Written by dev team, sghwang<sg.hwang@mcorpor.com>
 * Last modified on 2023/10/30
 */

package com.mco.playground.shared.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * create on 10/30/23. create by IntelliJ IDEA.
 *
 * <p> 동물의 과. </p>
 *
 * @author SeokGyu Hwang
 * @version 1.0
 * @since 1.0
 */
@Getter
@RequiredArgsConstructor
public enum AnimalClass {
  /**
   * 포유류.
   */
  MAMMAL("포유류"),

  /**
   * 조류.
   */
  BIRD("조류"),

  /**
   * 어류.
   */
  FISH("어류"),
  ;

  /**
   * enum value.
   */
  private final String value;

  /**
   * 입력받은 {@code value}에 해당하는 {@code AnimalType}을 리턴.
   *
   * @param value enum value
   * @return {@code AnimalType} (찾지 못하면 {@code null})
   */
  @JsonCreator
  public static AnimalClass fromValue(String value) {
    AnimalClass[] animalClasses = values();

    for (AnimalClass animalClass : animalClasses) {
      if (animalClass.value.equals(value)) {
        return animalClass;
      }
    }

    return null;
  }
}
