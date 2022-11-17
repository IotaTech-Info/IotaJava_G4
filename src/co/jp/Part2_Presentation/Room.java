package co.jp.Part2_Presentation;

public class Room {

		private String no;//room number
		private boolean isuse;// occupied/empty
		@Override
		public String toString() {
			return "Room [no=" + no + ",状態は" + (isuse?"occupied":"empty") + "]";
		}
		public Room(String no, boolean isuse) {
			super();
			this.no = no;
			this.isuse = isuse;
		}
		public String getNo() {
			return no;
		}
		public void setNo(String no) {
			this.no = no;
		}

		public boolean isIsuse() {
			return isuse;
		}
		public void setIsuse(boolean isuse) {
			this.isuse = isuse;
		}
	}


