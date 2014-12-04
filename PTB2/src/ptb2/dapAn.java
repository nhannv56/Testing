package ptb2;

public class dapAn {
	String flag;
	double x1, x2;

	public dapAn(String flag, int x1, int x2) {
		this.flag = flag;
		this.x1 = x1;
		this.x2 = x2;
	}

	public dapAn() {

	}

	public boolean equals(dapAn b) {
		if (b.flag == Global.flag_VoNghiem)
			return true;
		if (this.flag == b.flag
				&& ((x1 == b.x1 && x2 == b.x2) || (this.flag == b.flag
						&& x1 == b.x2 && x2 == b.x1))) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "dapAn [flag=" + flag + ", x1=" + x1 + ", x2=" + x2 + "]";
	}

}