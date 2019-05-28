package foo.zongzhe.autochess.utils;

import java.util.ArrayList;
import java.util.List;

import foo.zongzhe.autochess.entities.ChessPiece;

public class ChessPieceUtil {

	public static void main(String[] args) {
		ChessPieceUtil cpu = new ChessPieceUtil();
		List<ChessPiece> chessPieceList = cpu.initialAllChessPieces();
		System.out.println(chessPieceList.get(0).chessClass);

	}

	public List<ChessPiece> initialAllChessPieces() {
		List<ChessPiece> chessPieceList =  new ArrayList<>();
		chessPieceList.add(new ChessPiece("³à¸«Çõ³¤", 1, ChessPiece.ORC, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		
		return chessPieceList;
	}

}
