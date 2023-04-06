package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;

public class _01_useOfGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardFile<FreeBoard> fBoardFile = new BoardFile<FreeBoard>();
		
		FreeBoard fBoard = new FreeBoard();
		fBoard.setfBoardNo(1);
		fBoard.setfBoardTitle("test");
		fBoard.setfBoardContent("test입니다.");
		
		fBoardFile.setT(fBoard);
		
		fBoardFile.setBoardNo(
			fBoardFile.getT().getfBoardNo()
		);
		
		fBoardFile.setType(
			fBoardFile.getT().getClass()
						.getSimpleName()
						.equals("FreeBoard") 
						? 1 : 2
		);
		
		fBoardFile.setBoardFileNm("첨부파일");
		System.out.println(fBoardFile);


		BoardFile<NoticeBoard> nBoardfile = new BoardFile<NoticeBoard>();
		NoticeBoard nBoard = new NoticeBoard();
		nBoard.setnBoardNo(2);
		nBoard.setnBoardTitle("test2");
		nBoard.setnBoardContent("test2 입니다.");
		nBoardfile.setT(nBoard);
		nBoardfile.setBoardNo(nBoardfile.getBoardNo());
		fBoardFile.setType(
				fBoardFile.getT().getClass()
						.getSimpleName()
						.equals("FreeBoard")
						? 1 : 2
		);
		System.out.println(nBoardfile);
	}

}
