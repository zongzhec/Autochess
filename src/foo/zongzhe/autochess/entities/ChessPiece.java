package foo.zongzhe.autochess.entities;

public class ChessPiece {

	// Attributes
	public String name;
	public int cost;
	public String chessSpecies1;
	public String chessSpecies2;
	public String chessClass;

	// Constants of species, basing on Auto Chess mobile beta version.
	public static final String BEAST = "野兽";
	public static final String DEMON = "恶魔";
	public static final String DRAGON = "龙族";
	public static final String DWARF = "矮人族";
	public static final String ELEMENTAL = "灵族";
	public static final String ELF = "光羽族";
	public static final String GOBLIN = "哥布林";
	public static final String HUMAN = "人族";
	public static final String OGRE = "基拉";
	public static final String ORC = "洞洞族";
	public static final String NAGA = "海族";
	public static final String TROLL = "巨魔";
	public static final String UNDEAD = "不眠";
	public static final String EMPTY = "";

	// Constants of classes, basing on Auto Chess mobile beta version.
	public static final String ASSASSIN = "刺客";
	public static final String DEMON_HUNTER = "猎魔人";
	public static final String DRUID = "德鲁伊";
	public static final String KNIGHT = "骑士";
	public static final String HUNTER = "猎人";
	public static final String PRIEST = "祭司";
	public static final String MAGE = "法师";
	public static final String MECH = "工匠";
	public static final String SHAMAN = "萨满";
	public static final String WARLOCK = "术士";
	public static final String WARRIOR = "战士";

	public ChessPiece(String name, Integer cost, String chessSpecies1, String chessSpecies2, String chessClass) {
		this.name = name;
		this.cost = cost;
		this.chessSpecies1 = chessSpecies1;
		this.chessSpecies2 = chessSpecies2;
		this.chessClass = chessClass;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getChessSpecies1() {
		return chessSpecies1;
	}

	public void setChessSpecies1(String chessSpecies1) {
		this.chessSpecies1 = chessSpecies1;
	}

	public String getChessSpecies2() {
		return chessSpecies2;
	}

	public void setChessSpecies2(String chessSpecies2) {
		this.chessSpecies2 = chessSpecies2;
	}

	public String getChessClass() {
		return chessClass;
	}

	public void setChessClass(String chessClass) {
		this.chessClass = chessClass;
	}
}
