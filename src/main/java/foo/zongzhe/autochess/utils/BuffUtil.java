package foo.zongzhe.autochess.utils;

import java.util.ArrayList;
import java.util.List;

import foo.zongzhe.autochess.entities.Buff;
import foo.zongzhe.autochess.entities.ChessPiece;

public class BuffUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void printBuffList(List<Buff> buffList) {
		for (Buff buff : buffList) {
			System.out.print(buff.name + "-" + buff.level + " ");
		}
		System.out.println();

	}

	public List<Buff> getBuffCombination(List<ChessPiece> chessPieceList) {
		List<Buff> buffList = new ArrayList<>();
		// Species
		int buffBeast = 0;
		int buffDemon = 0;
		int buffDragon = 0;
		int buffDwarf = 0;
		int buffElemental = 0;
		int buffElf = 0;
		int buffGoblin = 0;
		int buffSatyr = 0;
		int buffHuman = 0;
		int buffOgre = 0;
		int buffOrc = 0;
		int buffNaga = 0;
		int buffTroll = 0;
		int buffUndead = 0;
		int buffGod = 0;

		// Classes
		int buffAssassin = 0;
		int buffDemonHunter = 0;
		int buffDruid = 0;
		int buffKnight = 0;
		int buffHunter = 0;
		int buffPriest = 0;
		int buffMage = 0;
		int buffMech = 0;
		int buffShaman = 0;
		int buffWarlock = 0;
		int buffWarrior = 0;

		for (ChessPiece cp : chessPieceList) {
			if (cp.chessSpecies1.equals(ChessPiece.BEAST) || cp.chessSpecies2.equals(ChessPiece.BEAST)) {
				buffBeast++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.DEMON) || cp.chessSpecies2.equals(ChessPiece.DEMON)) {
				buffDemon++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.DRAGON) || cp.chessSpecies2.equals(ChessPiece.DRAGON)) {
				buffDragon++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.DWARF) || cp.chessSpecies2.equals(ChessPiece.DWARF)) {
				buffDwarf++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.ELEMENTAL) || cp.chessSpecies2.equals(ChessPiece.ELEMENTAL)) {
				buffElemental++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.ELF) || cp.chessSpecies2.equals(ChessPiece.ELF)) {
				buffElf++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.GOBLIN) || cp.chessSpecies2.equals(ChessPiece.GOBLIN)) {
				buffGoblin++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.HUMAN) || cp.chessSpecies2.equals(ChessPiece.HUMAN)) {
				buffHuman++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.OGRE) || cp.chessSpecies2.equals(ChessPiece.OGRE)) {
				buffOgre++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.ORC) || cp.chessSpecies2.equals(ChessPiece.ORC)) {
				buffOrc++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.NAGA) || cp.chessSpecies2.equals(ChessPiece.NAGA)) {
				buffNaga++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.TROLL) || cp.chessSpecies2.equals(ChessPiece.TROLL)) {
				buffTroll++;
			}
			if (cp.chessSpecies1.equals(ChessPiece.UNDEAD) || cp.chessSpecies2.equals(ChessPiece.UNDEAD)) {
				buffUndead++;
			}

			if (cp.chessClass.equals(ChessPiece.ASSASSIN)) {
				buffAssassin++;
			} else if (cp.chessClass.equals(ChessPiece.DEMON_HUNTER)) {
				buffDemonHunter++;
			} else if (cp.chessClass.equals(ChessPiece.DRUID)) {
				buffDruid++;
			} else if (cp.chessClass.equals(ChessPiece.KNIGHT)) {
				buffKnight++;
			} else if (cp.chessClass.equals(ChessPiece.HUNTER)) {
				buffHunter++;
			} else if (cp.chessClass.equals(ChessPiece.MAGE)) {
				buffMage++;
			} else if (cp.chessClass.equals(ChessPiece.MECH)) {
				buffMech++;
			} else if (cp.chessClass.equals(ChessPiece.SHAMAN)) {
				buffShaman++;
			} else if (cp.chessClass.equals(ChessPiece.WARLOCK)) {
				buffWarlock++;
			} else if (cp.chessClass.equals(ChessPiece.WARRIOR)) {
				buffWarrior++;
			}

			if (buffBeast >= 6) {
				buffList.add(new Buff(ChessPiece.BEAST, 3));
			}
			if (buffBeast >= 4) {
				buffList.add(new Buff(ChessPiece.BEAST, 2));
			}
			if (buffBeast >= 2) {
				buffList.add(new Buff(ChessPiece.BEAST, 1));
			}

			if (buffWarrior >= 9) {
				buffList.add(new Buff(ChessPiece.WARRIOR, 3));
			}
			if (buffWarrior >= 6) {
				buffList.add(new Buff(ChessPiece.WARRIOR, 2));
			}
			if (buffWarrior >= 3) {
				buffList.add(new Buff(ChessPiece.WARRIOR, 1));
			}

		}

		return buffList;
	}

}
