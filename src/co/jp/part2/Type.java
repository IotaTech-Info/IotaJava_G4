package co.jp.part2;

public enum Type {
	Cat {
		public String getType() {// 枚举对象实现抽象方法
			return "CAT";
		}
	},
	Dog {
		public String getType() {// 枚举对象实现抽象方法
			return "Dog";
		}
	},
	Bird {
		public String getType() {// 枚举对象实现抽象方法
			return "Bird";
		}
	};
	public abstract String getType();
}
