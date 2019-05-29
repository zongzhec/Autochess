package foo.zongzhe.autochess.utils;

import java.util.ArrayList;
import java.util.List;

import foo.zongzhe.autochess.entities.Buff;
import foo.zongzhe.autochess.entities.ChessPiece;

public class ChessPieceUtil {

	public static void main(String[] args) {
		ChessPieceUtil cpu = new ChessPieceUtil();
		List<ChessPiece> chessPieceList = cpu.initialAllChessPieces();
		System.out.println(chessPieceList.get(0).chessClass);

	}

	public void printChessList(List<ChessPiece> chessList) {
		for (ChessPiece chess : chessList) {
			System.out.print(chess.name + " ");
		}
		System.out.println();

	}

	public List<ChessPiece> initialAllChessPieces() {
		List<ChessPiece> chessPieceList = new ArrayList<>();
		System.out.println("Starting to load all chess pieces...");
		chessPieceList.add(new ChessPiece("赤斧酋长", 1, ChessPiece.ORC, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("海象王", 1, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.WARRIOR)); // 一拳下去可能会死
		chessPieceList.add(new ChessPiece("独角兽", 1, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.DRUID));
		chessPieceList.add(new ChessPiece("冰霜骑士", 1, ChessPiece.TROLL, ChessPiece.EMPTY, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("背叛者", 1, ChessPiece.TROLL, ChessPiece.EMPTY, ChessPiece.SHAMAN));
		chessPieceList.add(new ChessPiece("不眠游侠", 1, ChessPiece.UNDEAD, ChessPiece.EMPTY, ChessPiece.HUNTER));
		chessPieceList.add(new ChessPiece("刺魂者", 1, ChessPiece.GOBLIN, ChessPiece.EMPTY, ChessPiece.ASSASSIN)); // 悬赏一个草帽男孩儿
		chessPieceList.add(new ChessPiece("霸天者", 1, ChessPiece.GOBLIN, ChessPiece.EMPTY, ChessPiece.MECH));
		chessPieceList.add(new ChessPiece("轰天者", 1, ChessPiece.GOBLIN, ChessPiece.EMPTY, ChessPiece.MECH));
		chessPieceList.add(new ChessPiece("禁忌猎魔人", 1, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.DEMON_HUNTER));
		chessPieceList.add(new ChessPiece("食人魔法师", 1, ChessPiece.OGRE, ChessPiece.EMPTY, ChessPiece.MAGE));
		chessPieceList.add(new ChessPiece("岩之灵", 1, ChessPiece.ELEMENTAL, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("剑客", 2, ChessPiece.ORC, ChessPiece.EMPTY, ChessPiece.WARRIOR)); // 旋转跳跃不停歇
		chessPieceList.add(new ChessPiece("独眼猎手", 2, ChessPiece.ORC, ChessPiece.EMPTY, ChessPiece.HUNTER));
		chessPieceList.add(new ChessPiece("绝命巫医", 2, ChessPiece.TROLL, ChessPiece.EMPTY, ChessPiece.WARLOCK));
		chessPieceList.add(new ChessPiece("海渊守卫", 2, ChessPiece.NAGA, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("魔力之源", 2, ChessPiece.HUMAN, ChessPiece.EMPTY, ChessPiece.MAGE)); // 魔力喷泉
		chessPieceList.add(new ChessPiece("光鳞龙", 2, ChessPiece.DRAGON, ChessPiece.ELF, ChessPiece.MAGE)); // CV 绝壁是蔡文姬
		chessPieceList.add(new ChessPiece("撕裂者", 2, ChessPiece.GOBLIN, ChessPiece.EMPTY, ChessPiece.MECH)); // 伐木打架两开花
		chessPieceList.add(new ChessPiece("炼狱骑士", 2, ChessPiece.DEMON, ChessPiece.EMPTY, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("水之灵", 2, ChessPiece.ELEMENTAL, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("盘羊骑士", 2, ChessPiece.HUMAN, ChessPiece.EMPTY, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("慧语先知", 2, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.DRUID));
		chessPieceList.add(new ChessPiece("灵刃骑士", 2, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("扭木贤者", 2, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.DRUID)); // 头上带点绿
		chessPieceList.add(new ChessPiece("魅影女王", 2, ChessPiece.DEMON, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("暗影魔王", 3, ChessPiece.DEMON, ChessPiece.EMPTY, ChessPiece.WARLOCK));
		chessPieceList.add(new ChessPiece("堕落猎魔人", 3, ChessPiece.DEMON, ChessPiece.EMPTY, ChessPiece.DEMON_HUNTER));
		chessPieceList.add(new ChessPiece("雷之灵", 3, ChessPiece.ELEMENTAL, ChessPiece.EMPTY, ChessPiece.MAGE));
		chessPieceList.add(new ChessPiece("沙地之主", 3, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("邪灵骑士", 3, ChessPiece.UNDEAD, ChessPiece.EMPTY, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("魔化毒虫", 3, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.WARLOCK));
		chessPieceList.add(new ChessPiece("焰灵法师", 3, ChessPiece.HUMAN, ChessPiece.EMPTY, ChessPiece.MAGE));
		chessPieceList.add(new ChessPiece("狼人", 3, ChessPiece.HUMAN, ChessPiece.BEAST, ChessPiece.WARRIOR)); // 我是一头村民
		chessPieceList.add(new ChessPiece("海渊夜行者", 3, ChessPiece.NAGA, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("幽影夜行者", 3, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("逐风游侠", 3, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.HUNTER));
		chessPieceList.add(new ChessPiece("毒液", 3, ChessPiece.DRAGON, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("矮人火枪手", 3, ChessPiece.DWARF, ChessPiece.EMPTY, ChessPiece.HUNTER));
		chessPieceList.add(new ChessPiece("利爪", 4, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.DRUID));
		chessPieceList.add(new ChessPiece("灵魂收割者", 4, ChessPiece.UNDEAD, ChessPiece.EMPTY, ChessPiece.WARLOCK));
		chessPieceList.add(new ChessPiece("龟甲长老", 4, ChessPiece.HUMAN, ChessPiece.EMPTY, ChessPiece.MAGE));
		chessPieceList.add(new ChessPiece("海盗船长", 4, ChessPiece.HUMAN, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("龙骑士", 4, ChessPiece.DRAGON, ChessPiece.HUMAN, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("光羽刺客", 4, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("末日审判官", 4, ChessPiece.DEMON, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("海妖", 4, ChessPiece.NAGA, ChessPiece.EMPTY, ChessPiece.HUNTER));
		chessPieceList.add(new ChessPiece("狂战士", 4, ChessPiece.TROLL, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("萃毒者", 4, ChessPiece.GOBLIN, ChessPiece.EMPTY, ChessPiece.WARLOCK));
		chessPieceList.add(new ChessPiece("风暴萨满", 4, ChessPiece.ORC, ChessPiece.EMPTY, ChessPiece.SHAMAN));
		System.out.println("All chess pieces have been loaded");

		return chessPieceList;
	}

}
