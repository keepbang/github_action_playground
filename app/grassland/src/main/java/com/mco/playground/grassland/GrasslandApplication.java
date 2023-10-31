/*
 * Copyright (C) 2023-2023 MCorporation(https://mcorpor.com/) - All Rights Reserved.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 *
 * Written by dev team, sghwang<sg.hwang@mcorpor.com>
 * Last modified on 2023/10/18
 */

package com.mco.playground.grassland;

import com.mco.playground.grassland.animal.bird.Eagle;
import com.mco.playground.grassland.animal.bird.Owl;
import com.mco.playground.grassland.animal.fish.Shark;
import com.mco.playground.grassland.animal.mammal.Elephant;
import com.mco.playground.shared.animal.Animal;
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
public class GrasslandApplication {

  public static void main(String[] args) {
    simulateGrassland();
    SpringApplication.run(GrasslandApplication.class, args);
  }

  private static void simulateGrassland() {
    log.info("야생에 사는 동물 친구들을 찾아볼게요.");

    Animal eagle = new Eagle();
    Animal shark = new Shark();
    Animal elephant = new Elephant();
    Animal owl = new Owl();

    eagle.showUp();
    shark.showUp();
    elephant.showUp();
    owl.showUp();
  }
}
