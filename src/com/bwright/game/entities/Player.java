package com.bwright.game.entities;

import com.bwright.game.InputHandler;
import com.bwright.game.gfx.Colors;
import com.bwright.game.gfx.Screen;
import com.bwright.game.level.Level;

public class Player extends Mob {

	private InputHandler input;
	private int color = Colors.get(-1, 111, 403, 543);
	private int scale = 1;

	public Player(Level level, int x, int y, InputHandler input) {
		super(level, "Player", x, y, 1);
		this.input = input;
	}

	public void tick() {
		int xa = 0;
		int ya = 0;

		if (input.up.isPressed()) {
			ya--;
		}
		if (input.down.isPressed()) {
			ya++;
		}
		if (input.left.isPressed()) {
			xa--;
		}
		if (input.right.isPressed()) {
			xa++;
		}

		if (xa != 0 || ya != 0) {
			move(xa, ya);
			isMoving = true;
		} else {
			isMoving = false;
		}
	}

	boolean flipB = false;
	int lastXTile = 0;

	public void render(Screen screen) {
		int xTile = 0;
		int yTile = 28;
		int walkingSpeed = 3;
		int flip = (numSteps >> walkingSpeed) & 1;

		if (isMoving) {
			if (movingDir == 0) { // UP
				if ((numSteps >> walkingSpeed) % 4 == 0) {
					xTile = 2;
					flip = 0x00;
				} else if ((numSteps >> walkingSpeed) % 4 == 1 || (numSteps >> walkingSpeed) % 4 == 3) {
					xTile = 0;
					flip = 0x00;
				} else {
					xTile = 2;
					flip = 0x01;
				}
			} else if (movingDir == 1) { // DOWN
				if ((numSteps >> walkingSpeed) % 4 == 0) {
					xTile = 6;
					flip = 0x00;
				} else if ((numSteps >> walkingSpeed) % 4 == 1 || (numSteps >> walkingSpeed) % 4 == 3) {
					xTile = 4;
					flip = 0x00;
				} else {
					xTile = 6;
					flip = 0x01;
				}
			} else if (movingDir > 1) {
				xTile += 8 + ((numSteps >> walkingSpeed) & 1) * 2;
				flip = (movingDir - 1) % 2;
			}
		} else {
			if (movingDir == 1) {
				xTile = 4;
			} else if (movingDir > 1) {
				xTile = 8;
				flip = (movingDir - 1) % 2;
			}
		}
		int modifier = 8 * scale;
		int xOffset = x - modifier / 2;
		int yOffset = y - modifier / 2 - 4;

		screen.render(xOffset + (modifier * flip), yOffset, xTile + yTile * 32, color, flip, scale);
		screen.render(xOffset + modifier - (modifier * flip), yOffset, (xTile + 1) + yTile * 32, color, flip, scale);
		screen.render(xOffset + (modifier * flip), yOffset + modifier, xTile + (yTile + 1) * 32, color, flip, scale);
		screen.render(xOffset + modifier - (modifier * flip), yOffset + modifier, (xTile + 1) + (yTile + 1) * 32, color, flip, scale);
	}

	public boolean hasCollided(int xa, int ya) {
		int xMin = -4;
		int xMax = 11;
		int yMin = -4;
		int yMax = 11;
		for (int x = xMin; x < xMax; x++) {
			if (isSolidTile(xa, ya, x, yMin)) {
				return true;
			}
		}
		for (int x = xMin; x < xMax; x++) {
			if (isSolidTile(xa, ya, x, yMax)) {
				return true;
			}
		}
		for (int y = yMin; y < yMax; y++) {
			if (isSolidTile(xa, ya, xMin, y)) {
				return true;
			}
		}
		for (int y = yMin; y < yMax; y++) {
			if (isSolidTile(xa, ya, xMax, y)) {
				return true;
			}
		}
		return false;
	}

}
