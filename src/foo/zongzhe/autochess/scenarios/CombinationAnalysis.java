package foo.zongzhe.autochess.scenarios;

import java.util.ArrayList;
import java.util.List;

import foo.zongzhe.autochess.entities.Buff;
import foo.zongzhe.autochess.entities.ChessPiece;
import foo.zongzhe.autochess.utils.BuffUtil;
import foo.zongzhe.autochess.utils.ChessPieceUtil;

public class CombinationAnalysis {

	/**
	 * This is to analysis what combination is with highest probability.
	 */
	public static void main(String[] args) {
		ChessPieceUtil cpu = new ChessPieceUtil();
		List<ChessPiece> chessPieceList = cpu.initialAllChessPieces();
		checkMaxCombos(chessPieceList, 8);
	}

	private static void checkMaxCombos(List<ChessPiece> chessPieceList, int i) {
		List<ChessPiece> chessPiecesToCheck = new ArrayList<>();
		BuffUtil bu = new BuffUtil();
		for (int chessIndex1 = 0; chessIndex1 < chessPieceList.size() - i; chessIndex1++) {
			ChessPiece chess1 = chessPieceList.get(chessIndex1);
			for (int chessIndex2 = chessIndex1 + 1; chessIndex2 < chessPieceList.size() - i + 1; chessIndex2++) {
				ChessPiece chess2 = chessPieceList.get(chessIndex2);
				for (int chessIndex3 = chessIndex2 + 1; chessIndex3 < chessPieceList.size() - i + 2; chessIndex3++) {
					ChessPiece chess3 = chessPieceList.get(chessIndex3);
					chessPiecesToCheck = new ArrayList<>();
					chessPiecesToCheck.add(chess1);
					chessPiecesToCheck.add(chess2);
					chessPiecesToCheck.add(chess3);
//					System.out.println(String.format("Checking buff from %s, %s, and %s", chess1.name, chess2.name, chess3.name));
					List<Buff> buffList = bu.getBuffCombination(chessPiecesToCheck);
//					System.out.println("buffList.size: " + buffList.size());
					if (buffList.size() >= 2) {
						System.out.println(String.format("Checking buff from %s, %s, and %s", chess1.name, chess2.name, chess3.name));
						bu.printBuffList(buffList);
					}
				}
			}
		}

	}

}
