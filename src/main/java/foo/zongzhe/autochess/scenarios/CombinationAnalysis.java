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
		int size = chessPieceList.size();
		BuffUtil bu = new BuffUtil();
		ChessPieceUtil cpu = new ChessPieceUtil();
		for (int chessIndex1 = 0; chessIndex1 < 2; chessIndex1++) {
			ChessPiece chess1 = chessPieceList.get(chessIndex1);
			for (int chessIndex2 = chessIndex1 + 1; chessIndex2 < size - i + 1; chessIndex2++) {
				ChessPiece chess2 = chessPieceList.get(chessIndex2);
				for (int chessIndex3 = chessIndex2 + 1; chessIndex3 < size - i + 2; chessIndex3++) {
					ChessPiece chess3 = chessPieceList.get(chessIndex3);
					for (int chessIndex4 = chessIndex3 + 1; chessIndex4 < size - i + 3; chessIndex4++) {
						ChessPiece chess4 = chessPieceList.get(chessIndex4);

						for (int chessIndex5 = chessIndex4 + 1; chessIndex5 < size - i + 4; chessIndex5++) {
							ChessPiece chess5 = chessPieceList.get(chessIndex5);
							for (int chessIndex6 = chessIndex5 + 1; chessIndex6 < size - i + 5; chessIndex6++) {
								ChessPiece chess6 = chessPieceList.get(chessIndex6);
								for (int chessIndex7 = chessIndex6 + 1; chessIndex7 < size - i + 6; chessIndex7++) {
									ChessPiece chess7 = chessPieceList.get(chessIndex7);
									for (int chessIndex8 = chessIndex7 + 1; chessIndex8 < size - i + 7; chessIndex8++) {
										ChessPiece chess8 = chessPieceList.get(chessIndex8);
										chessPiecesToCheck = new ArrayList<>();
										chessPiecesToCheck.add(chess1);
										chessPiecesToCheck.add(chess2);
										chessPiecesToCheck.add(chess3);
										chessPiecesToCheck.add(chess4);
										chessPiecesToCheck.add(chess5);
										chessPiecesToCheck.add(chess6);
										chessPiecesToCheck.add(chess7);
										chessPiecesToCheck.add(chess8);
										// System.out.println(String.format("Checking buff from %s, %s, and %s", chess1.name, chess2.name, chess3.name));
										List<Buff> buffList = bu.getBuffCombination(chessPiecesToCheck);
										// System.out.println("buffList.size: " + buffList.size());
										if (buffList.size() >= 11) {
											cpu.printChessList(chessPiecesToCheck);
											bu.printBuffList(buffList);
										}
									}
								}
							}
						}
					}

				}
			}
		}

	}

}
