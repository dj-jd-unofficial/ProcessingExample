package com.example.processingexample;
//package core_debug;

import processing.core.PApplet;


public class Sketch extends PApplet {

        public void settings() {
            size(600, 600);
        }

        public void setup() {
            fullScreen(P2D);
        }

        public void draw() {
            if (mousePressed) {
                ellipse(mouseX, mouseY, 50, 50);
            }
        }
}