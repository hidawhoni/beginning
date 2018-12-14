package com.exam.board;

public class BoardSeviceImpl {
	public class BoardServiceImpl implements BoardService {

		@Override
		public ArrayList<BoardVO> boardList() {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			ArrayList<BoardVO> list = new ArrayList<BoardVO>(); 
			Ch99DBManager db = new Ch99DBManager();
			
			try {
				conn = db.dbConn();
				
				String sql = "select bseq, title, regid, regdate from board";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					BoardVO bvo = new BoardVO();
					bvo.setBseq(rs.getInt("bseq"));
					bvo.setTitle(rs.getString("title"));
					bvo.setRegid(rs.getString("regid"));
					bvo.setRegdate(rs.getString("regdate"));
					
					list.add(bvo);				
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
//				db.add(9);
				db.dbClose(rs, pstmt, conn);
			}
			return list;
		}

		@Override
		public int boardInsert(BoardVO bvo) {  //String prmTitle, String prmRegid
			Connection conn = null;
			PreparedStatement pstmt = null;
			int res = 0;
			Ch99DBManager db = new Ch99DBManager();
			try { 
				conn = db.dbConn();
				String sql = "insert into board(bseq, title, regid) values(board_seq.nextval, ?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, bvo.getTitle());
				pstmt.setString(2, bvo.getRegid());
//				pstmt.setString(1, prmTitle);
//				pstmt.setString(2, prmRegid);
				res = pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return res;
		}

		@Override
		public int replyInsert(BoardReplyVO rvo) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int res = 0;
			Ch99DBManager db = new Ch99DBManager();
			try { 
				conn = db.dbConn();
				String sql = "insert into board_reply(rseq, reply, regid, bseq) values(board_reply_seq.nextval, ?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, rvo.getReply());
				pstmt.setString(2, rvo.getRegid());
				pstmt.setInt(3, rvo.getBseq());
				res = pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return res;
		}

		@Override
		public HashMap<String, Object> boardView(int bseq) {
			
			//상세내용 가져오기
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			BoardVO bvo = new BoardVO(); 
			Ch99DBManager db = new Ch99DBManager();
			HashMap<String, Object> map = new HashMap<String, Object>();
			
			try {
				conn = db.dbConn();
				
				//상세내용 : bvo
				String sql = "select bseq, title, regid, regdate from board where bseq=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bseq);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					bvo.setBseq(rs.getInt("bseq"));
					bvo.setTitle(rs.getString("title"));
					bvo.setRegid(rs.getString("regid"));
					bvo.setRegdate(rs.getString("regdate"));				
				}
				
				
				//댓글목록 : rlist
				ArrayList<BoardReplyVO> rlist = new ArrayList<BoardReplyVO>();
				String rsql = "select * from board_reply where bseq=?";
				pstmt = conn.prepareStatement(rsql);
				pstmt.setInt(1, bseq);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					BoardReplyVO rvo = new BoardReplyVO();
					rvo.setRseq(rs.getInt("rseq"));
					rvo.setReply(rs.getString("reply"));
					rvo.setRegid(rs.getString("regid"));
					rvo.setRegdate(rs.getString("regdate"));
					rlist.add(rvo);				
				}
				
				map.put("key_view", bvo);
				map.put("key_rlist", rlist);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				db.dbClose(rs, pstmt, conn);
			}
			
			
			return map;
		}

		@Override
		public BoardVO boardViewVO(int bseq) {
			
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Ch99DBManager db = new Ch99DBManager();
			
			BoardVO bvo = new BoardVO();
			try {
				conn = db.dbConn();
				
				String sql = "select b.*, r.* " + 
						"from board b, board_reply r " + 
						"where b.bseq = r.bseq(+) " + 
						"and b.bseq=?";
				System.out.println(sql);
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bseq);
				rs = pstmt.executeQuery();
				ArrayList<BoardReplyVO> rlist = new ArrayList<BoardReplyVO>();
				while(rs.next()) {
					bvo.setBseq(rs.getInt("bseq"));
					bvo.setTitle(rs.getString("title"));
					bvo.setRegid(rs.getString("regid"));
					bvo.setRegdate(rs.getString("regdate"));
					
						BoardReplyVO rvo = new BoardReplyVO();
						rvo.setRseq(rs.getInt("rseq"));
						rvo.setReply(rs.getString("reply"));
						rlist.add(rvo);	
				}
				bvo.setRlist(rlist);	
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				db.dbClose(rs, pstmt, conn);
			}
			return bvo;
		}


	}


}
