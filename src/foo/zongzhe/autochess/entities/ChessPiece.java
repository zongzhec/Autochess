package foo.zongzhe.autochess.entities;

public class ChessPiece {

	// Attributes
	public String name;
	public int cost;
	public String chessSpecies1;
	public String chessSpecies2;
	public String chessClass;

	// Constants of species, basing on Auto Chess mobile beta version.
	public static final String BEAST = "Ұ��";
	public static final String DEMON = "��ħ";
	public static final String DRAGON = "����";
	public static final String DWARF = "������";
	public static final String ELEMENTAL = "����";
	public static final String ELF = "������";
	public static final String GOBLIN = "�粼��";
	public static final String HUMAN = "����";
	public static final String OGRE = "����";
	public static final String ORC = "������";
	public static final String NAGA = "����";
	public static final String TROLL = "��ħ";
	public static final String UNDEAD = "����";
	public static final String EMPTY = "";

	// Constants of classes, basing on Auto Chess mobile beta version.
	public static final String ASSASSIN = "�̿�";
	public static final String DEMON_HUNTER = "��ħ��";
	public static final String DRUID = "��³��";
	public static final String KNIGHT = "��ʿ";
	public static final String HUNTER = "����";
	public static final String PRIEST = "��˾";
	public static final String MAGE = "��ʦ";
	public static final String MECH = "����";
	public static final String SHAMAN = "����";
	public static final String WARLOCK = "��ʿ";
	public static final String WARRIOR = "սʿ";

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
