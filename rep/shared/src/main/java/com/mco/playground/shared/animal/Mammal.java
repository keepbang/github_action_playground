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

/**
 * create on 10/30/23. create by IntelliJ IDEA.
 *
 * <p> 포유류. </p>
 *
 * @author SeokGyu Hwang
 * @version 1.0
 * @since 1.0
 */
public class Mammal extends Animal {

  /**
   * constructor.
   *
   * @param species     동물의 종
   * @param animalSound 포유류의 울음 소리.
   */
  public Mammal(String species, @Nullable String animalSound) {
    super(AnimalClass.MAMMAL, species, animalSound);
  }

  /**
   * constructor.
   *
   * @param species 동물의 종
   */
  public Mammal(String species) {
    super(AnimalClass.MAMMAL, species);
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
  }
}
