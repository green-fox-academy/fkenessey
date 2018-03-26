package com.greenfoxacademy.finalexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class FinalexamApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalexamApplication.class, args);
	}

	public static int[] shifterFunction(int[] listin, int shifterUser) {

		int[] listout = new int[listin.length];
		int shifter = shifterUser % listin.length;

		if (shifter >= 0) {

			for (int i = 0; i < listin.length; i++) {
				if (i + shifter < listout.length) {
					listout[i + shifter] = listin[i];
				} else {
					listout[i + shifter - listout.length] = listin[i];
				}
			}

			return listout;
		} else {

			for (int i = 0; i < listin.length; i++) {
				if (i + shifter < 0) {
					listout[listin.length + i + shifter] = listin[i];
				} else {
					listout[i + shifter] = listin[i];
				}
			}

			return listout;
		}
	}
}
