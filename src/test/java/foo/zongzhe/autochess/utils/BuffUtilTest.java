package foo.zongzhe.autochess.utils;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import foo.zongzhe.autochess.entities.Buff;
import foo.zongzhe.autochess.entities.ChessPiece;

public class BuffUtilTest {

	@Test
	public void getBuffCombinationTest() {
		List<ChessPiece> chessPieceList = new ArrayList<>();
		chessPieceList.add(new ChessPiece("海象王", 1, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.WARRIOR));
		chessPieceList.add(new ChessPiece("独角兽", 1, ChessPiece.BEAST, ChessPiece.EMPTY, ChessPiece.DRUID));
		chessPieceList.add(new ChessPiece("背叛者", 1, ChessPiece.TROLL, ChessPiece.EMPTY, ChessPiece.SHAMAN));
		BuffUtil bu = new BuffUtil();
		List<Buff> buffList = bu.getBuffCombination(chessPieceList);
		for (Buff buff : buffList) {
			System.out.println("Buff: " + buff.name + "-" + buff.level);
		}
	}
}
