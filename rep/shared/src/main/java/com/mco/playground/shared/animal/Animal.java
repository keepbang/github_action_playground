/*
 * Copyright (C) 2023-2023 MCorporation(https://mcorpor.com/) - All Rights Reserved.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 *
 * Written by dev team, sghwang<sg.hwang@mcorpor.com>
 * Last modified on 2023/10/30
 */

package com.mco.playground.shared.animal;

import com.mco.playground.shared.enums.AnimalClass;
import jakarta.annotation.Nullable;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

/**
 * create on 10/30/23. create by IntelliJ IDEA.
 *
 * <p> 동물. </p>
 *
 * @author SeokGyu Hwang
 * @version 1.0
 * @since 1.0
 */
@Slf4j
public class Animal {

  /**
   * 동물의 과.
   */
  private final AnimalClass animalClass;

  /**
   * 동물의 종.
   */
  protected final String species;

  /**
   * 동물이 내는 소리.
   */
  @Nullable
  private final String animalSound;

  /**
   * constructor.
   *
   * @param animalClass 동물의 과
   * @param species     동물의 종
   * @param animalSound 동물이 내는 소리
   */
  public Animal(AnimalClass animalClass, String species, @Nullable String animalSound) {
    this.animalClass = animalClass;
    this.species = species;
    this.animalSound = animalSound;
  }

  /**
   * constructor.
   *
   * @param animalClass 동물 종류
   * @param species     동물의 종
   */
  public Animal(AnimalClass animalClass, String species) {
    this(animalClass, species, null);
  }

  /**
   * <p> 동물이 나타나다. </p>
   * <p>
   * 내부에서 동물의 발견을 알리고({@link #inform()}), 동물이 소리를 낸 후({@link #makeSound()}) 떠나는
   * 동작({@link #disappeared()})이 차례대로 실행됩니다.
   * </p>
   */
  public void showUp() {
    this.inform();
    this.makeSound();
    this.disappeared();
  }

  /**
   * 소리를 낸다.
   */
  protected void makeSound() {
    if (StringUtils.isEmpty(this.animalSound)) {
      log.info("이 동물은 소리를 낼 수 없어요.");
    } else {
      log.info("이 동물은 이런 소리를 낼 수 있습니다: \"{}\"", this.animalSound);
    }
  }

  /**
   * 동물의 발견을 알리다.
   */
  private void inform() {
    log.info("-----------------------------------------");
    log.info("새로운 동물을 발견했습니다!");
    log.info("이 동물의 종류는 {}입니다.", this.species);
    log.info("이 동물의 과는 {}입니다.", this.animalClass.getValue());
  }

  /**
   * 동물이 사라지다.
   */
  private void disappeared() {
    log.info("동물이 먹이를 찾아 떠났습니다...");
  }
}
