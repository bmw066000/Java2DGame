package com.bwright.game.level.tiles;

public class BasicSolidTile extends BasicTile {

	public BasicSolidTile(int id, int tileColor, int levelColor) {
		super(id, tileColor, levelColor);
		this.solid = true;
	}

}
