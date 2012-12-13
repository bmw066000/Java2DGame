package com.bwright.game.level.tiles;

import com.bwright.game.gfx.Colors;
import com.bwright.game.gfx.Screen;
import com.bwright.game.level.Level;

public abstract class Tile {

	public static final Tile[] tiles = new Tile[256];
	public static final Tile VOID = new BasicSolidTile(0, Colors.get(000, -1, -1, -1), 0xFF000000);
	public static final Tile FLOOR = new BasicTile(1, Colors.get(556, 055, 403, 555), 0xFFFFFFFF);
	public static final Tile WALLPAPER = new BasicSolidTile(2, Colors.get(-1, 055, 403, -1), 0xFF00FFFF);
	public static final Tile WINDOWUL = new BasicSolidTile(3, Colors.get(555, 403, 055, 000), 0xFF000014);
	public static final Tile WINDOWUR = new BasicSolidTile(4, Colors.get(555, 403, 055, 000), 0xFF000012);
	public static final Tile WINDOWLL = new BasicSolidTile(35, Colors.get(555, 403, 055, 000), 0xFF000015);
	public static final Tile WINDOWLR = new BasicSolidTile(36, Colors.get(555, 403, 055, 000), 0xFF000013);
	public static final Tile DOWNSTAIRSUL = new BasicTile(5, Colors.get(-1, 055, 403, 555), 0xFF000017);
	public static final Tile DOWNSTAIRSUR = new BasicTile(6, Colors.get(-1, 055, 403, 555), 0xFF000016);
	public static final Tile DOWNSTAIRSLL = new BasicTile(37, Colors.get(-1, 055, 403, 555), 0xFF000019);
	public static final Tile DOWNSTAIRSLR = new BasicTile(38, Colors.get(-1, 055, 403, 555), 0xFF000018);
	public static final Tile LNGTABLEUL = new BasicSolidTile(7, Colors.get(000, 055, 403, 555), 0xFF000022);
	public static final Tile LNGTABLEUML = new BasicSolidTile(8, Colors.get(000, 055, 403, 555), 0xFF000023);
	public static final Tile LNGTABLEUMR = new BasicSolidTile(9, Colors.get(000, 055, 403, 555), 0xFF000024);
	public static final Tile LNGTABLEUR = new BasicSolidTile(10, Colors.get(000, 055, 403, 555), 0xFF000025);
	public static final Tile LNGTABLEML = new BasicSolidTile(39, Colors.get(000, 055, 403, 555), 0xFF000026);
	public static final Tile LNGTABLEMML = new BasicSolidTile(40, Colors.get(000, 055, 403, 555), 0xFF000027);
	public static final Tile LNGTABLEMMR = new BasicSolidTile(41, Colors.get(000, 055, 403, 555), 0xFF000028);
	public static final Tile LNGTABLEMR = new BasicSolidTile(42, Colors.get(000, 055, 403, 555), 0xFF000029);
	public static final Tile LNGTABLELL = new BasicSolidTile(71, Colors.get(000, 055, 403, 555), 0xFF00002A);
	public static final Tile LNGTABLELML = new BasicSolidTile(72, Colors.get(000, 055, 403, 555), 0xFF00002B);
	public static final Tile LNGTABLELMR = new BasicSolidTile(73, Colors.get(000, 055, 403, 555), 0xFF00002C);
	public static final Tile LNGTABLELR = new BasicSolidTile(74, Colors.get(000, 055, 403, 555), 0xFF00002D);
	public static final Tile COMPUL = new BasicSolidTile(11, Colors.get(000, 055, 403, 555), 0xFF00001A);
	public static final Tile COMPUR = new BasicSolidTile(12, Colors.get(000, 055, 403, 555), 0xFF00001E);
	public static final Tile COMPUML = new BasicSolidTile(43, Colors.get(000, 055, 403, 555), 0xFF00001B);
	public static final Tile COMPUMR = new BasicSolidTile(44, Colors.get(000, 055, 403, 555), 0xFF00001F);
	public static final Tile COMPLML = new BasicSolidTile(75, Colors.get(000, 055, 403, 555), 0xFF00001C);
	public static final Tile COMPLMR = new BasicSolidTile(76, Colors.get(000, 055, 403, 555), 0xFF000020);
	public static final Tile COMPLL = new BasicSolidTile(107, Colors.get(000, 055, 403, 555), 0xFF00001D);
	public static final Tile COMPLR = new BasicSolidTile(108, Colors.get(000, 055, 403, 555), 0xFF000021);
	public static final Tile TREEPOTUL = new BasicSolidTile(13, Colors.get(000, 055, 403, 555), 0xFF000011);
	public static final Tile TREEPOTUR = new BasicSolidTile(14, Colors.get(000, 055, 403, 555), 0xFF00000D);
	public static final Tile TREEPOTUML = new BasicSolidTile(45, Colors.get(000, 055, 403, 555), 0xFF000010);
	public static final Tile TREEPOTUMR = new BasicSolidTile(46, Colors.get(000, 055, 403, 555), 0xFF00000C);
	public static final Tile TREEPOTLML = new BasicSolidTile(77, Colors.get(000, 055, 403, 555), 0xFF00000F);
	public static final Tile TREEPOTLMR = new BasicSolidTile(78, Colors.get(000, 055, 403, 555), 0xFF00000B);
	public static final Tile TREEPOTLL = new BasicSolidTile(109, Colors.get(000, 055, 403, 555), 0xFF00000E);
	public static final Tile TREEPOTLR = new BasicSolidTile(110, Colors.get(000, 055, 403, 555), 0xFF00000A);
	public static final Tile BEDUL = new BasicSolidTile(15, Colors.get(000, 055, 403, 555), 0xFF000004);
	public static final Tile BEDUR = new BasicSolidTile(16, Colors.get(000, 055, 403, 555), 0xFF000008);
	public static final Tile BEDUML = new BasicSolidTile(47, Colors.get(000, 055, 403, 555), 0xFF000003);
	public static final Tile BEDUMR = new BasicSolidTile(48, Colors.get(000, 055, 403, 555), 0xFF000007);
	public static final Tile BEDLML = new BasicSolidTile(79, Colors.get(000, 055, 403, 555), 0xFF000002);
	public static final Tile BEDLMR = new BasicSolidTile(80, Colors.get(000, 055, 403, 555), 0xFF000006);
	public static final Tile BEDLL = new BasicSolidTile(111, Colors.get(000, 055, 403, 555), 0xFF000001);
	public static final Tile BEDLR = new BasicSolidTile(112, Colors.get(000, 055, 403, 555), 0xFF000005);
	public static final Tile CONSOLEUL = new BasicSolidTile(17, Colors.get(000, 055, 403, 555), 0xFF000032);
	public static final Tile CONSOLEUR = new BasicSolidTile(18, Colors.get(000, 055, 403, 555), 0xFF000033);
	public static final Tile CONSOLELL = new BasicSolidTile(49, Colors.get(000, 055, 403, 555), 0xFF000034);
	public static final Tile CONSOLELR = new BasicSolidTile(50, Colors.get(000, 055, 403, 555), 0xFF000035);
	public static final Tile TVUL = new BasicSolidTile(19, Colors.get(000, 055, 403, 555), 0xFF00002E);
	public static final Tile TVUR = new BasicSolidTile(20, Colors.get(000, 055, 403, 555), 0xFF000030);
	public static final Tile TVLL = new BasicSolidTile(51, Colors.get(000, 055, 403, 555), 0xFF00002F);
	public static final Tile TVLR = new BasicSolidTile(52, Colors.get(000, 055, 403, 555), 0xFF000031);
	public static final Tile UPSTAIRSUL = new BasicSolidTile(21, Colors.get(000, 055, 403, 555), 0xFF000036);
	public static final Tile UPSTAIRSUR = new BasicSolidTile(22, Colors.get(000, 055, 403, 555), 0xFF000037);
	public static final Tile UPSTAIRSLL = new BasicSolidTile(53, Colors.get(000, 055, 403, 555), 0xFF000038);
	public static final Tile UPSTAIRSLR = new BasicSolidTile(54, Colors.get(000, 055, 403, 555), 0xFF000039);
	public static final Tile CHAIRUL = new BasicTile(23, Colors.get(000, 055, 403, 555), 0xFF00003A);
	public static final Tile CHAIRUR = new BasicTile(24, Colors.get(000, 055, 403, 555), 0xFF00003B);
	public static final Tile CHAIRLL = new BasicTile(55, Colors.get(000, 055, 403, 555), 0xFF00003C);
	public static final Tile CHAIRLR = new BasicTile(56, Colors.get(000, 055, 403, 555), 0xFF00003D);
	public static final Tile BOOKCASEUL = new BasicSolidTile(25, Colors.get(000, 055, 403, 555), 0xFF00003E);
	public static final Tile BOOKCASEUR = new BasicSolidTile(26, Colors.get(000, 055, 403, 555), 0xFF00003F);
	public static final Tile BOOKCASEUML = new BasicSolidTile(57, Colors.get(000, 055, 403, 555), 0xFF000040);
	public static final Tile BOOKCASEUMR = new BasicSolidTile(58, Colors.get(000, 055, 403, 555), 0xFF000041);
	public static final Tile BOOKCASELML = new BasicSolidTile(89, Colors.get(000, 055, 403, 555), 0xFF000042);
	public static final Tile BOOKCASELMR = new BasicSolidTile(90, Colors.get(000, 055, 403, 555), 0xFF000043);
	public static final Tile BOOKCASELL = new BasicSolidTile(121, Colors.get(000, 055, 403, 555), 0xFF000044);
	public static final Tile BOOKCASELR = new BasicSolidTile(122, Colors.get(000, 055, 403, 555), 0xFF000045);
	public static final Tile FLOTABLEUL = new BasicSolidTile(27, Colors.get(000, 403, 055, 555), 0xFF000046);
	public static final Tile FLOTABLEUML = new BasicSolidTile(28, Colors.get(000, 403, 055, 555), 0xFF000047);
	public static final Tile FLOTABLEUMR = new BasicSolidTile(29, Colors.get(000, 403, 055, 555), 0xFF000048);
	public static final Tile FLOTABLEUR = new BasicSolidTile(30, Colors.get(000, 403, 055, 555), 0xFF000049);
	public static final Tile FLOTABLEUMFL = new BasicSolidTile(59, Colors.get(000, 403, 055, 555), 0xFF00004a);
	public static final Tile FLOTABLEUMFR = new BasicSolidTile(60, Colors.get(000, 403, 055, 555), 0xFF00004b);
	public static final Tile FLOTABLEUMOFL = new BasicSolidTile(61, Colors.get(000, 403, 055, 555), 0xFF00004c);
	public static final Tile FLOTABLEUMOFR = new BasicSolidTile(62, Colors.get(000, 403, 055, 555), 0xFF00004d);
	public static final Tile FLOTABLELML = new BasicSolidTile(91, Colors.get(000, 403, 055, 555), 0xFF00004e);
	public static final Tile FLOTABLELMR = new BasicSolidTile(92, Colors.get(000, 403, 055, 555), 0xFF00004f);
	public static final Tile FLOTABLELFML = new BasicSolidTile(93, Colors.get(000, 403, 055, 555), 0xFF000050);
	public static final Tile FLOTABLELOMR = new BasicSolidTile(94, Colors.get(000, 403, 055, 555), 0xFF000051);
	public static final Tile FLOTABLELL = new BasicSolidTile(123, Colors.get(000, 403, 055, 555), 0xFF000052);
	public static final Tile FLOTABLELR = new BasicSolidTile(124, Colors.get(000, 403, 055, 555), 0xFF000053);
	public static final Tile FLOTABLELLL = new BasicSolidTile(125, Colors.get(000, 403, 055, 555), 0xFF000054);
	public static final Tile FLOTABLELRR = new BasicSolidTile(126, Colors.get(000, 403, 055, 555), 0xFF000055);
	public static final Tile EXITUL = new BasicTile(32, Colors.get(000, 055, 403, 555), 0xFF000056);
	public static final Tile EXITUR = new BasicTile(33, Colors.get(000, 055, 403, 555), 0xFF000057);
	public static final Tile EXITLL = new BasicTile(64, Colors.get(000, 055, 403, 555), 0xFF000058);
	public static final Tile EXITLR = new BasicTile(65, Colors.get(000, 055, 403, 555), 0xFF000059);
	
	protected byte id;
	protected boolean solid;
	protected boolean emitter;
	private int levelColor;
	
	public Tile(int id, boolean isSolid, boolean isEmitter, int levelColor) {
		this.id = (byte) id;
		if (tiles[id] != null) throw new RuntimeException("Duplicate tile id on " + id);
		this.solid = isSolid;
		this.emitter = isEmitter;
		this.levelColor = levelColor;
		tiles[id] = this;
	}
	
	public byte getId() {
		return id;
	}
	
	public boolean isSolid() {
		return solid;
	}
	
	public boolean isEmitter() {
		return emitter;
	}
	
	public int getLevelColor() {
		return levelColor;
	}
	
	public abstract void render(Screen screen, Level level, int x, int y);

}
