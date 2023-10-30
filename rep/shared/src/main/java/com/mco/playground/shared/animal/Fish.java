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

import com.mco.playground.shared.enums.AnimalType;
import jakarta.annotation.Nullable;
import lombok.extern.slf4j.Slf4j;

/**
 * create on 10/30/23. create by IntelliJ IDEA.
 *
 * <p> 어류 </p>
 *
 * @author SeokGyu Hwang
 * @version 1.0
 * @since 1.0
 */
@Slf4j
public class Fish extends Animal{

  /**
   * constructor.
   *
   * @param animalSound 어류의 울음 소리.
   */
  public Fish(@Nullable String animalSound) {
    super(AnimalType.FISH, animalSound);
  }

  /**
   * constructor.
   */
  public Fish() {
    super(AnimalType.FISH);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void showUp() {
    super.showUp();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void makeSound() {
    super.makeSound();
    log.info("\uD83D\uDC1F 뻐끔... 뻐끔...");
  }
}
