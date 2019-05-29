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
		chessPieceList.add(new ChessPiece("�ห����", 1, ChessPiece.ORC, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("������", 1, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.WARRIOR)); // һȭ��ȥ���ܻ���
		chessPieceList.add(new ChessPiece("������", 1, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.DRUID));
		chessPieceList.add(new ChessPiece("��˪��ʿ", 1, ChessPiece.TROLL, ChessPiece.EMPTY, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("������", 1, ChessPiece.TROLL, ChessPiece.EMPTY, ChessPiece.SHAMAN));
		chessPieceList.add(new ChessPiece("��������", 1, ChessPiece.UNDEAD, ChessPiece.EMPTY, ChessPiece.HUNTER));
		chessPieceList.add(new ChessPiece("�̻���", 1, ChessPiece.GOBLIN, ChessPiece.EMPTY, ChessPiece.ASSASSIN)); // ����һ����ñ�к���
		chessPieceList.add(new ChessPiece("������", 1, ChessPiece.GOBLIN, ChessPiece.EMPTY, ChessPiece.MECH));
		chessPieceList.add(new ChessPiece("������", 1, ChessPiece.GOBLIN, ChessPiece.EMPTY, ChessPiece.MECH));
		chessPieceList.add(new ChessPiece("������ħ��", 1, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.DEMON_HUNTER));
		chessPieceList.add(new ChessPiece("ʳ��ħ��ʦ", 1, ChessPiece.OGRE, ChessPiece.EMPTY, ChessPiece.MAGE));
		chessPieceList.add(new ChessPiece("��֮��", 1, ChessPiece.ELEMENTAL, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("����", 2, ChessPiece.ORC, ChessPiece.EMPTY, ChessPiece.WARRIOR)); // ��ת��Ծ��ͣЪ
		chessPieceList.add(new ChessPiece("��������", 2, ChessPiece.ORC, ChessPiece.EMPTY, ChessPiece.HUNTER));
		chessPieceList.add(new ChessPiece("������ҽ", 2, ChessPiece.TROLL, ChessPiece.EMPTY, ChessPiece.WARLOCK));
		chessPieceList.add(new ChessPiece("��Ԩ����", 2, ChessPiece.NAGA, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("ħ��֮Դ", 2, ChessPiece.HUMAN, ChessPiece.EMPTY, ChessPiece.MAGE)); // ħ����Ȫ
		chessPieceList.add(new ChessPiece("������", 2, ChessPiece.DRAGON, ChessPiece.ELF, ChessPiece.MAGE)); // CV �����ǲ��ļ�
		chessPieceList.add(new ChessPiece("˺����", 2, ChessPiece.GOBLIN, ChessPiece.EMPTY, ChessPiece.MECH)); // ��ľ���������
		chessPieceList.add(new ChessPiece("������ʿ", 2, ChessPiece.DEMON, ChessPiece.EMPTY, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("ˮ֮��", 2, ChessPiece.ELEMENTAL, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("������ʿ", 2, ChessPiece.HUMAN, ChessPiece.EMPTY, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("������֪", 2, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.DRUID));
		chessPieceList.add(new ChessPiece("������ʿ", 2, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("Ťľ����", 2, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.DRUID)); // ͷ�ϴ�����
		chessPieceList.add(new ChessPiece("��ӰŮ��", 2, ChessPiece.DEMON, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("��Ӱħ��", 3, ChessPiece.DEMON, ChessPiece.EMPTY, ChessPiece.WARLOCK));
		chessPieceList.add(new ChessPiece("������ħ��", 3, ChessPiece.DEMON, ChessPiece.EMPTY, ChessPiece.DEMON_HUNTER));
		chessPieceList.add(new ChessPiece("��֮��", 3, ChessPiece.ELEMENTAL, ChessPiece.EMPTY, ChessPiece.MAGE));
		chessPieceList.add(new ChessPiece("ɳ��֮��", 3, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("а����ʿ", 3, ChessPiece.UNDEAD, ChessPiece.EMPTY, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("ħ������", 3, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.WARLOCK));
		chessPieceList.add(new ChessPiece("���鷨ʦ", 3, ChessPiece.HUMAN, ChessPiece.EMPTY, ChessPiece.MAGE));
		chessPieceList.add(new ChessPiece("����", 3, ChessPiece.HUMAN, ChessPiece.BEAST, ChessPiece.WARRIOR)); // ����һͷ����
		chessPieceList.add(new ChessPiece("��Ԩҹ����", 3, ChessPiece.NAGA, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("��Ӱҹ����", 3, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("�������", 3, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.HUNTER));
		chessPieceList.add(new ChessPiece("��Һ", 3, ChessPiece.DRAGON, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("���˻�ǹ��", 3, ChessPiece.DWARF, ChessPiece.EMPTY, ChessPiece.HUNTER));
		chessPieceList.add(new ChessPiece("��צ", 4, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.DRUID));
		chessPieceList.add(new ChessPiece("����ո���", 4, ChessPiece.UNDEAD, ChessPiece.EMPTY, ChessPiece.WARLOCK));
		chessPieceList.add(new ChessPiece("��׳���", 4, ChessPiece.HUMAN, ChessPiece.EMPTY, ChessPiece.MAGE));
		chessPieceList.add(new ChessPiece("��������", 4, ChessPiece.HUMAN, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("����ʿ", 4, ChessPiece.DRAGON, ChessPiece.HUMAN, ChessPiece.KNIGHT));
		chessPieceList.add(new ChessPiece("����̿�", 4, ChessPiece.ELF, ChessPiece.EMPTY, ChessPiece.ASSASSIN));
		chessPieceList.add(new ChessPiece("ĩ�����й�", 4, ChessPiece.DEMON, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("����", 4, ChessPiece.NAGA, ChessPiece.EMPTY, ChessPiece.HUNTER));
		chessPieceList.add(new ChessPiece("��սʿ", 4, ChessPiece.TROLL, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("�Ͷ���", 4, ChessPiece.GOBLIN, ChessPiece.EMPTY, ChessPiece.WARLOCK));
		chessPieceList.add(new ChessPiece("�籩����", 4, ChessPiece.ORC, ChessPiece.EMPTY, ChessPiece.SHAMAN));
		System.out.println("All chess pieces have been loaded");

		return chessPieceList;
	}

}
