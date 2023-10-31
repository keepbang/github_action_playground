/*
 * Copyright (C) 2023-2023 MCorporation(https://mcorpor.com/) - All Rights Reserved.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 *
 * Written by dev team, sghwang<sg.hwang@mcorpor.com>
 * Last modified on 2023/10/18
 */

package com.mco.playground.zoo;

import com.mco.playground.shared.animal.Animal;
import com.mco.playground.zoo.animal.bird.Eagle;
import com.mco.playground.zoo.animal.fish.Dolphin;
import com.mco.playground.zoo.animal.mammal.Tiger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * create on 2023/10/18. create by IntelliJ IDEA.
 *
 * <p> application main. </p>
 *
 * @author SeokGyu Hwang
 * @version 1.0
 * @since 1.0
 */
@Slf4j
@SpringBootApplication
public class ZooApplication {

  public static void main(String[] args) {
    simulateZoo();
    SpringApplication.run(ZooApplication.class, args);
  }

  private static void simulateZoo() {
    log.info("동물원에 사는 동물 친구들을 찾아볼게요.");

    Animal eagle = new Eagle();
    Animal dolphin = new Dolphin();
    Animal tiger = new Tiger();

    eagle.showUp();
    dolphin.showUp();
    tiger.showUp();
  }
}
