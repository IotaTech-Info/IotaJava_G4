package co.jp.finalPresentation;

public enum Type {
	Cat {
		public String getType() {// 枚举对象实现抽象方法
			return "CAT";
		}
	},
	Dog {
		public String getType() {// 枚举对象实现抽象方法
			return "DOG";
		}
	},
	Bird {
		public String getType() {// 枚举对象实现抽象方法
			return "BIRD";
		}
	};
	public abstract String getType();
}
